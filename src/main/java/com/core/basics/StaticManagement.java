package com.core.basics;

public class StaticManagement {
	
	//public static String staticValue = StaticVars.staticValue;
	public String instanceValue = "NULL";
	public static String staticValue = "static Values";
	
	public static void main(String[] args) {

		System.out.println("This block executed after : " + staticValue);
	}

	static {
		System.out.println("Static block executed");
	}

	private void instanceTest() {
		System.out.println("This block executed after : " + staticValue);
		System.out.println("This block executed after : " + instanceValue);
		// in instance method we can use both static and instance variables.
	}
	
	private static void staticTest() {
		System.out.println("This block executed after : " + staticValue);
	    //System.out.println("This block executed after : " + instanceValue);
		// Only static variables are allowed inside a static block or method.
	}	
}

class StaticVars {
	//When we are trying access any member of a class, static block executes first.
	public static String staticValue;
	static {
		staticValue = "staticValue";
		System.out.println("This static block executed early");
	}
}
