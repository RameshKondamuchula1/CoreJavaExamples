package com.java.examples;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeNArraysInSortingOrder {
    public static void main(String[] args) {
        int[] intArray1 = {9,0,3,6,8};
        int[] intArray2 = {10,1,4,7,5,2};

        int[] merged = IntStream.concat(Arrays.stream(intArray1), Arrays.stream(intArray2))
                .sorted()
                .toArray();

        System.out.println(Arrays.toString(merged));

    }
}
