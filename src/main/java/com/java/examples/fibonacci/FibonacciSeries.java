package com.java.examples.fibonacci;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//fibonacciWithoutRecursive(10);
		String name = new String("RamMansi");
		
		int n = 10;
		for (int i = 0; i < n; i++) {	
			System.out.print(fibRecursive(i) + ", ");
		}
		System.out.print("\n");
		fibonacciWithoutRecursive(n);
	}

	private static void fibonacciWithoutRecursive(int limit) {
		
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		int i = 2;
		System.out.print(num1 + ", " + num2);
		for (; i < limit; i++) {			
			num3 = num2 + num1;
			System.out.print(", " + num3);
			num1 = num2;			
			num2 = num3;
							
		}
	}
	
	private static int fibRecursive(int n) {
		if(n <= 1)
		return n;// return 0, 1
		
		return fibRecursive(n - 1) + fibRecursive( n - 2);
	}
}
