package com.core.streams;

import java.util.*;
import java.util.stream.Collectors;

public class ToUpperCaseAndSortByLength {
    public static void main(String[] args) {

        System.out.println("getUpperCaseSortByLength: " + getUpperCaseSortByLength(List.of("banana", "kiwi", "apple", "fig")));
    }

    /**
     * 1. Iterate the list
     * 2. Convert it to Uppercase
     * 3. Checks the length
     * 4. Sort them based on the length
     * 5. Collect them
     * @param fruits
     * @return
     */
    static List<String> getUpperCaseSortByLength(List<String> fruits) {

        return fruits.stream().map(String::toUpperCase).sorted(Comparator.comparingInt(String::length)).toList();
    }
}
