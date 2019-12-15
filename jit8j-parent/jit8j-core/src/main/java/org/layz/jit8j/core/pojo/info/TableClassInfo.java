package org.layz.jit8j.core.pojo.info;

import java.io.Serializable;
import java.util.List;

import org.layz.jit8j.core.annotation.Jit8jTable;

public class TableClassInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7583005990125797807L;
	private Class<?> clazz;
	private Jit8jTable table;
	private String id;
	private String tableName;
	private List<FieldColumnInfo> fieldList;
	public Class<?> getClazz() {
		return clazz;
	}
	public void setClazz(Class<?> clazz) {
		this.clazz = clazz;
	}
	public Jit8jTable getTable() {
		return table;
	}
	public void setTable(Jit8jTable table) {
		this.table = table;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public List<FieldColumnInfo> getFieldList() {
		return fieldList;
	}
	public void setFieldList(List<FieldColumnInfo> fieldList) {
		this.fieldList = fieldList;
	}
}
