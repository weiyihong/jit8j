package org.layz.jit8j.spring.jdbc.sqlBuilder;

import org.layz.jit8j.core.pojo.info.TableClassInfo;
import org.layz.jit8j.spring.jdbc.pojo.SqlParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;

public class QueryByEntitySqlBuilder extends AbstractSqlBuilder{
	private static final Logger LOGGER = LoggerFactory.getLogger(QueryByEntitySqlBuilder.class);
	@Override
	@Cacheable(value = "JDBC_CACHE_SQL",key = "'QUERY_BY_ENTITY_' + #p0.clazz")
	public StringBuilder buildCacheSql(TableClassInfo tableClassInfo, Object[] param) {
		LOGGER.info("buildCacheSql,class: {}", tableClassInfo.getClazz());
		StringBuilder stringBuilder = builderSelect(tableClassInfo);
		return stringBuilder;
	}

	@Override
	public SqlParam buildSql(StringBuilder cacheSql, TableClassInfo tableClassInfo, Object[] param) {
		return buildWhereSql(cacheSql, tableClassInfo, param);
	}

}
