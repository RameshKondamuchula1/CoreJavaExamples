package com.core.design.pattern;

public class SingleTonDoubleLock { //SingleTone double lock check logic implementation

	private static volatile SingleTonDoubleLock SINGLE_TON = null; 
	//The volatile keyword ensures that changes to the instance variable are visible to all threads.
	
	private SingleTonDoubleLock() {
		
	}
	//In concurrent env
	public static SingleTonDoubleLock getObject2() {
		if (SINGLE_TON == null) {// First check without locking
			synchronized (SINGLE_TON) {//Acquiring the lock
				if (SINGLE_TON == null) {// Second check with locking
					SINGLE_TON = new SingleTonDoubleLock();
				}
			}			
		}
		return SINGLE_TON;
	}
}


/*
 * Double-Checked Locking: Double-Checked Locking is an optimization technique
 * used to reduce the overhead of acquiring a lock by first checking the locking
 * criterion without actually acquiring the lock. If the criterion is met, the
 * lock is acquired, and the criterion is checked again.
 * 
 * Usage in Singleton Pattern: Double-checked locking is often used in
 * implementing the Singleton design pattern to ensure that only one instance of
 * a class is created and that the instance is created in a thread-safe manner.
 * 
 * Second Check (With Locking):
 * 
 * Inside the synchronized block, the if (instance == null) statement is checked again. 
 * This is necessary because another thread might have already created the instance while 
 * the current thread was waiting to acquire the lock.
 * 
 * By using double-checked locking, you can achieve a balance between performance and thread safety, 
 * particularly in scenarios where initializing a resource is expensive and needs to be done lazily.
 * 
 */
