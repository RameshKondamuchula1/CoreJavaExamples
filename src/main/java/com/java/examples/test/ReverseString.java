package com.java.examples.test;

public class ReverseString {

	
	public static void main(String[] args) {
		
		String str = "Ramesh";
		
		str = reverse(str);

		StringBuilder stb = new StringBuilder();
		int l = "Ramesh".length();

		for (int i = l-1; i>=0;i--) {
			stb.append("Ramesh".charAt(i));
		}
		System.out.println(stb.toString());
		System.out.println(str);
		
	}

	private static String reverse(String str) {
		
		if (str == null || str.length() <= 1) {
			return str;
		}
		
		return reverse(str.substring(1)) + str.charAt(0);
	}
}
