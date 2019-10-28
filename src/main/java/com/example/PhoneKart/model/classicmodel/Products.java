package com.example.PhoneKart.model.classicmodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Products {

	@Id
	private String productCode;
	
	
	@Column(name = "productName")
	private String productName;

	@Column(name = "productLine")
	private String productLine;

	@Column(name = "productScale")
	private String productScale;

	@Column(name = "productVendor")
	private String productVendor;
	
	
	@Column(name = "productDescription")
	private String productDescription;


	@Column(name = "quantityInStock")
	private int quantityInStock;

	
	@Column(name = "buyPrice")
	private int buyPrice;
	
	@Column(name = "MSRP")
	private int MSRP;

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductLine() {
		return productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public String getProductScale() {
		return productScale;
	}

	public void setProductScale(String productScale) {
		this.productScale = productScale;
	}

	public String getProductVendor() {
		return productVendor;
	}

	public void setProductVendor(String productVendor) {
		this.productVendor = productVendor;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public int getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(int buyPrice) {
		this.buyPrice = buyPrice;
	}

	public int getMSRP() {
		return MSRP;
	}

	public void setMSRP(int mSRP) {
		MSRP = mSRP;
	}
}
