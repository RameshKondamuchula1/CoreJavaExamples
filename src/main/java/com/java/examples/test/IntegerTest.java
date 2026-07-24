package com.java.examples.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerTest {

	public static void main(String[] args) {
		int[] intArray = {11,4,65,21,98,10};

		//Java 8
		List<Integer> intList = Arrays.stream(intArray).boxed().collect(Collectors.toList());
		//Java 9
		List<Integer> listOfNums = List.of(1, 2, 3, 4, 5);
		
		//List<Integer> intList = new ArrayList<>(Arrays.stream(intArray).boxed().toList());
		/*
		 * for (int value: intArray) { intList.add(value); }
		 */
		
		Comparator<Integer> intCompre = (e1, e2) -> e1.compareTo(e2); 
		//General Code
		Integer thirdHighest = intList.stream().sorted(intCompre.reversed()).skip(2).findFirst().get();
		//natural order
		//Integer secondHighest = listOfNums.stream().sorted(Comparator.naturalOrder()).skip(1).findFirst().get();
		//Simplified Code
		Integer secondHighest = listOfNums.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("thirdHighest" + thirdHighest);
		System.out.println("secondHighest" + secondHighest);
		System.out.println(intList);
		System.out.println(listOfNums);
		
		
		//String Test
		List<String> listOfNames = List.of("Ramesh", "Masni", "Vikas", "ITI", "Vidwath");
		String name = listOfNames.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(name);
	}
}
