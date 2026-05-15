package com.java.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class ZerosAndOnesSorting {
    public static void main(String[] args) {
        int[] input = {1,1,0,0,1,0,1,0};
        Arrays.stream(input).boxed().sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }
}
