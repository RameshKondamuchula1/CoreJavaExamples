package com.core.polymorphism.inheritance;

public class ParentClass {

	private String namePrivate(int length) {
		return "name";
	}//Not visible in sub-classes
	
	protected String nameProtected(int length) {
		return "name";
	}//visible in other package level and sub-classes in other packages
	
	String namedefault(int length) {
		return "name";
	}//Not visible in other packages sub-classes also- Package level privacy
}
