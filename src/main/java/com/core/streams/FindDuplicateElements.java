package com.core.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateElements {
    public static void main(String[] args) {
        System.out.println("findDuplicates : " + findDuplicates(List.of(4,2,7,2,4,9,7,1)));
    }

    public static List<Integer> findDuplicates(List<Integer> numbers) {

        return numbers.stream().collect(Collectors.groupingBy(n->n, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue()>1)
                .map(Map.Entry::getKey).toList();
    }
}
