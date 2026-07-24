package com.core.polymorphism.inheritance;

//Multiple Inheritance
public class Child extends TestAbstract implements Parent1, Parent2 {

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return 0;
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
	public String getName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int calcLength(String name) {
		return Parent2.super.calcLength(name);
	}

	//Overloading
	public String getName(String name, String value) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//Overloaded method to above method
	public Integer getName(Integer name, String value) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//Overriding interface default method
	@Override
	public int calcLength() {
		// TODO Auto-generated method stub
		return Parent1.super.calcLength();
	}
	
	@Override
	protected String nameProtected(int length) {
		// TODO Auto-generated method stub
		return super.nameProtected(length);//Super class protected method
	}
}
//When we are overriding the interface default method, in child class it will be overridden as public method.
//We can not override static methods of parent class. 
//Override: Also called as Run time polymorphism, in this name, Arguments order, length and return type should be same as Parent class.
//Overload: Also called as Compile time polymorphism, in this name should be same and Arguments order should not be same,
//Return type and Arguments length can different.
//
//Original Scope		Can change to...							Cannot change to...
//private	       		Anything (Technically "Method Hiding")			N/A
//default				protected, public								private
//protected				public											default, private
//public				Nothing (Must stay public)						protected, default, private
//
/*

1. Single Inheritance
	A single subclass inherits from one superclass.
	Structure: Class B extends Class A.
2. Multilevel Inheritance
	A class is derived from a subclass, creating a chain of inheritance.
	Structure: Class C extends Class B, and Class B extends Class A.
3. Hierarchical Inheritance
	One superclass has multiple subclasses that inherit from it.
	Structure: Both Class B and Class C extend Class A.
4. Multiple Inheritance (Through Interfaces)
	A single class inherits features from more than one parent.
	Important: Java does not support this with classes to avoid the "Diamond Problem"
		(ambiguity when two parents have methods with the same name).
	Implementation: Achieved by a class implementing multiple interfaces.
5.  Hybrid Inheritance (Through Interfaces)
	A combination of two or more types of inheritance (e.g., combining hierarchical and multiple inheritance).
	Implementation: Like multiple inheritance, it is only possible in Java by combining class extension
	with interface implementation.

Note: When two interfaces provide the same default method, the implementing class faces an ambiguity error. Java forces
    you to override the method to choose which one to use.
    An interface extends only interfaces. it wont extends classes inclusing abstract classes.
		*/
