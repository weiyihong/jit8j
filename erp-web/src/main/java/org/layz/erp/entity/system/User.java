package org.layz.erp.entity.system;

import org.layz.hx.core.annotation.HxColumn;
import org.layz.hx.core.annotation.HxTable;
import org.layz.hx.spring.jdbc.entity.AutoLongBaseEntity;

@HxTable(value = "sys_user")
public class User extends AutoLongBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6438242621784693872L;
	@HxColumn(sort = 1)
	private Long defaultRoleId;
	@HxColumn(sort = 2)
	private String userCode;
	@HxColumn(sort = 3)
	private String userName;
	@HxColumn(value = "userPwd",sort = 4)
	private String passWord;
	@HxColumn(sort = 5)
	private Integer sex;

	public Long getDefaultRoleId() {
		return defaultRoleId;
	}
	public void setDefaultRoleId(Long defaultRoleId) {
		this.defaultRoleId = defaultRoleId;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	
}
