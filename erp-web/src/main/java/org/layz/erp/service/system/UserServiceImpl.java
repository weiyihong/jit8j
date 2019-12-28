package org.layz.erp.service.system;

import java.util.List;

import org.layz.erp.entity.system.Role;
import org.layz.erp.entity.system.User;
import org.layz.erp.entity.system.dto.UserDto;
import org.layz.erp.enums.SessionKey;
import org.layz.erp.enums.type.ErpDisable;
import org.layz.erp.repository.jdbc.system.UserDao;
import org.layz.erp.service.BaseServiceImpl;
import org.layz.hx.core.exception.HxRuntimeException;
import org.layz.hx.spring.jdbc.repository.BaseDao;
import org.layz.hx.spring.mvc.util.RequestUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{
	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	private UserDao userDao;
	@Autowired
	private RoleService roleService;
	
	@Override
	public void login(String userCode,String passWord) {
		LOGGER.debug("userCode: {}", userCode);
		User user = findLoginUser(userCode,passWord);
		if(null == user) {
			throw new HxRuntimeException("登录失败，用户名或密码错误");
		}
		if (!ErpDisable.ENABLE.getValue().equals(user.getDeleted())) {
			throw new HxRuntimeException("登录失败，您的账户已失效");
		}
		Role role = roleService.findUserRole(user.getId(),user.getDefaultRoleId());
		if(null == role) {
			throw new HxRuntimeException("登录失败，您的权限不足");
		}
		setLoginInfo(user,role);
	}

	@Override
	public BaseDao<User> getDao() {
		return userDao;
	}
	/**
	 * 设置登录信息
	 * @param user
	 * @param role
	 */
	private void setLoginInfo(User user,Role role){
		LOGGER.debug("userId: {}", user.getId());
		UserDto userDto = new UserDto();
		userDto.setUserId(user.getId());
		userDto.setRoleId(role.getId());
		userDto.setRoleType(role.getRoleType());
		userDto.setSysId(role.getSysId());
		RequestUtil.setSessionAttribute(SessionKey.LOGIN_INFO.getValue(),userDto);
	}
	/**
	 * 用户信息查询
	 * @param userCode
	 * @param passWord
	 * @return
	 */
	private User findLoginUser(String userCode,String passWord){
		LOGGER.debug("userCode: {}", userCode);
		User param = new User();
		param.setUserCode(userCode.trim());
		param.setPassWord(passWord.trim());
		List<User> userList = userDao.queryByEntity(param);
		if(null == userList || userList.isEmpty()) {
			return null;
		}
		return userList.get(0);
	}
}
