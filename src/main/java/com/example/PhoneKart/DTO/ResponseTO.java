package com.example.PhoneKart.DTO;

public class ResponseTO {

	private String message;
	
	private String error;
	
	private Double randomNumber;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Double getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(Double randomNumber) {
		this.randomNumber = randomNumber;
	}
}
