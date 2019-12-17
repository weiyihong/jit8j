package org.layz.erp.entity.system;

import org.layz.jit8j.core.annotation.Jit8jColumn;
import org.layz.jit8j.core.annotation.Jit8jTable;
import org.layz.jit8j.spring.jdbc.entity.AutoLongBaseEntity;
@Jit8jTable("sys_system")
public class SystemErp extends AutoLongBaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2806013590109891679L;
	@Jit8jColumn(sort = 1)
	private String sysCode;
	@Jit8jColumn(sort = 2)
	private String sysName;
	@Jit8jColumn(sort = 3)
	private String remark;
	public String getSysCode() {
		return sysCode;
	}
	public void setSysCode(String sysCode) {
		this.sysCode = sysCode;
	}
	public String getSysName() {
		return sysName;
	}
	public void setSysName(String sysName) {
		this.sysName = sysName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
