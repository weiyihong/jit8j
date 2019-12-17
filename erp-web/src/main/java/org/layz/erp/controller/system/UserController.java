package org.layz.erp.controller.system;

import org.layz.erp.entity.system.User;
import org.layz.erp.service.system.UserService;
import org.layz.jit8j.core.pojo.response.JsonResponse;
import org.layz.jit8j.core.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/system/user")
public class UserController {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	/**
	 * 会员登录
	 * @param user
	 * @return
	 */
	@GetMapping("/login")
	public JsonResponse login(String userCode,String passWord) {
		LOGGER.debug("userCode: {}", userCode);
		User res = userService.login(userCode,passWord);
		return ResponseUtil.getObjectResponse(res);
	}
	
	@GetMapping("/findById")
	public JsonResponse findById(Long id) {
		LOGGER.debug("id: {}", id);
		User res = userService.findById(id);
		return ResponseUtil.getObjectResponse(res);
	}
}
