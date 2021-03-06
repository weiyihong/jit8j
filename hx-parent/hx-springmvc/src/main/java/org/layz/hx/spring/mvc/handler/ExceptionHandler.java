package org.layz.hx.spring.mvc.handler;

import org.layz.hx.core.pojo.response.JsonResponse;

public interface ExceptionHandler {
	/**
	 * _支持的异常类型
	 * @param ex
	 * @return
	 */
	public boolean support(Throwable ex);
	/**
	 * _异常处理
	 * @param ex
	 * @return
	 */
	public JsonResponse handle(Throwable ex);

}
