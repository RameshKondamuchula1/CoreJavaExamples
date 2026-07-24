package com.core.design.pattern;

public class SingleTon {//SingleTone logic 1 implementation

	private static SingleTon SINGLE_TON = null;
	
	private SingleTon() {
		
	}
	
	static {
		System.out.println("Created singleton object");
		SINGLE_TON = new SingleTon();
	}
	
	public static SingleTon getObject(){
		return SINGLE_TON;
	}
	//In concurrent env
	public static synchronized SingleTon getObject2(){
		return SINGLE_TON;
	}
}
