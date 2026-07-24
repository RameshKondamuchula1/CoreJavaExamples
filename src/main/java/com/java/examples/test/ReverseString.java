package com.java.examples.test;

public class ReverseString {

	
	public static void main(String[] args) {
		
		String str = "Ramesh";
		
		str = reverse(str);
		
		System.out.println(str);
		
	}

	private static String reverse(String str) {
		
		if (str == null || str.length() <= 1) {
			return str;
		}
		
		return reverse(str.substring(1)) + str.charAt(0);
	}
}
