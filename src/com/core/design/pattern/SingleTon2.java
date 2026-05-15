package com.core.design.pattern;

public class SingleTon2 { //SingleTone logic 2 implementation

	private static SingleTon2 SINGLE_TON = null;
	
	private SingleTon2() {
		
	}
	
	public static SingleTon2 getObject(){
		if (SINGLE_TON == null) {
			SINGLE_TON = new SingleTon2();
		}
		return SINGLE_TON;
	}
	//In concurrent env
	public static synchronized SingleTon2 getObject2(){
		if (SINGLE_TON == null) {
			SINGLE_TON = new SingleTon2();
		}
		return SINGLE_TON;
	}
}
