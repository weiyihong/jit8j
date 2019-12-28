package org.layz.erp.enums;

public enum SessionKey {
	LOGIN_INFO("session_login_info");
	private String value;
	SessionKey(String value){
		this.value = value;
	}
	public String getValue() {
		return value;
	}
}
