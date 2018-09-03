package com.eintrusty.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TABLE_EXPENDITURE_DETAIL")
public class ExpenditureDetail {
	@Id
	@Column(name="ID_DETAIL")
	private String idDetail;
	@Column(name="ID_HEADER")
	private String idHeader;
	@Column(name="NAME_EXPENDITURE")
	private String nameExpenditure;
	@Column(name="TOTAL_SPENDING_MONEY")
	private Double totalSpendingMoney;
	@Column(name="NOTES")
	private String notes;
	@Column(name="STATUS")
	private String status;
	
	public ExpenditureDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExpenditureDetail(String idDetail, String idHeader, String nameExpenditure, Double totalSpendingMoney,
			String notes, String status) {
		super();
		this.idDetail = idDetail;
		this.idHeader = idHeader;
		this.nameExpenditure = nameExpenditure;
		this.totalSpendingMoney = totalSpendingMoney;
		this.notes = notes;
		this.status = status;
	}
	public String getIdDetail() {
		return idDetail;
	}
	public void setIdDetail(String idDetail) {
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
