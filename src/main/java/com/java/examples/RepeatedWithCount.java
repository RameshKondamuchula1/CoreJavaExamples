package com.java.examples;

import java.util.SortedMap;
import java.util.TreeMap;

public class RepeatedWithCount {

    public static void main(String[] args) {
        String input = "yyaazzbccd";
        SortedMap<Character, Integer> map = new TreeMap<>();
        // Use SortedMap for sort the chars by default otherwise HashMap is  preferable.
        //

        for(char c: input.toCharArray()) {// O(N) time complexity
            map.put(c, map.getOrDefault(c, 0) + 1);// O(logK) time complexity K is no of unique elements
        }
        // Total time complexity is O(NlogK)
        // if K<=N then it is O(NlogN)
        System.out.println(map);
    }
}
