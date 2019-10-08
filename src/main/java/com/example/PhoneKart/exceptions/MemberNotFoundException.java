package com.example.PhoneKart.exceptions;

public class MemberNotFoundException extends Exception{

	private String message;
	
	public MemberNotFoundException(String msg) {
		this.message = msg;
	}
}
