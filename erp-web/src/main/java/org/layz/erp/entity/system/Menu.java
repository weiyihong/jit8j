package org.layz.erp.entity.system;

import org.layz.jit8j.core.annotation.Jit8jColumn;
import org.layz.jit8j.core.annotation.Jit8jTable;
import org.layz.jit8j.spring.jdbc.entity.AutoLongBaseEntity;
@Jit8jTable("sys_menu")
public class Menu extends AutoLongBaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8104190755819299633L;
	@Jit8jColumn(value = "parentId",sort = 1)
	private Long parentId;
	@Jit8jColumn(value = "menuCode",sort = 2)
	private String code;
	@Jit8jColumn(value = "menuName",sort = 3)
	private String name;
	@Jit8jColumn(value = "menuType",sort = 4)
	private Integer type;
	@Jit8jColumn(value = "menuSort",sort = 5)
	private Integer sort;
	@Jit8jColumn(value = "menuIcon",sort = 6)
	private String icon;
	@Jit8jColumn(value = "remark",sort = 7)
	private String remark;
	@Jit8jColumn(value = "menuUrl",sort = 8)
	private String url;
	@Jit8jColumn(value = "helpUrl",sort = 9)
	private String helpUrl;
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getHelpUrl() {
		return helpUrl;
	}
	public void setHelpUrl(String helpUrl) {
		this.helpUrl = helpUrl;
	}
	
}
