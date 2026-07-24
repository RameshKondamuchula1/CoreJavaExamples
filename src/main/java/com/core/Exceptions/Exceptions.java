package com.core.Exceptions;

public class Exceptions {

	public static void main(String[] args) {
		method1();
		method4();
		System.out.println("Exceptions executed 1");//this code would never be executed because above line of code will throws an exception.

	}

	private static void method1() {
		method2();
		try {
			method3();// handling the exception throwing by the caller method3.
		} catch (Exception e) {
			System.out.println("Error occured : " + e.getMessage());
		}
		System.out.println("Exceptions executed 2");
	}
	
    private static void method2() {
    	try {
    		String val = null;
        	val.length();//Handling the Exception, Calling method will never know about this exception.
    	} catch (Exception e) {
    		System.out.println("Error occured : " + e.getMessage());		
		}
    	
    	System.out.println("Exceptions executed 3");		
	}
    
    private static void method3() throws Exception{
    	String val = null;
    	val.length();//Throwing exception to calling method
		System.out.println("Exceptions executed 4");//this code would never be executed because above line of code will throws an exception.
	}
    
    private static void method4() {
    	String val = null;
    	val.length();//Not handling the Exception
		System.out.println("Exceptions executed 5");//this code would never be executed because above line of code will throws an exception.
	}	
}
