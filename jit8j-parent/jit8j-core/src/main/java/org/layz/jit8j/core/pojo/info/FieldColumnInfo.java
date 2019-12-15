package org.layz.jit8j.core.pojo.info;

import org.layz.jit8j.core.annotation.Jit8jColumn;

public class FieldColumnInfo extends FieldInfo{
	/**
	 * 
	 */
	private static final long serialVersionUID = -691137215067736228L;
	private Jit8jColumn column;
	private String columnName;
	
	public Jit8jColumn getColumn() {
		return column;
	}
	
	public void setColumn(Jit8jColumn column) {
		this.column = column;
	}
	
	public String getColumnName() {
		return columnName;
	}
	
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
}
