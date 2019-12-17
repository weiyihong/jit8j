package org.layz.jit8j.core.annotation.support;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.layz.jit8j.core.annotation.Jit8jColumn;
import org.layz.jit8j.core.annotation.Jit8jSupperClass;
import org.layz.jit8j.core.annotation.Jit8jTable;
import org.layz.jit8j.core.pojo.info.FieldColumnInfo;
import org.layz.jit8j.core.pojo.info.TableClassInfo;
import org.layz.jit8j.core.util.converter.DataConverter;
import org.layz.jit8j.core.util.factory.DataConverterFactory;
import org.layz.jit8j.core.util.factory.DataformaterFactory;
import org.layz.jit8j.core.util.formater.Dataformater;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Jit8jTableSupport {
	private static final Logger LOGGER = LoggerFactory.getLogger(Jit8jTableSupport.class);
	/**
	 * _获取领域模型对象
	 * @param clazz
	 * @return
	 */
	public static TableClassInfo getTableClassInfo(Class<?> clazz) {
		LOGGER.info("getTableClassInfo, clazz: {}", clazz);
		Jit8jTable table = null;
		String tableName = null,id = "id";
		if(clazz.isAnnotationPresent(Jit8jTable.class)) {
			LOGGER.debug("obtain Jit8jTable table");
			table = clazz.getAnnotation(Jit8jTable.class);
			tableName = table.value();
			id = table.id();
		}
		if(null == tableName || tableName.length() < 1) {
			tableName = clazz.getSimpleName();
		}
		List<FieldColumnInfo> fieldList = new ArrayList<FieldColumnInfo>();
		obtainFieldList(fieldList,clazz);
		fieldList.sort((o1,o2) -> o1.getColumn().sort() - o2.getColumn().sort());
		
		TableClassInfo persistInfo = new TableClassInfo();
		persistInfo.setTable(table);
		persistInfo.setClazz(clazz);
		persistInfo.setTableName(tableName);
		persistInfo.setId(id);
		persistInfo.setFieldList(fieldList);
		return persistInfo;
	}
	/**
	 * _设置字段信息
	 * @param fieldList
	 * @param clazz
	 */
	private static void obtainFieldList(List<FieldColumnInfo> fieldList, Class<?> clazz) {
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			try {
				if(!field.isAnnotationPresent(Jit8jColumn.class)) {continue;}
				Jit8jColumn column = field.getAnnotation(Jit8jColumn.class);
				Class<?> fieldType = field.getType();
				
				String fieldName = field.getName();
				String setMethodName = String.format("set%s%s", fieldName.substring(0,1).toUpperCase(),fieldName.substring(1));
				String getMethodName = String.format("get%s%s", fieldName.substring(0,1).toUpperCase(),fieldName.substring(1));
				Method methodGet = clazz.getMethod(getMethodName);
				Method methodSet = clazz.getMethod(setMethodName, fieldType);
				
				String columnName = column.value();
				if(columnName.length() < 1) {
					columnName = fieldName;
				}
				
				String formaterType = column.formaterType();
				String formaterName = column.param();
				Dataformater dataformater = DataformaterFactory.getDataformater(formaterType, formaterName);
				
				DataConverter converter = DataConverterFactory.getConverter(fieldType);
				
				FieldColumnInfo fieldInfo = new FieldColumnInfo();
				fieldInfo.setColumn(column);
				fieldInfo.setFieldName(fieldName);
				fieldInfo.setFieldType(fieldType);
				fieldInfo.setMethodGet(methodGet);
				fieldInfo.setMethodSet(methodSet);
				fieldInfo.setColumnName(columnName);
				fieldInfo.setDataformater(dataformater);
				fieldInfo.setDataConverter(converter);
				fieldList.add(fieldInfo);
			} catch (Exception e) {
				LOGGER.error("obtain FieldColumnInfo error,fieldName: {}",field.getName(), e);
			}
		}
		Class<?> superclass = clazz.getSuperclass();
		if(superclass.isAnnotationPresent(Jit8jSupperClass.class)) {
			obtainFieldList(fieldList, superclass);
		}
	}
}
