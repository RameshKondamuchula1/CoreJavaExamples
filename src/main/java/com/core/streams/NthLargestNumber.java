package com.core.streams;

import java.util.Arrays;
import java.util.Comparator;

public class NthLargestNumber {

    public static void main(String[] args) {
        int[] nums = {2, 3, 11, 9, 5, 7};////1 2 3 5 7 9
        System.out.println("Nth Largest Number: " + getNthLargestNumber(nums, 3));
    }

    public static int getNthLargestNumber(int[] nums, int nthLargest) {
        return Arrays.stream(nums).boxed().toList().stream()
                .sorted(Comparator.reverseOrder())
                .skip(nthLargest-1).findFirst().orElse(0);
    }
}
