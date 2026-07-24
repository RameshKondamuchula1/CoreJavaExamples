package com.core.polymorphism.inheritance;

public interface Parent2 {

    String getName(String name);
	
	void setName(String name);

	void printName();

	default int calcLength(String name) {
		return getName(name).length();
	}

	static void newName(String name){

	}

	private void newwName(String name){

	}
}
