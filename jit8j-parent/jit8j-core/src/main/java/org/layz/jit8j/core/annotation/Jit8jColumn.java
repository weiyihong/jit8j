package org.layz.jit8j.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.layz.jit8j.core.util.formater.Dataformater;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Jit8jColumn {
	/**
	 * 列名，默认为字段名称
	 */
	String value() default "";
	/**
	 * 下标
	 */
	int index() default 0;
	/**
	 * 排序
	 */
	int sort() default 0;
	/**
	 * 数据格式化类型
	 * DataFormater
	 */
	String formaterType() default Dataformater.DEFAULT;
	/**
	 * 参数
	 */
	String param() default "";
}
