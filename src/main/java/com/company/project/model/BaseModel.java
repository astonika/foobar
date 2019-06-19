package com.company.project.model;

import java.io.Serializable;
import java.util.Date;

public class BaseModel<PK extends Serializable>implements Serializable {

	private PK id;
	private String creator;
	private Date createdDate;
	private String updater;
	private Date updatedDate;

	public PK getId() {
		return id;
	}

	public void setId(PK id) {
		this.id = id;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdater() {
		return updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}
