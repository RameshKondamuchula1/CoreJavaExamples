package com.java.examples.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Delimeter {

	public static void main(String[] args) {
		
		int[] input = {7,1,3,2,5,6,4};

		String[] strArray = {"ITI", "Ramesh", "Manasa", "Meenu", "C71"};

		Arrays.stream(strArray, 1, 4).forEach(
                System.out::println
		);


		
		List<Integer> list = Arrays.stream(input).boxed().toList();
		
		String op = list.stream().map(String::valueOf).sorted(Comparator.reverseOrder())
				.collect(Collectors.joining(","));// This operation is slower over head of streams and consumes memory due to temp
		           // stream object creation. Not suggestible to bulk data processing.
		           // Internally it uses StringBuilder to create the string.

		String op1 = String.join(",",Arrays.stream(input).mapToObj(String::valueOf).toList());
        // String.join() is faster when compared to Streams with collectors.
		// It uses StringBuilder internally.
		System.out.println(op);

		System.out.println(op1);
		
		
	}

}
