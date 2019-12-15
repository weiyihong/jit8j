package org.layz.jit8j.core.exception;

/**
 * jit8j通用异常
 * @author Administrator
 *
 */
public class Jit8jRuntimeException extends RuntimeException{

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
	
    public Jit8jRuntimeException() {
        super();
    }

    public Jit8jRuntimeException(String message) {
        this.messgae = message;
    }

    public Jit8jRuntimeException(Throwable cause) {
        this(null,cause);
    }
    
    public Jit8jRuntimeException(String message, Throwable cause) {
        this(null, message, cause);
    }
    
    public Jit8jRuntimeException(String code, String message, Throwable cause) {
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
