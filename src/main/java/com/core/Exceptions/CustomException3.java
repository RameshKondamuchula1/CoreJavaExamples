package com.core.Exceptions;

public class CustomException3 extends RuntimeException{
	
	private String message;
	
	public CustomException3(String message) {
		super(message);
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

}
