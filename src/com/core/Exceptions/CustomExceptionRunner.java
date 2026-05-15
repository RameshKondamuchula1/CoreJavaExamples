package com.core.Exceptions;

public class CustomExceptionRunner {

	public static void main(String[] args) throws CustomException {// We are not handling unchecked exception CustomException2 here
		
		method1("Ramesh");
		method2("Ramesh");
	}

	private static void method1(String name) throws CustomException {
		 if (!name.equalsIgnoreCase("Ram")) {
			 throw new CustomException("name is not matched");
		 }
	}
	
	private static void method2(String name) throws CustomException2 {
		 if (!name.equalsIgnoreCase("Ram")) {
			 throw new CustomException2("name is not matched");
		 }
	}
}
