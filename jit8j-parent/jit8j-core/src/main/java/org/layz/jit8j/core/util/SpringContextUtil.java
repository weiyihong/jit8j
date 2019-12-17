package org.layz.jit8j.core.util;

import org.layz.jit8j.core.interfaces.SpringContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpringContextUtil {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringContextUtil.class);
	private static SpringContext springContext;
	
	private SpringContextUtil(){
		
	}
	/**
	 * _初始化容器
	 * @param context
	 */
	public static void init(SpringContext context){
		springContext = context;
	}
	/**
	 * _获取Spring容器对象
	 * @param name
	 * @return
	 */
	public static<T> T getBean(String name){
		if(null == springContext) {
			LOGGER.debug("springContext is null");
			return null;
		}
		if(null == name || name.length() < 1) {
			LOGGER.debug("name is blank");
			return null;
		}
		return springContext.getBean(name);
	}
}
