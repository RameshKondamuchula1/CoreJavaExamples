package com.core.Exceptions;

public class CustomException2 extends RuntimeException { //UnChecked Custom Exception --> Calling method no need to handle this

	public CustomException2(String message) {
		super(message);
	}
}

