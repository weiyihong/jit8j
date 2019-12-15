package org.layz.jit8j.spring.jdbc.entity;

import org.layz.jit8j.core.annotation.Jit8jColumn;
import org.layz.jit8j.core.annotation.Jit8jSupperClass;
@Jit8jSupperClass
public class AutoLongBaseEntity extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2641209235577591499L;
	@Jit8jColumn(sort = 0)
	private Long id;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
}
