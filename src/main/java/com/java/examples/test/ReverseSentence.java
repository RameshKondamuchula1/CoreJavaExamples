package com.java.examples.test;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseSentence {

	public static void main(String[] args) {
		String s = "My name is manasa. I work in ITI";
		printReverseSentence(s);
		findNonRepeatedCharInAString(s);
		findRepeatedWordsInAString();
		convertStringToUppercase();
	}

	private static void printReverseSentence(String s) {
		StringBuilder sb = new StringBuilder();
		String[] s1 = s.contains(".") ? s.split("\\.") : new String[] { s };

		for (String ip : s1) {
			String[] sentence = ip.trim().split(" ");
			if (sentence.length > 0) {
				for (int j = sentence.length - 1; j >= 0; j--) {
					if (j != 0) {
						sb.append(sentence[j]).append(" ");
					} else {
						sb.append(sentence[0]).append(".");
					}
				}
			}

		}

		System.out.println(sb.toString().trim());
	}

	private static void findNonRepeatedCharInAString(String s) {
		String[] s1 = null;
		if (s.contains(".")) {
			s1 = s.split("\\.");
		} else {
			s1 = new String[] { s };
		}
		List<List<String>> list = new ArrayList<>();

		for (String ip : s1) {
			list.add(Arrays.stream(ip.split(" ")).toList());
		}

		list.stream().flatMap(List::stream).flatMapToInt(CharSequence::chars).mapToObj(c -> (char) c)
				.map(Character::toLowerCase).collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet()
				.stream().filter(e -> e.getValue() == 1).forEach(System.out::println);

		// Without stream API
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : "manasa".toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		// Non-Repeated char
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
			}
		}

		// Repeated char
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}
	}

	private static void findRepeatedWordsInAString() {
		String input = "Apple,Banana,Mango,Apple,Cherry,Banana,Apple";
		String[] s1 = input.split(",");
		List<String> list = new ArrayList<>(Arrays.stream(s1).toList());

		list.stream().collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 1).forEach(System.out::println);

		// Without stream API
		HashMap<String, Integer> map = new HashMap<>();
		for (String fruit : s1) {
				map.put(fruit, map.getOrDefault(fruit, 0) + 1);
		}

		// Repeated char
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}
	}

	private static void convertStringToUppercase() {
		String input = "Mango";

		String upperCase = input.chars().map(c -> c >= 'a' && c <= 'z' ? (c - 32) : c).mapToObj(e -> (char) e)
				.map(String::valueOf).collect(Collectors.joining());
		System.out.println(upperCase);

		StringBuilder sb = new StringBuilder();

		//Without Stream API		
		for (char c : input.toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				sb.append((char) (c - 32));
			} else {
				sb.append(c);
			}
		}
		System.out.println("\n" + sb.toString().trim());
	}
}
