package com.java.examples;

import java.util.HashMap;
import java.util.Map;

public class LongestNonRepeatedCharSubString {

    public static void main(String[] args) {

        printNonRepeatedSubstring("1R1T7");
    }

    public static void printNonRepeatedSubstring(String value) {
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        int index = 0;
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (map.containsKey(c)) {
                index = Math.max(index, map.get(c) + 1);
            }
            map.put(c, i);
            maxLength = Math.max(maxLength, i - index + 1);// Always calculates Current String length from
                                                           // non-repeated substring index

        }

        System.out.println("MaxLength: " + maxLength);
    }
}
