package org.layz.erp.entity.system;

import org.layz.jit8j.core.annotation.Jit8jColumn;
import org.layz.jit8j.core.annotation.Jit8jTable;
import org.layz.jit8j.spring.jdbc.entity.AutoLongBaseEntity;
@Jit8jTable(value = "sys_role")
public class Role extends AutoLongBaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1908676822748416957L;
	@Jit8jColumn(sort = 1)
	private Long sysId;
	@Jit8jColumn(sort = 2)
	private String roleCode;
	@Jit8jColumn(sort = 3)
	private String roleName;
	@Jit8jColumn(sort = 4)
	private Integer roleType;
	@Jit8jColumn(sort = 5)
	private String remark;
	public Long getSysId() {
		return sysId;
	}
	public void setSysId(Long sysId) {
		this.sysId = sysId;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Integer getRoleType() {
		return roleType;
	}
	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
