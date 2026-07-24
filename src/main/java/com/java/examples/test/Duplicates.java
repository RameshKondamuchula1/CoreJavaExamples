package com.java.examples.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicates {

	private transient String name;

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("hello", "world", "java", "programming");

		// Step 1: Flatten the list of strings into a single stream of characters
		strings.stream().flatMapToInt(CharSequence::chars).mapToObj(c -> Character.valueOf((char) c))
				// Step 2: Collect characters and count occurrences  
				.collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet().stream()
				// Step 3: Filter out characters with count > 1 (duplicates)
				.filter(entry -> entry.getValue() > 1)
				.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

		strings.stream().flatMapToInt(CharSequence::chars).mapToObj(c -> Character.valueOf((char) c))
				.forEach(c -> System.out.println(c));

		String s = "Ramesh Kondamuchula";
		 Set<Character> duplicates = s.chars(). // Create an IntStream of character codes
				mapToObj(c -> (char) c) // Convert each int to a Character
				.collect(Collectors.groupingBy(c -> c, Collectors.counting())) // Group by character and count
																				// occurrences
				.entrySet().stream() // Convert to Stream of Map.Entry
				.filter(entry -> entry.getValue() > 1) // Filter entries with count > 1
				.map(Map.Entry::getKey)
				.distinct()// Map to characters (keys)
				.collect(Collectors.toSet());
		 
		 System.out.println(duplicates);
		 
		 List<String> fruits = Arrays.asList("apple", "orange", "banana", "apple", "mango", "orange", "kiwi");
		 List<String> duplicateWords = fruits.stream()
		 .collect(Collectors.groupingBy(fruit -> fruit, Collectors.counting()))
		 .entrySet()
		 .stream()
		 .filter(entry -> entry.getValue() > 1)
		 .map(Map.Entry::getKey)
		 .collect(Collectors.toList());
		 System.out.println("Duplicates: " + duplicateWords);
	}

}
//Eid name salary

//select salary from Emp order by Salary desc limit 1 offset 4;