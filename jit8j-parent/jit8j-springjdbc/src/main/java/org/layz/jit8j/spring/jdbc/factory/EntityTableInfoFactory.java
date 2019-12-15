package org.layz.jit8j.spring.jdbc.factory;

import org.layz.jit8j.core.annotation.support.Jit8jTableSupport;
import org.layz.jit8j.core.pojo.info.TableClassInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;

public class EntityTableInfoFactory {
	private static final Logger LOGGER = LoggerFactory.getLogger(EntityTableInfoFactory.class);
	@Cacheable(value = "JDBC_TABLE_CLASS_INFO")
	public TableClassInfo getTableClassInfo(Class<?> clazz) {
		if(null == clazz) {
			LOGGER.debug("class is null");
			return null;
		}
		return Jit8jTableSupport.getTableClassInfo(clazz);
	}
}
