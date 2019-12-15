package org.layz.jit8j.spring.jdbc.entity;

import java.io.Serializable;
import java.util.Date;

import org.layz.jit8j.core.annotation.Jit8jColumn;
import org.layz.jit8j.core.annotation.Jit8jSupperClass;
@Jit8jSupperClass
public class BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8053568662236406287L;
	@Jit8jColumn(sort = 101)
	private Integer deleted;
	@Jit8jColumn(sort = 102)
	private Long createdBy;
	@Jit8jColumn(sort = 103)
	private Long lastModifiedBy;
	@Jit8jColumn(sort = 104)
	private Date createdDate;
	@Jit8jColumn(sort = 105)
	private Date lastModifiedDate;
	public Integer getDeleted() {
		return deleted;
	}
	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}
	public Long getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}
	public Long getLastModifiedBy() {
		return lastModifiedBy;
	}
	public void setLastModifiedBy(Long lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
}
