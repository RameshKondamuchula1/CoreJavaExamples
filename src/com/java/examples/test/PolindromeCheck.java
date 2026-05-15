package com.java.examples.test;

public class PolindromeCheck {

	public static void main(String[] args) {
		String input = "ITI";
		polyCheck(input);

	}

	public static void polyCheck(String input) {
		
		int left = 0, right = input.length() - 1;
		while(left < right) { // Time complexicity is O(N/2)
			if(input.charAt(left) != input.charAt(right)) {
				System.out.println("Not a polindrome");
				break;
			}
			left++;
			right--;
		}
		
		if (left == right)
			System.out.println("Is a polindrome");
	}
}
