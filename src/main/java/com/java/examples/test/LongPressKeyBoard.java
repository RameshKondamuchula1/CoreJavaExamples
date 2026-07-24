package com.java.examples.test;

import java.util.HashMap;
import java.util.Map;

public class LongPressKeyBoard {

	public static void main(String[] args) {
		String actualName = "manasa";
		String input = "mmmannnasas";
		char prevChar = '0';
		StringBuilder sb = new StringBuilder();
		Map<Character, Integer> map = new HashMap<>();
		for (char c : input.toCharArray()) {
			if (c != prevChar) {
				sb.append(c);
				prevChar = c;
			}
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		System.out.println(actualName.equals(sb.toString()));

		// Repeated char
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}

	}

}
