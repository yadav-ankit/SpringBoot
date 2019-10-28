package com.example.PhoneKart.model.classicmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orderdetails")
public class Orderdetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderNumber;
	
	
	@Column(name = "city")
	private String city;

	@Column(name = "productCode")
	private String productCode;

	@Column(name = "quantityOrdered")
	private String quantityOrdered;

	@Column(name = "priceEach")
	private String priceEach;
	
	
	@Column(name = "orderLineNumber")
	private int orderLineNumber;


	public int getOrderNumber() {
		return orderNumber;
	}


	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getProductCode() {
		return productCode;
	}


	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}


	public String getQuantityOrdered() {
		return quantityOrdered;
	}


	public void setQuantityOrdered(String quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}


	public String getPriceEach() {
		return priceEach;
	}


	public void setPriceEach(String priceEach) {
		this.priceEach = priceEach;
	}


	public int getOrderLineNumber() {
		return orderLineNumber;
	}


	public void setOrderLineNumber(int orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}


}
