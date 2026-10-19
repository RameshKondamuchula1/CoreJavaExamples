package com.core.streams;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {4,2,7,2,4,9,7,1};////1 2 3 5 7 9
        System.out.println("Nth Largest Number: " + Arrays.toString(getDistinctArray(nums)));
    }

    public static int[] getDistinctArray(int[] nums) {

        return Arrays.stream(nums).distinct().toArray();
    }
}
