package org.layz.jit8j.spring.mvc.handler;

import org.layz.jit8j.core.exception.Jit8jRuntimeException;
import org.layz.jit8j.core.pojo.response.JsonResponse;
import org.layz.jit8j.core.util.ResponseUtil;

public class Jit8jExceptionHandler implements ExceptionHandler{

	@Override
	public boolean support(Throwable ex) {
		return ex instanceof Jit8jRuntimeException;
	}

	@Override
	public JsonResponse handle(Throwable ex) {
		Jit8jRuntimeException e = (Jit8jRuntimeException)ex;
		return ResponseUtil.getFailResponse(e.getCode(), e.getMessage());
	}
}
