package com.core.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindMaxAndMinUsingStreams {
    public static void main(String[] args) {
        System.out.println("Min and Max : " + findMaxAndMin(List.of(5, 3, 8, 1, 9, 2)));
    }

    public static List<Integer> findMaxAndMin(List<Integer> nums) {
        List<Integer> list = nums.stream().sorted(Comparator.naturalOrder()).toList();
        return List.of(list.get(0), list.get(list.size() - 1));
    }
}
