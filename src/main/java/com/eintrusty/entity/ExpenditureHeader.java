package com.eintrusty.entity;

import java.util.Date;

public class ExpenditureHeader {
	
	private String idHeader;
	private Double income;
	private Double totalOutcome;
	private Double residu;
	private Date date;
	private Integer status;
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
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
	

}
