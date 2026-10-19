package com.core.streams;

import java.util.Comparator;
import java.util.List;

public class FindLargestStringUsingReduce {
    public static void main(String[] args) {
        System.out.println("findLargestString: " + findLargestString(List.of("banana", "kiwi", "apple", "fig", "Mango", "Orange", "Gauva", "PineApple")));

        //System.out.println("findLargestString null test: " + findLargestString(List.of(null)));// throws exception

        System.out.println("findLargestString empty test: " + findLargestString(List.of("")));// returns empty object --> hashCode of empty objects is Zero
    }

    public static String findLargestString(List<String> words) {

        return words.stream().reduce((a,b) -> a.length() >= b.length() ? a : b).orElse(null);
    }
}
