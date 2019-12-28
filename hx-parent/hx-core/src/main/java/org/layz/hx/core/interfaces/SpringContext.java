package org.layz.hx.core.interfaces;
/**
 * Spring容器接口
 *
 */
public interface SpringContext {
	/**
	 * _获取Spring容器对象
	 * @param name
	 * @return
	 */
	public<T> T getBean(String name);
}
