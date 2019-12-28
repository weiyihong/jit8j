package org.layz.erp.controller.system;

import org.layz.erp.entity.system.User;
import org.layz.erp.service.system.UserService;
import org.layz.erp.validator.systyem.UserValidator;
import org.layz.hx.core.pojo.response.JsonResponse;
import org.layz.hx.core.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/system/user")
public class UserController {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	@Autowired
	private UserValidator userValidator;
	/**
	 * 会员登录HxTableSupport
	 * @param user
	 * @return
	 */
	@PostMapping("/login")
	public JsonResponse login(@RequestBody User user) {
		LOGGER.debug("userCode: {}", user.getUserCode());
		userValidator.validatorLogin(user);
		userService.login(user.getUserCode(),user.getPassWord());
		return ResponseUtil.getSuccessResponse();
	}

}
