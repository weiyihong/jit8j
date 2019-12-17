package org.layz.erp.entity.system;

import org.layz.jit8j.core.annotation.Jit8jColumn;
import org.layz.jit8j.core.annotation.Jit8jTable;
import org.layz.jit8j.spring.jdbc.entity.AutoLongBaseEntity;
@Jit8jTable("sys_user_role")
public class UserRole extends AutoLongBaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Jit8jColumn(sort = 1)
	private Long userId;
	@Jit8jColumn(sort = 2)
	private Long roleId;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
	
}
