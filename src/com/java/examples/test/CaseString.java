package com.java.examples.test;

import java.util.function.Function;

public class CaseString {

	static Function<String, String> toLowerCase = String::toLowerCase;
	static Function<String, String> upperCase = String::toUpperCase;
	
	
	public static void main(String[] args) {
		String str = "Manasa";
		if (str.length() <= 5) {
            // Convert to lowercase
            System.out.println("Original: " + str + ", Transformed: " + toLowerCase.apply(str));
        } else {
            // Convert to uppercase
            System.out.println("Original: " + str + ", Transformed: " + upperCase.apply(str));
        }
	}
}
