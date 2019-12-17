package org.layz.erp.service;

import java.util.List;

import org.layz.jit8j.core.pojo.Page;
import org.layz.jit8j.core.pojo.Pageable;

public interface BaseService<T> {
	/**
	 * @param t
	 * @return
	 */
	Integer persistEntity(T t);
	/**
	 * 
	 * @param t
	 * @return
	 */
	Integer deleteByEntity(T t);
	/**
	 * _更新所有字段
	 * @param t
	 * @return
	 */
	Integer update(T t);
	/**
	 * _更新非空字段
	 * @param t
	 * @return
	 */
	Integer updateNotnull(T t);
	/**
	 * 
	 * @param id
	 * @return
	 */
	Integer deleteById(Long id);
	/**
	 * _根据id查询
	 * @param id
	 * @return
	 */
	T findById(Long id);
	/**
	 * _根据条件查查
	 * @param t
	 * @return
	 */
	List<T> queryByEntity(T t);
	
	/**
	 * _根据条件查查
	 * @param t
	 * @return
	 */
	List<T> queryByEntity(T t, String orderBy);
	/**
	 * _分页查询
	 * @param t
	 * @param pageable
	 * @return
	 */
	Page<T> queryPage(T t, Pageable pageable);
}
