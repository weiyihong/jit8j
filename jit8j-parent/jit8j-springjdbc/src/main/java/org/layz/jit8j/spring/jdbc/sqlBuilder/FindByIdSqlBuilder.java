package org.layz.jit8j.spring.jdbc.sqlBuilder;

import org.layz.jit8j.core.pojo.info.TableClassInfo;
import org.layz.jit8j.spring.jdbc.pojo.SqlParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;

public class FindByIdSqlBuilder extends AbstractSqlBuilder{
	private static final Logger LOGGER = LoggerFactory.getLogger(FindByIdSqlBuilder.class);
	@Override
	@Cacheable(value = "JDBC_CACHE_SQL",key = "'FINDBYID_' + #p0.clazz")
	public StringBuilder buildCacheSql(TableClassInfo tableClassInfo, Object[] param) {
		LOGGER.info("buildCacheSql,class: {}", tableClassInfo.getClazz());
		StringBuilder stringBuilder = builderSelect(tableClassInfo);
		return stringBuilder.append(" where ")
			.append(tableClassInfo.getId())
			.append(" = ?");
	}

	@Override
	public SqlParam buildSql(StringBuilder cacheSql, TableClassInfo tableClassInfo, Object[] param) {
		SqlParam sqlParam = new SqlParam();
		sqlParam.setSql(cacheSql.toString());
		sqlParam.setArgs(param);
		return sqlParam;
	}

}
