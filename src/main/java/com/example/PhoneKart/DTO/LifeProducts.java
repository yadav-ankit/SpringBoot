package com.example.PhoneKart.DTO;

import java.io.Serializable;

public class LifeProducts implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private String itemName;
	
	private int itemID;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}	
}
