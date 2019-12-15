package org.layz.jit8j.spring.jdbc.exception;

import org.layz.jit8j.core.exception.Jit8jRuntimeException;

public class Jit8jJdbcRuntimeException extends Jit8jRuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3792637000288178656L;
	public Jit8jJdbcRuntimeException() {
        super();
    }

    public Jit8jJdbcRuntimeException(String message) {
        super(message);
    }

    public Jit8jJdbcRuntimeException(Throwable cause) {
    	super(null,cause);
    }
    
    public Jit8jJdbcRuntimeException(String message, Throwable cause) {
    	super(null, message, cause);
    }
    
    public Jit8jJdbcRuntimeException(String code, String message, Throwable cause) {
        super(code, message, cause);
    }
}
