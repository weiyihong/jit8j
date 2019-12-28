package org.layz.hx.spring.mvc.handler;

import org.layz.hx.core.exception.HxRuntimeException;
import org.layz.hx.core.pojo.response.JsonResponse;
import org.layz.hx.core.util.ResponseUtil;

public class HxExceptionHandler implements ExceptionHandler{

	@Override
	public boolean support(Throwable ex) {
		return ex instanceof HxRuntimeException;
	}

	@Override
	public JsonResponse handle(Throwable ex) {
		HxRuntimeException e = (HxRuntimeException)ex;
		return ResponseUtil.getFailResponse(e.getCode(), e.getMessage());
	}
}
