package org.layz.erp.repository.jdbc.system;

import org.layz.erp.entity.system.Role;
import org.layz.erp.enums.type.ErpDisable;
import org.layz.hx.spring.jdbc.repository.BaseDaoImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoleDaoImpl extends BaseDaoImpl<Role> implements RoleDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(RoleDaoImpl.class);
    @Override
    public List<Role> findUserRole(Long userId, ErpDisable disable) {
        LOGGER.debug("userid,disable: {},{}",userId,disable.getValue());
        String sql = "select r.id,r.sysId,r.roleType from sys_role r, sys_user_role ur where r.id = ur.roleId and ur.userId = ? and r.deleted = ?";
        RowMapper<Role> rowMapper = getRowMapper();
        return getJdbcTemplate().query(sql, rowMapper, userId, disable.getValue());
    }
}
