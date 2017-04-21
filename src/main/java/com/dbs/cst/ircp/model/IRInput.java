package com.dbs.cst.ircp.model;

import java.math.BigDecimal;
import java.util.Date;

public class IRInput {
	private String nric;
	private String caseId;
	private Integer taxType;
	private String customerName;
	private BigDecimal amountDue;
	private Date appointmentDate;
	private Date releaseDate;
	private String spaces;

	public IRInput() {
	}
	
	public IRInput(String nric, String caseId, Integer taxType, String customerName, BigDecimal amountDue,
			Date appointmentDate, Date releaseDate, String spaces) {
		this.nric = nric;
		this.caseId = caseId;
		this.taxType = taxType;
		this.customerName = customerName;
		this.amountDue = amountDue;
		this.appointmentDate = appointmentDate;
		this.releaseDate = releaseDate;
		this.spaces = spaces;
	}

	public String getNric() {
		return nric;
	}

	public void setNric(String nric) {
		this.nric = nric;
	}

	public String getCaseId() {
		return caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public Integer getTaxType() {
		return taxType;
	}

	public void setTaxType(Integer taxType) {
		this.taxType = taxType;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public BigDecimal getAmountDue() {
		return amountDue;
	}

	public void setAmountDue(BigDecimal amountDue) {
		this.amountDue = amountDue;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getSpaces() {
		return spaces;
	}

	public void setSpaces(String spaces) {
		this.spaces = spaces;
	}

	@Override
	public String toString() {
		return "IRInput [nric=" + nric + ", caseId=" + caseId + ", taxType=" + taxType + ", customerName="
				+ customerName + ", amountDue=" + amountDue + ", appointmentDate=" + appointmentDate + ", releaseDate="
				+ releaseDate + ", spaces=" + spaces + "]";
	}

}
