package org.layz.jit8j.core.pojo.response;

import org.layz.jit8j.core.pojo.BaseEntity;

public class JsonResponse extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8419514464794910464L;
	/**
	 * 异常信息
	 */
	private String respCode;
	/**
	 * 异常编码
	 */
	private String respMsg;
	
	public String getRespCode() {
		return respCode;
	}
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	public String getRespMsg() {
		return respMsg;
	}
	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}
}
