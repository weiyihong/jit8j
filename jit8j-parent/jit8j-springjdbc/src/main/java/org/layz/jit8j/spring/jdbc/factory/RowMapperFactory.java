package org.layz.jit8j.spring.jdbc.factory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.layz.jit8j.core.pojo.info.FieldColumnInfo;
import org.layz.jit8j.core.pojo.info.TableClassInfo;
import org.layz.jit8j.core.util.factory.DataReaderFactory;
import org.layz.jit8j.core.util.reader.DataReader;
import org.layz.jit8j.spring.jdbc.exception.Jit8jJdbcRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.RowMapper;

public class RowMapperFactory {
	private static final Logger LOGGER = LoggerFactory.getLogger(RowMapperFactory.class);
	private EntityTableInfoFactory entityTableInfoFactory;
	/**
	 * @param <T>
	 * @param clazz
	 * @return
	 */
	@Cacheable(value = "JDBC_ROWMAPPER")
	public<T> RowMapper<T> getRowMapper(Class<T> clazz){
		if(null == clazz) {
			throw new Jit8jJdbcRuntimeException("class is null");
		}
		TableClassInfo tableClassInfo = entityTableInfoFactory.getTableClassInfo(clazz);
		if(null == tableClassInfo) {
			throw new Jit8jJdbcRuntimeException("tableClassInfo is null");
		}
		List<FieldColumnInfo> fieldList = tableClassInfo.getFieldList();
		if(null == fieldList || fieldList.isEmpty()) {
			throw new Jit8jJdbcRuntimeException("fieldList is empty");
		}
		LOGGER.debug("class: {}", clazz);
		RowMapper<T> rowMapper = new RowMapper<T>() {

			@Override
			public T mapRow(ResultSet rs, int rowNum) throws SQLException {
				DataReader dataReader = DataReaderFactory.getDataReader(rs);
				T t = null;
				try {
					t = clazz.newInstance();
					for (FieldColumnInfo fieldColumnInfo : fieldList) {
						try {
							Object object = dataReader.getObject(rs, fieldColumnInfo);
							object = fieldColumnInfo.getDataformater().format(object, fieldColumnInfo, null);
							object = fieldColumnInfo.getDataConverter().dataConvert(object, null);
							fieldColumnInfo.getMethodSet().invoke(t, object);
						} catch (Exception e) {
							LOGGER.info("set property error, class: {}, fieldName: {}", clazz, fieldColumnInfo.getFieldName());
						}
					}
				} catch (Exception e1) {
					LOGGER.error("newInstance is null, class: {}", clazz);
				}
				return t;
			}
		};
		return rowMapper;
	}
	
	public void setEntityTableInfoFactory(EntityTableInfoFactory entityTableInfoFactory) {
		this.entityTableInfoFactory = entityTableInfoFactory;
	}
}
