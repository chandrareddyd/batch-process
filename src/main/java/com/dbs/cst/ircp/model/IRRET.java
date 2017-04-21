package com.dbs.cst.ircp.model;

import java.math.BigDecimal;
import java.util.Date;

public class IRRET {
	private String recordType;
	private Date returnDate;
	private Integer totalRecords;
	private BigDecimal totalAmount;
	private String spaces;

	public String getRecordType() {
		return recordType;
	}

	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Integer getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getSpaces() {
		return spaces;
	}

	public void setSpaces(String spaces) {
		this.spaces = spaces;
	}

	@Override
	public String toString() {
		return "IRRET [recordType=" + recordType + ", returnDate=" + returnDate + ", totalRecords=" + totalRecords
				+ ", totalAmount=" + totalAmount + ", spaces=" + spaces + "]";
	}
}
