package com.eintrusty.entity;

public class ExpenditureDetail {
	private Integer idDetail;
	private String idHeader;
	private String nameExpenditure;
	private Double totalSpendingMoney;
	private String notes;
	private Integer status;
	
	public ExpenditureDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExpenditureDetail(Integer idDetail, String idHeader, String nameExpenditure, Double totalSpendingMoney,
			String notes, Integer status) {
		super();
		this.idDetail = idDetail;
		this.idHeader = idHeader;
		this.nameExpenditure = nameExpenditure;
		this.totalSpendingMoney = totalSpendingMoney;
		this.notes = notes;
		this.status = status;
	}
	public Integer getIdDetail() {
		return idDetail;
	}
	public void setIdDetail(Integer idDetail) {
		this.idDetail = idDetail;
	}
	public String getIdHeader() {
		return idHeader;
	}
	public void setIdHeader(String idHeader) {
		this.idHeader = idHeader;
	}
	public String getNameExpenditure() {
		return nameExpenditure;
	}
	public void setNameExpenditure(String nameExpenditure) {
		this.nameExpenditure = nameExpenditure;
	}
	public Double getTotalSpendingMoney() {
		return totalSpendingMoney;
	}
	public void setTotalSpendingMoney(Double totalSpendingMoney) {
		this.totalSpendingMoney = totalSpendingMoney;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	

}
