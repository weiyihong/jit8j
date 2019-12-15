package org.layz.jit8j.spring.jdbc.sqlBuilder;

import org.layz.jit8j.core.pojo.info.TableClassInfo;
import org.layz.jit8j.spring.jdbc.pojo.SqlParam;

public interface SqlBuilder {
	/**
	 * sql构建
	 * @param tableClassInfo
	 * @param param
	 * @return
	 */
	StringBuilder buildCacheSql(TableClassInfo tableClassInfo, Object[] param);
	/**
	 * sql构建
	 * @param cacheSql
	 * @param tableClassInfo
	 * @param param
	 * @return
	 */
	SqlParam buildSql(StringBuilder cacheSql,TableClassInfo tableClassInfo, Object[] param);
}
