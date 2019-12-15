package org.layz.jit8j.spring.mvc.handler;

import org.layz.jit8j.core.pojo.response.JsonResponse;
import org.layz.jit8j.core.util.ResponseUtil;

public class DefaultExceptionHandler implements ExceptionHandler{

	@Override
	public boolean support(Throwable ex) {
		return ex instanceof Throwable;
	}

	@Override
	public JsonResponse handle(Throwable ex) {
		return ResponseUtil.getFailResponse();
	}

}
