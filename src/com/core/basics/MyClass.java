package com.core.basics;

public class MyClass implements Cloneable{

	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyClass(String name) {
		super();
		this.name = name;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException("Cloning is not supported");
	}
}
