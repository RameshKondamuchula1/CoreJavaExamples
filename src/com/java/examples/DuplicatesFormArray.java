package com.java.examples;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicatesFormArray {

    public static void main(String[] args) {

       String input = "Apple,Banana,Grapes,Apple,Cherry,Banana,Guava,Apple,Cherry";
       String ipNull = null;
       String ipEmpty = "";
       DuplicatesFormArray duplicatesFormArray = new DuplicatesFormArray();
       System.out.println("Duplicates: " + duplicatesFormArray.eliminateDuplicatesFromString(input));
       System.out.println("Without Duplicates: " + duplicatesFormArray.findDuplicatesFromString(input));
        System.out.println("Duplicates Count: " + duplicatesFormArray.findDuplicatesFromStringWithCount(input));
    }

    private String eliminateDuplicatesFromString(String fruits) {
        if(Objects.isNull(fruits) || fruits.isEmpty()) {
            return null;
        }
        return String.join(",", new HashSet<>(Arrays.asList(fruits.split(","))));
    }

    private String findDuplicatesFromString(String fruits) {
        if (Objects.isNull(fruits) || fruits.isEmpty()) {
            return null;
        }
        return String.join(",", Arrays.stream(fruits.split(","))
                .collect(Collectors.groupingBy(fr -> fr, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1)
                        .map(Map.Entry::getKey)
                .map(String::valueOf).toList());
    }

    private String findDuplicatesFromStringWithCount(String fruits) {
        if (Objects.isNull(fruits) || fruits.isEmpty()) {
            return null;
        }
        return String.join(",", Arrays.stream(fruits.split(","))
                .collect(Collectors.groupingBy(fr -> fr, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1)
                .map(String::valueOf).toList());
    }
}
