package org.layz.erp.repository.jdbc.system;

import org.layz.erp.entity.system.Role;
import org.layz.erp.enums.type.ErpDisable;
import org.layz.hx.spring.jdbc.repository.BaseDao;

import java.util.List;

public interface RoleDao extends BaseDao<Role> {
    /**
     * 查找用户角色信息
     * @param userId
     * @param disable
     * @return
     */
    List<Role> findUserRole(Long userId, ErpDisable disable);
}
