package com.bmq.coresv.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * 
 *
 */
@MappedSuperclass
public class AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1113841298935071344L;
	@Column(name = "UPDT_DT")
	@JsonIgnore
	private Timestamp updatedDate;

	@Column(name = "UPDT_BY")
	@JsonIgnore
	private String updatedBy;

	@Column(name = "CREAT_DT")
	@JsonIgnore
	private Timestamp createdDate;

	@Column(name = "CREAT_BY")
	@JsonIgnore
	private String createdBy;

	@PrePersist
	void createdAt() {
		this.updatedDate = this.createdDate =  new Timestamp(System.currentTimeMillis());
	}

	@PreUpdate
	void updatedAt() {
		this.updatedDate = new Timestamp(System.currentTimeMillis());
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
