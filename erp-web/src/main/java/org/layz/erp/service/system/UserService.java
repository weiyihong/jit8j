package org.layz.erp.service.system;

import org.layz.erp.entity.system.User;
import org.layz.erp.service.BaseService;

public interface UserService extends BaseService<User>{
	/**
	 * 登录
	 * @param userCode
	 * @param passWord
	 * @return
	 */
	void login(String userCode,String passWord);

}
