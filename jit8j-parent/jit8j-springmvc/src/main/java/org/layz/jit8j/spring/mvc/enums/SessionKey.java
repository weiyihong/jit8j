package org.layz.jit8j.spring.mvc.enums;

public enum SessionKey {
	SYS_ID("session_sys_id"),
	USER_CODE("session_user_code"),
	ROLE_ID("session_role_id"),
	ROLE_TYPE("session_role_type");
	private String value;
	private SessionKey(String value){
		this.value = value;
	}
	public String getValue() {
		return value;
	}
}
