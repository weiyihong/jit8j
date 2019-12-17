package org.layz.erp.service.system;

import java.util.List;

import org.layz.erp.entity.system.User;
import org.layz.erp.repository.jdbc.system.UserDao;
import org.layz.erp.repository.mapper.system.UserMapper;
import org.layz.erp.service.BaseServiceImpl;
import org.layz.jit8j.core.exception.Jit8jRuntimeException;
import org.layz.jit8j.spring.jdbc.repository.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{
	@Autowired
	private UserDao userDao;
	// @Autowired
	private UserMapper userMapper;
	
	@Override
	public User login(String userCode,String passWord) {
		User user = new User();
		user.setUserCode(userCode);
		user.setPassWord(passWord);
		List<User> entity = userDao.queryByEntity(user);
		if(null == entity || entity.isEmpty()) {
			throw new Jit8jRuntimeException("登录失败，用户名或密码错误");
		}
		return entity.get(0);
	}
	
	@Override
	public User findById(Long id) {
		return userMapper.findById(id);
	}
	@Override
	public BaseDao<User> getDao() {
		return userDao;
	}
}
