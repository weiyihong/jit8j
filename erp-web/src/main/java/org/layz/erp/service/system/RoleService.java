package org.layz.erp.service.system;

import org.layz.erp.entity.system.Role;
import org.layz.erp.service.BaseService;

public interface RoleService extends BaseService<Role> {
    /**
     * 会员角色信息查询
     * @param userId
     * @param defaultRoleId
     * @return
     */
    Role findUserRole(Long userId,final Long defaultRoleId);
}
