package com.eintrusty.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="TABLE_EXPENDITURE_HEADER")
public class ExpenditureHeader {
	
	@Id
	@Column(name="ID_HEADER")
	private String idHeader;
	@Column(name="INCOME")
	private Double income;
	@Column(name="TOTAL_OUTCOME")
	private Double totalOutcome;
	@Column(name="RESIDU")
	private Double residu;
	@Column(name="DATE")
	private Date date;
	@Column(name="STATUS")
	private String status;
	public String getIdHeader() {
		return idHeader;
	}
	public void setIdHeader(String idHeader) {
		this.idHeader = idHeader;
	}
	public Double getIncome() {
		return income;
	}
	public void setIncome(Double income) {
		this.income = income;
	}
	public Double getTotalOutcome() {
		return totalOutcome;
	}
	public void setTotalOutcome(Double totalOutcome) {
		this.totalOutcome = totalOutcome;
	}
	public Double getResidu() {
		return residu;
	}
	public void setResidu(Double residu) {
		this.residu = residu;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
