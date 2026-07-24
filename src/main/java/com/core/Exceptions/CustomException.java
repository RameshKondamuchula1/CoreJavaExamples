package com.core.Exceptions;

public class CustomException extends Exception { //Checked Custom Exception  --> Calling method need to handle this

	public CustomException(String message) {
		super(message);
	}
}
