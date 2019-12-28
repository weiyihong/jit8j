package org.layz.erp.service;

import java.util.List;

import org.layz.hx.core.exception.HxRuntimeException;
import org.layz.hx.core.pojo.Page;
import org.layz.hx.core.pojo.Pageable;
import org.layz.hx.spring.jdbc.repository.BaseDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseServiceImpl<T> implements BaseService<T>{
	private static final Logger LOGGER = LoggerFactory.getLogger(BaseServiceImpl.class);
	
	@Override
	public T findById(Long id) {
		LOGGER.debug("id: {}", id);
		return getDao().findById(id);
	}
	
	@Override
	public Integer persistEntity(T t) {
		if(null == t) {
			LOGGER.info("请传入参数");
			throw new HxRuntimeException("请传入参数");
		}
		return getDao().persistEntity(t);
	}

	@Override
	public Integer deleteByEntity(T t) {
		return getDao().deleteByEntity(t);
	}

	@Override
	public Integer update(T t) {
		if(null == t) {
			LOGGER.info("请传入参数");
			throw new HxRuntimeException("请传入参数");
		}
		return getDao().update(t);
	}

	@Override
	public Integer updateNotnull(T t) {
		if(null == t) {
			LOGGER.info("请传入参数");
			throw new HxRuntimeException("请传入参数");
		}
		return getDao().updateNotnull(t);
	}

	@Override
	public Integer deleteById(Long id) {
		LOGGER.debug("id: {}", id);
		return getDao().deleteById(id);
	}

	@Override
	public List<T> queryByEntity(T t) {
		return getDao().queryByEntity(t);
	}

	@Override
	public List<T> queryByEntity(T t, String orderBy) {
		return getDao().queryByEntity(t, orderBy);
	}

	@Override
	public Page<T> queryPage(T t, Pageable pageable) {
		return getDao().queryPage(t, pageable);
	}
	
	public abstract BaseDao<T> getDao();
}
