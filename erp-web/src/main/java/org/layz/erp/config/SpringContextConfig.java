package org.layz.erp.config;

import org.layz.hx.core.interfaces.SpringContext;
import org.layz.hx.core.util.SpringContextUtil;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class SpringContextConfig implements SpringContext, ApplicationContextAware {
	private ApplicationContext applicationContext;
	@SuppressWarnings("unchecked")
	@Override
	public <T> T getBean(String name) {
		return (T) applicationContext.getBean(name);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		SpringContextUtil.init(this);
	}
}
