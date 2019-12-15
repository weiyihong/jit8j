package org.layz.jit8j.core.util;

import org.layz.jit8j.core.pojo.response.JsonObjectResponse;
import org.layz.jit8j.core.pojo.response.JsonResponse;

public class ResponseUtil {
	private ResponseUtil() {
		
	}
	/**
	 * 获取成功通用返回
	 * @return
	 */
	public static JsonResponse getSuccessResponse() {
		return getSuccessResponse(null);
	}
	
	public static JsonResponse getSuccessResponse(String msg) {
		return getSuccessResponse(null, msg);
	}
	
	public static JsonResponse getSuccessResponse(String code, String msg) {
		if (null == code) {
			code = JsonResponse.SUCCESS_CODE;
		}
		if (null == msg) {
			msg = JsonResponse.SUCCESS_MSG;
		}
		JsonResponse jsonResponse = new JsonResponse();
		jsonResponse.setSuccess(JsonResponse.SUCCESS);
		jsonResponse.setRespCode(code);
		jsonResponse.setRespMsg(msg);
		return jsonResponse;
	}
	
	public static JsonResponse getObjectResponse(Object data) {
		JsonObjectResponse response = new JsonObjectResponse();
		response.setSuccess(JsonObjectResponse.SUCCESS);
		response.setRespCode(JsonObjectResponse.SUCCESS_CODE);
		response.setRespMsg(JsonObjectResponse.SUCCESS_MSG);
		response.setData(data);
		return response;
	}
	/**
	 * 获取失败返回
	 * @return
	 */
	public static JsonResponse getFailResponse() {
		return getFailResponse(null, null);
	}
	
	public static JsonResponse getFailResponse(String msg) {
		return getFailResponse(null, msg);
	}
	
	public static JsonResponse getFailResponse(String code, String msg) {
		if (null == code) {
			code = JsonResponse.FAIL_UNKNOWN_CODE;
		}
		if (null == msg) {
			msg = JsonResponse.FAIL_UNKNOWN;
		}
		JsonResponse jsonResponse = new JsonResponse();
		jsonResponse.setSuccess(JsonResponse.FAIL);
		jsonResponse.setRespCode(code);
		jsonResponse.setRespMsg(msg);
		return jsonResponse;
	}
}
