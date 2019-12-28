package org.layz.erp.service.system;

import org.layz.erp.entity.system.SystemErp;
import org.layz.erp.repository.jdbc.system.SystemErpDao;
import org.layz.erp.service.BaseService;
import org.layz.erp.service.BaseServiceImpl;
import org.layz.hx.spring.jdbc.repository.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SystemErpServiceImpl extends BaseServiceImpl<SystemErp> implements BaseService<SystemErp>{
	@Autowired
	private SystemErpDao systemErpDao;
	
	@Override
	public BaseDao<SystemErp> getDao() {
		return systemErpDao;
	}

}
