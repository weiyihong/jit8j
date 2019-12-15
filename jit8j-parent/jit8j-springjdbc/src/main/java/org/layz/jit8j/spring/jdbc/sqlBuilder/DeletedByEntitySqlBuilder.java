package org.layz.jit8j.spring.jdbc.sqlBuilder;

import org.layz.jit8j.core.pojo.info.TableClassInfo;
import org.layz.jit8j.spring.jdbc.pojo.SqlParam;

public class DeletedByEntitySqlBuilder extends AbstractSqlBuilder{

	@Override
	public SqlParam buildSql(StringBuilder cacheSql, TableClassInfo tableClassInfo, Object[] param) {
		cacheSql = new StringBuilder("delete from ").append(tableClassInfo.getTableName());
		return buildWhereSql(cacheSql, tableClassInfo, param);
	}

}
