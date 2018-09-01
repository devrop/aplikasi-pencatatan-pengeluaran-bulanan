package com.eintrusty.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="TABLE_ROLE")
public class RoleLogin implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 324316847473780517L;
	@Id
	@Column(name="ID_ROLE")
	private String idRole;
	@Column(name="ROLE")
	private String role;
	@Column(name="DESCRIPTION")
	private String description;
	public RoleLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RoleLogin(String idRole, String role, String description) {
		super();
		this.idRole = idRole;
		this.role = role;
		this.description = description;
	}
	public String getIdRole() {
		return idRole;
	}
	public void setIdRole(String idRole) {
		this.idRole = idRole;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
