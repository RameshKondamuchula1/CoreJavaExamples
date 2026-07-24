package com.java.examples.test;


import com.core.polymorphism.inheritance.Parent1;

public class Child implements Parent1 {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printName() {

	}

	//@Override
	public int staticCalcLength() {
		return "name".length();
	}
	
}
//When we are overriding the interface default method, in child class it will be overridden as public method.
//We can not override static methods of parent class. 
//Override: Also called as Run time polymorphism, in this name, Arguments order, length and return type should be same as Parent class.
//Overload: Also called as Compile time time polymorphism, in this name should be same and Arguments order should not be same,
//Return type and Arguments length can different.
//
//
//