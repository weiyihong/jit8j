package org.layz.jit8j.spring.jdbc.factory;

import java.util.Map;

import org.layz.jit8j.core.pojo.info.TableClassInfo;
import org.layz.jit8j.spring.jdbc.pojo.SqlParam;
import org.layz.jit8j.spring.jdbc.sqlBuilder.SqlBuilder;

public class SqlBuildFactory {
	private EntityTableInfoFactory entityTableInfoFactory;
	private Map<String, SqlBuilder> store;
	
	public SqlParam buildSql(Class<?> clazz,String key, Object... param) {
		TableClassInfo tableClassInfo = entityTableInfoFactory.getTableClassInfo(clazz);
		SqlBuilder builder = store.get(key);
		StringBuilder sqlBuilder = builder.buildCacheSql(tableClassInfo, param);
		SqlParam sqlParam = builder.buildSql(sqlBuilder,tableClassInfo,param);
		return sqlParam;
	}
	
	public void setEntityTableInfoFactory(EntityTableInfoFactory entityTableInfoFactory) {
		this.entityTableInfoFactory = entityTableInfoFactory;
	}
	
	public void setStore(Map<String, SqlBuilder> store) {
		this.store = store;
	}
}
