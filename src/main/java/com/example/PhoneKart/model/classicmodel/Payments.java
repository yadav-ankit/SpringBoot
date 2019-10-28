package com.example.PhoneKart.model.classicmodel;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payments")
public class Payments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerNumber;
	
	
	@Column(name = "checkNumber")
	private String checkNumber;

	@Column(name = "paymentDate")
	private Date paymentDate;
	
	
	@Column(name = "amount")
	private int amount;


	public int getCustomerNumber() {
		return customerNumber;
	}


	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}


	public String getCheckNumber() {
		return checkNumber;
	}


	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}


	public Date getPaymentDate() {
		return paymentDate;
	}


	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}

	
}
