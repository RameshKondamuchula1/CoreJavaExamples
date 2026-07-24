package com.core.basics;

public class StringExamples {

	public static void main(String[] args) {
		printString();
	}
	
	private static void printString() {
		String value = "Value";// Create object in SCP
		String values = "Value";// don't create new object in SCP, only reference gets created,
		                        // but pointed to the same memory allocation of 'value'
		String value1 = new String("Value");// Create new object in heap memory
		String value2 = new String("Value");// Create new object in heap memory but not
		                                            // pointed to the value1 object.
		/* 'new String("Value")'
		this will create a new object in Heap memory and
		JVM placed the literal value of that object "Value" in the SCP.
		variable refer to the object in the heap memory.
		*/

		System.out.println(value.hashCode());
		System.out.println(values.hashCode());
		System.out.println(value1.hashCode());
		System.out.println(value2.hashCode());
		
		System.out.println(value);
		System.out.println(values);
		System.out.println(value1);
		System.out.println(value2);

		System.out.println(value.equals(values) ? true : false);// content comparison SCP vs SCP
		System.out.println(value.equals(value1) ? true : false);// content comparison SCP vs Heap
		System.out.println(value1.equals(value2) ? true : false);// content comparison Heap vs Heap
		System.out.println(value == values ? true : false);//Object comparison --> SCP vs SCP
		System.out.println(value == value1 ? true : false);//Object comparison --> SCP vs Heap
		System.out.println(value1 == value2 ? true : false);//Object comparison --> Heap vs Heap

		System.out.println(value.intern());
		System.out.println(value1.intern());
	}
	
	/* String is immutable class where as StringBuffer and StringBuilder are mutable classes*/

	/*
	 * StringBuffer is synchronized, meaning its methods are thread-safe and can be
	 * safely used in a multithreaded environment. On the other hand, StringBuilder
	 * is not synchronized, which makes it faster than StringBuffer, but it is not
	 * thread-safe and should not be used in a multithreaded environment
	 */
}
