package com.core.polymorphism.inheritance;

public class MyMainClass {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		  /*MyClass class1 = new MyClass("Ramesh");
		  
		  System.out.println("main(String[] args)");
		  main(1);
		  //class1.clone();*/

		Child child = new Child();
		child.printName();
		  
		  
	}
	
	public static void main(int i) throws CloneNotSupportedException {
		
		  MyClass class1 = new MyClass("Ramesh");
		  
		  System.out.println("main(int i)");
		  //class1.clone();
	}
}

// WE can overload main method but we can not override main method.
