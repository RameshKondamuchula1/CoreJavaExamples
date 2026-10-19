package com.core.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FlattenTheNestedList {
    public static void main(String[] args) {

        System.out.println("Flatten the numbers: " + flattenTheNestedList(List.of(List.of(1,2,3,4), List.of(5,6,7,8))));

        System.out.println("Flatten the words: " + flattenTheNestedList(List.of(List.of("Apple","Banana","3","4"), List.of("Gauva","6","7","8"))));
    }

    public static <T> List<T> flattenTheNestedList(List<List<T>> nestedLists) {

        return nestedLists.stream().flatMap(List::stream).toList();
    }
}
