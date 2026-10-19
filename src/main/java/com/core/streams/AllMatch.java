package com.core.streams;

import java.util.List;

public class AllMatch {
    public static void main(String[] args) {
        System.out.println("All positive: " + allPositive(List.of(-1,2,3,-4)));

        System.out.println("All positive: " + allPositive(List.of(1,2,3,4)));
    }

    public static Boolean allPositive(List<Integer> numbers) {

        return numbers.stream().allMatch(i -> i>0);
    }
}
