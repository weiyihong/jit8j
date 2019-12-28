package org.layz.hx.core.exception;

/**
 * 通用异常
 */
public class HxRuntimeException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2748181292439428383L;
	/**
	 * 异常信息
	 */
	private String messgae;
	/**
	 * 异常编码
	 */
	private String code;
	
    public HxRuntimeException() {
        super();
    }

    public HxRuntimeException(String message) {
        this.messgae = message;
    }

    public HxRuntimeException(Throwable cause) {
        this(null,cause);
    }
    
    public HxRuntimeException(String message, Throwable cause) {
        this(null, message, cause);
    }
    
    public HxRuntimeException(String code, String message, Throwable cause) {
        super(cause);
        this.code = code;
        this.messgae = message;
    }

    @Override
    public String getMessage() {
    	return this.messgae;
    }
    
    public String getCode() {
		return code;
	}
    
    public void setCode(String code) {
		this.code = code;
	}
}
