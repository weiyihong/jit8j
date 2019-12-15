package org.layz.jit8j.spring.mvc.util;

import javax.servlet.http.HttpServletRequest;

import org.layz.jit8j.spring.mvc.enums.SessionKey;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class UserContext {
	/**
	 * 获取用户访问的url
	 * @return
	 */
	public static String getURI(){
		HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		return req.getRequestURI();
	}
	
	/**
	 * 获取用户信息
	 * @return
	 */
	public static void setRoleId(Long roleId) {
		HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		req.getSession().setAttribute(SessionKey.ROLE_ID.getValue(),roleId);
	}
	/**
	 * 退出登录
	 */
	public static void logOut(){
		HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		req.getSession().removeAttribute(SessionKey.SYS_ID.getValue());
		req.getSession().removeAttribute(SessionKey.ROLE_ID.getValue());
		req.getSession().removeAttribute(SessionKey.USER_CODE.getValue());
		req.getSession().removeAttribute(SessionKey.ROLE_TYPE.getValue());
	}
	/**
	 * 获取获取客户端IP
	 * @return
	 */
	public static String getRequestIp() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_CLIENT_IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}  
		return ip;
	}
	
}
