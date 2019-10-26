package com.example.PhoneKart.DTO;

import java.io.Serializable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LifeProducts implements Serializable,Runnable {

	
	public static void main(String...args) {
		//LifeProducts l = new 
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		executor.execute(new LifeProducts());
	}
	
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

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}	
}
