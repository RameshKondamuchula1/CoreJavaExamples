package com.core.Exceptions;

public class CheckedExceptions {

	public static void main(String[] args) {
		try {
			method();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		method2();
	}

	private static void method() throws InterruptedException {// Calling method should  handle this exceptions
		Thread.sleep(1000);
		
	}
	
	private static void method2() throws RuntimeException { // Calling method no need to handle RuntimeExceptions
		
	}

}
