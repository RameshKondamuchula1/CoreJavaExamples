package com.core.polymorphism.inheritance;

public abstract class TestAbstract {

	private String namePrivate(int length) {
		return "name";
	}//Not visible in sub-classes
	
	protected String nameProtected(int length) {
		return "name";
	}//visible in other packages sub-classes only
	
	
	public abstract int getLength();
	
	//default int calcLength(int length) {
	//	return getLength();
	//}
	//Default methods are not allowed abstract classes
}
