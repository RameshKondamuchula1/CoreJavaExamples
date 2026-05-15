package com.core.Exceptions;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("Result is: " + method("Mansi"));
		
	}

	private static int method(String name){
		try {
    		String val = name;
    		//System.exit(1);//terminates the program in this case, finally block wont executed.
        	return val.length();	
    	} catch (NullPointerException e) {
    		System.out.println("Error occured : " + e.getMessage());		
		} finally {
			System.out.println("Finally block executed");
		}
    	
    	System.out.println("Exceptions executed");
		return 0;		
	}
}
