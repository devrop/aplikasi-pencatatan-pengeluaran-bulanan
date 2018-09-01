package com.eintrusty.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TABLE_USERLOGIN",schema="public")
public class UserLogin implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3319504756486839341L;
	@Id
	@Column(name="ID_USERNAME")
	private String id;
	@Column(name="USERNAME")
	private String username;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="")
	private String role;
	@Column(name="ENABLED")
	private String enabled;
	@Column(name="CREATED_DATE")
	private Date createdDate;
	@Column(name="CREATED_BY")
	private String createdBy;
	@Column(name="UPDATED_DATE")
	private Date updatedDate;
	@Column(name="UPDATED_BY")
	private String updatedBy;
	
	
	public UserLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserLogin(String id, String username, String password, String role, String enabled, Date createdDate,
			String createdBy, Date updatedDate, String updatedBy) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.enabled = enabled;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updatedDate = updatedDate;
		this.updatedBy = updatedBy;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	
	

}
