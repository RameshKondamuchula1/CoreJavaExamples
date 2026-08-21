package com.java.examples;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicatesFormArray {

    public static void main(String[] args) {

       String input = "Apple,Banana,Grapes,Apple,Cherry,Banana,Guava,Apple,Cherry";
       String ipNull = null;
       String ipEmpty = "";
       DuplicatesFormArray duplicatesFormArray = new DuplicatesFormArray();
       System.out.println("Duplicates: " + duplicatesFormArray.eliminateDuplicatesFromString(input));
       System.out.println("Without Duplicates: " + duplicatesFormArray.findDuplicatesFromString(input));
       System.out.println("Duplicates Count: " + duplicatesFormArray.findDuplicatesFromStringWithCount(input));
       System.out.println("Duplicates forLoop: " +Arrays.toString(duplicates(new int[]{2, 3, 7, 2, 8, 4, 6, 8})));
       System.out.println("Duplicates Map: " + Arrays.toString(duplicatesUsingMap(new int[]{2, 3, 7, 2, 8, 4, 6, 8})));
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
                .toList());
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

    static Object[] duplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i: arr) {
            if(!set.add(i)) {
                list.add(i);
            }
        }
        return list.toArray();
    }

    static Object[] duplicatesUsingMap(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: arr) {
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        //IntStream.of(arr).boxed().collect();
        return map.entrySet().stream().filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey).toArray();
    }
}
