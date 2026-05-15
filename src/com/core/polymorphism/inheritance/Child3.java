package com.core.polymorphism.inheritance;

// Single Inheritance
public class Child3 implements Parent1 {

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
		return Parent1.staticCalcLength();
	}
	
	//We can not override static methods of parent class. if we try we will get
	//here method staticCalcLength() of type Child3 must override or implement a supertype method error
}
