package org.layz.erp.entity.system;

import org.layz.jit8j.core.annotation.Jit8jColumn;
import org.layz.jit8j.core.annotation.Jit8jTable;
import org.layz.jit8j.spring.jdbc.entity.AutoLongBaseEntity;
@Jit8jTable("sys_system_menu")
public class SystemMenu extends AutoLongBaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1091083131387094580L;
	@Jit8jColumn(sort = 1)
	private Long sysId;
	@Jit8jColumn(sort = 2)
	private Long menuId;
	
	public Long getSysId() {
		return sysId;
	}
	
	public Long getMenuId() {
		return menuId;
	}
	
	public void setSysId(Long sysId) {
		this.sysId = sysId;
	}
	
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
}
