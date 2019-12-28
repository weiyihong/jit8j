package org.layz.erp.validator.systyem;

import org.apache.commons.lang3.StringUtils;
import org.layz.erp.entity.system.User;
import org.layz.hx.core.exception.HxRuntimeException;
import org.springframework.stereotype.Service;

@Service
public class UserValidator {

    /**
     * 会员登录校验
     * @param user
     */
    public void validatorLogin(User user) {
        if(StringUtils.isBlank(user.getUserCode())) {
            throw new HxRuntimeException("请输入用户名！");
        }
        if(StringUtils.isBlank(user.getPassWord())) {
            throw new HxRuntimeException("请输入用密码！");
        }
    }
}
