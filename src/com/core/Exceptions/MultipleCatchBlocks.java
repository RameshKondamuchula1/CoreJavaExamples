package com.core.Exceptions;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		method();
		method1();
		
	}

	private static void method(){
		try {
    		String val = null;
        	val.length();//Handling the Exception, Calling method will never know about this exception.
    	} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
    		System.out.println("Error occured : " + e.getMessage());		
		} catch (Exception e) {
    		System.out.println("Error occured : " + e.getMessage());		
		}
    	
    	System.out.println("Exceptions executed");	
	}

	private static void method1() {
		try {
    		String val = null;
        	val.length();//Handling the Exception, Calling method will never know about this exception.
    	} catch (NullPointerException | ArrayIndexOutOfBoundsException ex) {
    		System.out.println("Error occured : " + ex.getMessage());		
		}
    	
    	System.out.println("Exceptions executed");	
	}
}
