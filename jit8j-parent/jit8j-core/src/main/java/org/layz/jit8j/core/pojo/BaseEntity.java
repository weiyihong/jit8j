package org.layz.jit8j.core.pojo;

import java.io.Serializable;

public class BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2119695793661307225L;

	public static final Integer SUCCESS = 1;
	public static final Integer FAIL = 0;
	public static final String SUCCESS_MSG = "成功";
	public static final String SUCCESS_CODE = "000000";
	public static final String FAIL_UNKNOWN = "系统发生未知异常，请联系管理员";
	public static final String FAIL_UNKNOWN_CODE = "100000";
	
	
	private Integer success;
	
	public Integer getSuccess() {
		return success;
	}
	
	public void setSuccess(Integer success) {
		this.success = success;
	}
}
