package org.layz.jit8j.spring.jdbc.cache;

import java.util.Collection;
import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.Cache;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;

public class Jit8jCacheManager extends SimpleCacheManager{
	private static final Logger LOGGER = LoggerFactory.getLogger(Jit8jCacheManager.class);
	@SuppressWarnings("unchecked")
	@Override
	protected Collection<? extends Cache> loadCaches() {
		return Collections.EMPTY_LIST;
	}
	
	@Override
	protected Cache getMissingCache(String name) {
		LOGGER.info("getMissingCache, name: {}", name);
		return new ConcurrentMapCache(name);
	}
}
