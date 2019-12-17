package org.layz.erp.entity.system;

import org.layz.jit8j.core.annotation.Jit8jColumn;
import org.layz.jit8j.core.annotation.Jit8jTable;
import org.layz.jit8j.spring.jdbc.entity.AutoLongBaseEntity;
@Jit8jTable("sys_role_menu")
public class RoleMenu extends AutoLongBaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6231513108070666990L;
	@Jit8jColumn(sort = 1)
	private Long roleId;
	@Jit8jColumn(sort = 2)
	private Long menuId;
	
	public Long getRoleId() {
		return roleId;
	}
	
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
	public Long getMenuId() {
		return menuId;
	}
	
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
}
