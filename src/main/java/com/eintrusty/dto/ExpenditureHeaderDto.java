package com.eintrusty.dto;

import java.util.Date;

import javax.persistence.Column;

public class ExpenditureHeaderDto {

	
	private String idHeader;
	
	private Double income;
	
	private Double totalOutcome;
	
	private Double residu;
	
	private Date date;
	
	private String status;

	public ExpenditureHeaderDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExpenditureHeaderDto(String idHeader, Double income, Double totalOutcome, Double residu, Date date,
			String status) {
		super();
		this.idHeader = idHeader;
		this.income = income;
		this.totalOutcome = totalOutcome;
		this.residu = residu;
		this.date = date;
		this.status = status;
	}

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
