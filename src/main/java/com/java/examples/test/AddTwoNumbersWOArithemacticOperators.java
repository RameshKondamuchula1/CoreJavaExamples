package com.java.examples.test;

public class AddTwoNumbersWOArithemacticOperators {

	//add two numbers without using arithmetic operators or predefined methods, you can use bitwise operations
	
	public static void main(String[] args) {
		addTwo();
		substractTwo();
	}

	public static void addTwo() {
		int a=10, b=12;
		
		while (b != 0) { 
			// Carry is AND of two bits 
			int carry = a & b;
			// Sum of bits of a and b where at least one of the bits is not set 
			a = a ^ b;
			
			// Carry is shifted by one so that adding it to a gives the required sum 
			b = carry << 1;
			
			/**
			This program uses the following steps to add two numbers a and b:

			1. Calculate the carry using the bitwise AND operator (a & b).

			2. Calculate the sum using the bitwise XOR operator (a ^ b).

			3. Shift the carry to the left by one position (carry << 1).

			4. Repeat the above steps until there is no carry left (b != 0).

			**/
			
		}

		System.out.println(a);
	}
	
	public static void substractTwo() {
		int a=10, b=12;
		
		while (b != 0) { 
			// Borrow is the inverse of a AND b 
			int borrow = (~a) & b;
			// Subtraction of bits of a and b where at least one of the bits is not set 
			a = a ^ b;
			
			// Borrow is shifted by one so that subtracting it from a gives the required difference 
			b = borrow << 1;
			/**
			This program uses the following steps to add two numbers a and b:

			1. Calculate the carry using the bitwise AND operator (a & b).

			2. Calculate the sum using the bitwise XOR operator (a ^ b).

			3. Shift the carry to the left by one position (carry << 1).

			4. Repeat the above steps until there is no carry left (b != 0).

			**/
			
		}

		System.out.println(a);
	}
	
}

