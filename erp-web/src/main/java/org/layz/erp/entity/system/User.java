package org.layz.erp.entity.system;

import org.layz.jit8j.core.annotation.Jit8jColumn;
import org.layz.jit8j.core.annotation.Jit8jTable;
import org.layz.jit8j.spring.jdbc.entity.AutoLongBaseEntity;
@Jit8jTable(value = "sys_user")
public class User extends AutoLongBaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6438242621784693872L;
	@Jit8jColumn(sort = 1)
	private Long sysId;
	@Jit8jColumn(sort = 2)
	private String userCode;
	@Jit8jColumn(sort = 3)
	private String userName;
	@Jit8jColumn(value = "userPwd",sort = 4)
	private String passWord;
	@Jit8jColumn(sort = 5)
	private Integer sex;
	
	public Long getSysId() {
		return sysId;
	}
	public void setSysId(Long sysId) {
		this.sysId = sysId;
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
