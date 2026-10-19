package com.core.streams;

import java.util.Comparator;
import java.util.List;

public class FIndEvenNumbersInSortedOrder {
    public static void main(String[] args) {

        System.out.println("Even numbers Asc order: " + findEvenNumbersInAscOrder());

        System.out.println("Even numbers Desc order: " + findEvenNumbersInDescOrder());
    }

    static List<Integer> findEvenNumbersInAscOrder() {

        return List.of(5, 3, 8, 1, 9, 2).stream().filter(i -> i%2==0).sorted(Comparator.naturalOrder()).toList();
    }

    static List<Integer> findEvenNumbersInDescOrder() {

        return List.of(5, 3, 8, 1, 9, 2).stream().filter(i -> i%2==0).sorted(Comparator.reverseOrder()).toList();
    }
}
