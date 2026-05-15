package com.java.examples;

import java.util.HashMap;
import java.util.Map;

public class LongestNonRepeatedCharSubString {

    public static void main(String[] args) {

        printNonRepeatedSubstring("lhgkabcaad");
    }

    public static void printNonRepeatedSubstring(String value) {
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        for (int right = 0; right < value.length(); right++) {
            char c = value.charAt(right);
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }

            map.put(c, right);
            maxLength = Math.max(maxLength, right - left + 1);

        }

        System.out.println("MaxLength: " + maxLength);
    }
}
