package com.core.polymorphism.inheritance;

public interface Parent1 {
	
	static String name = "Ramesh";

	String getName();
	
	void setName();

	void printName();

	default int calcLength() {//Form Java8 we can create default methods in Interface
		return getName().length();
	}
	
	static int staticCalcLength() {//Form Java8 we can create static methods or blocks in Interface, But we can not override them in sub class
		return name.length();
	}
	
	
}
