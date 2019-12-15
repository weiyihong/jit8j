package org.layz.jit8j.spring.jdbc.sqlBuilder;

import org.layz.jit8j.core.pojo.info.TableClassInfo;
import org.layz.jit8j.spring.jdbc.pojo.SqlParam;
import org.springframework.cache.annotation.Cacheable;

public class DeleteByIdSqlBuilder extends AbstractSqlBuilder{

	@Override
	@Cacheable(value = "JDBC_CACHE_SQL",key = "'DELETEBYID_' + #p0.clazz")
	public StringBuilder buildCacheSql(TableClassInfo tableClassInfo, Object[] param) {
		return new StringBuilder("delete from ")
				.append(tableClassInfo.getTableName())
				.append(" where ")
				.append(tableClassInfo.getId())
				.append(" = ? ;");
	}

	@Override
	public SqlParam buildSql(StringBuilder cacheSql, TableClassInfo tableClassInfo, Object[] param) {
		SqlParam sqlParam = new SqlParam();
		sqlParam.setSql(cacheSql.toString());
		return sqlParam;
	}

}
