package org.layz.erp.repository.mapper.system;

import org.layz.erp.entity.system.User;

public interface UserMapper {
	/**
	 * 
	 * @param id
	 * @return
	 */
	User findById(Long id);
}
