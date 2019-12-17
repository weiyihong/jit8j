package org.layz.erp.config;

import javax.annotation.PostConstruct;

import org.layz.jit8j.core.interfaces.SpringContext;
import org.layz.jit8j.core.util.SpringContextUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class SpringContextConfig implements SpringContext{
	@Autowired
	private ApplicationContext applicationContext;
	@PostConstruct
	public void init() {
		SpringContextUtil.init(this);
	}
	@SuppressWarnings("unchecked")
	@Override
	public <T> T getBean(String name) {
		return (T) applicationContext.getBean(name);
	}

}
