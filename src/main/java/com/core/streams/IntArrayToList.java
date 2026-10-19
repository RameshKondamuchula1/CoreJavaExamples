package com.core.streams;

import java.util.Arrays;
import java.util.List;

public class IntArrayToList {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9};
        System.out.println("Convert to List: " + getList(nums));
    }

    public static List<Integer> getList(int[] nums) {

        return Arrays.stream(nums).boxed().toList();
    }
}
