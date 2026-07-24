package com.java.examples.fibonacci;

public class FiboCheck {

	public static void main(String[] args) {
		
		int[] fibArray = {0, 1, 1, 2, 3, 5, 8};
        int[] nonFibArray = {1, 2, 3, 5, 7};

        System.out.println("Is the first array a Fibonacci series? " + isFibonacci(fibArray));
        System.out.println("Is the second array a Fibonacci series? " + isFibonacci(nonFibArray));
	}

	
	// Method to check if the array is a Fibonacci series
    public static boolean isFibonacci(int[] arr) {
        if (arr.length < 3) {
            return false; // A Fibonacci sequence requires at least 3 numbers
        }

        // Check if each number (starting from the 3rd) is the sum of the two preceding numbers
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != arr[i - 1] + arr[i - 2]) {
                return false;
            }
        }

        return true;
    }
}
