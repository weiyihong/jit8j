package org.layz.erp.service.system;

import org.layz.erp.entity.system.Role;
import org.layz.erp.enums.type.ErpDisable;
import org.layz.erp.repository.jdbc.system.RoleDao;
import org.layz.erp.service.BaseServiceImpl;
import org.layz.hx.spring.jdbc.repository.BaseDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl extends BaseServiceImpl<Role> implements RoleService {
    private static final Logger LOGGER = LoggerFactory.getLogger(RoleServiceImpl.class);
    @Autowired
    private RoleDao roleDao;
    @Override
    public Role findUserRole(Long userId, final Long defaultRoleId) {
        LOGGER.debug("userId: {}, defaultRoleId:{}", userId, defaultRoleId);
        List<Role> roleList = roleDao.findUserRole(userId, ErpDisable.ENABLE);
        if(null == roleList || roleList.isEmpty()) {
            LOGGER.info("userRole is empty: userId {}", userId);
            return null;
        }
        Role role = roleList.stream()
                .filter(o -> o.getId().equals(defaultRoleId))
                .findAny().orElse(roleList.get(0));
        return role;
    }

    @Override
    public BaseDao<Role> getDao() {
        return roleDao;
    }
}
