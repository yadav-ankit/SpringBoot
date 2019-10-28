package com.example.PhoneKart.model.classicmodel;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderNumber;
	
	
	@Column(name = "orderDate")
	private Date orderDate;

	@Column(name = "requiredDate")
	private Date requiredDate;
	
	@Column(name = "shippedDate")
	private Date shippedDate;

	@Column(name = "status")
	private String status;

	@Column(name = "comments")
	private String comments;
	
	
	@Column(name = "customerNumber")
	private int customerNumber;


	public int getOrderNumber() {
		return orderNumber;
	}


	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	public Date getRequiredDate() {
		return requiredDate;
	}


	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}


	public Date getShippedDate() {
		return shippedDate;
	}


	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}

}
