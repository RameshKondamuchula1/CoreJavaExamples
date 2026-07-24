package com.core.polymorphism.inheritance;

//Multiple Inheritance
public class Child2 extends TestAbstract implements Parent1 {

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected String nameProtected(int length) {
		// TODO Auto-generated method stub
		return super.nameProtected(length);
	}

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

	@Override
	public int calcLength() {//Super class default method - overridden in same package sub-class
		// TODO Auto-generated method stub
		return Parent1.super.calcLength();
	}
}
