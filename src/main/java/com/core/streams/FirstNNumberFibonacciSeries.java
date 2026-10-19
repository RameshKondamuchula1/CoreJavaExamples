package com.core.streams;

import java.util.List;
import java.util.stream.Stream;

public class FirstNNumberFibonacciSeries {
    public static void main(String[] args) {
        System.out.println("First N Number fib series: " + getFirstNNumberFibSeries(20));
    }

    public static List<Integer> getFirstNNumberFibSeries(int num) {

        return  Stream.iterate(
                        new int[]{0,1},
                        a -> new int[]{a[1], a[0] + a[1]})
                .limit(num)
                .map(a -> a[0])
                .toList();
    }
}
