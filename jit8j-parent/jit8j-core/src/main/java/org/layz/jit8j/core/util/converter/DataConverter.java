package org.layz.jit8j.core.util.converter;

import java.util.Map;

public interface DataConverter {
	/**
	 * 支持的数据类型
	 * @param clazz
	 * @return
	 * <li> true -> 支持
	 * <li> false -> 不支持
	 */
	boolean support(Class<?> clazz);
	/**
	 * 数据格式化方法
	 * @param value 需要数据转化的参数
	 * @param param 转化需要的其它参数
	 * @throws Exception
	 * @return
	 */
	Object dataConvert(Object value, Map<Object, Object> param) throws Exception;
	/**
	 * 抛出异常的默认值
	 * @return
	 */
	default Object defaultValue(){
		return null;
	}
}
