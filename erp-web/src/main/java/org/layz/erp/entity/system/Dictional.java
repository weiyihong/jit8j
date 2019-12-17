package org.layz.erp.entity.system;

import org.layz.jit8j.core.annotation.Jit8jColumn;
import org.layz.jit8j.core.annotation.Jit8jTable;
import org.layz.jit8j.spring.jdbc.entity.AutoLongBaseEntity;
@Jit8jTable("sys_dic")
public class Dictional extends AutoLongBaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5091317816932300054L;
	@Jit8jColumn(value = "sysId", sort = 1)
	private Long sysId;
	@Jit8jColumn(value = "dicCode", sort = 2)
	private String code;
	@Jit8jColumn(value = "parentCode", sort = 3)
	private String parentCode;
	@Jit8jColumn(value = "dicKey", sort = 4)
	private String key;
	@Jit8jColumn(value = "dicValue", sort = 5)
	private String value;
	@Jit8jColumn(value = "dicSort", sort = 6)
	private Integer sort;
	@Jit8jColumn(value = "dicType", sort = 7)
	private Integer type;
	@Jit8jColumn(value = "remark", sort = 8)
	private String remark;
	public Long getSysId() {
		return sysId;
	}
	public void setSysId(Long sysId) {
		this.sysId = sysId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getParentCode() {
		return parentCode;
	}
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
