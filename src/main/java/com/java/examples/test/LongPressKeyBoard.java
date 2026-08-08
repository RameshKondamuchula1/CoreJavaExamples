package com.java.examples.test;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class LongPressKeyBoard {

	public static void main(String[] args) {
		String actualName = "manasa";
		String input = "mmmannnasasmmmmm";
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
		;
		System.out.println("longPressKey: " + longPressKey());
	}

	static String longPressKey() {
		Map<Character, Integer> longPressKeyMap = new HashMap<>();
		Character character = null;
		char[] chArray = "0mmmannnasasmmmmm".toCharArray();
		char prevChar = '0';
		int longPressKeyCount = 0;
		int currentCount = 1;
		for (char c: chArray) { /// TC is O(N)
			if (c == prevChar) {
				currentCount++;
			} else {
				if (currentCount > longPressKeyCount) {
					character = prevChar;
					longPressKeyCount = currentCount;
				}
				prevChar = c;
				currentCount = 1;
			}
		}

		if (currentCount > longPressKeyCount) {
			longPressKeyCount = currentCount;
			character = chArray[chArray.length - 1];
		}

		return "[" + character + " : " + longPressKeyCount + "]";
	}

}
