package com.java.examples;

import java.util.*;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        RemoveDuplicatesFromArray duplicates = new RemoveDuplicatesFromArray();
        int[] nums = {1,1,2,2};
        System.out.println(duplicates.removeDuplicates(nums));

        duplicates.removeDuplicateElements();
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        if (nums.length == 1) return 1;

        int k = 1; // Pointer for the position of the next unique element

        for (int i = 1; i < nums.length; i++) {
            // If current element is different from the previous one
            if (nums[i] != nums[i - 1]) { // Move it to the 'k' position
                k++; // Increment count of unique elements
            }
        }
        System.out.println(Arrays.toString(nums));


        return k;
    }

    public void removeDuplicateElements() {
        // Duplicates elimates
        String s = "applemangotang";

        // Aprroch 1
        Set<Character> set = new LinkedHashSet<>();
        for (char c: s.toCharArray()) { // Time O(N)
            set.add(c);
        }
        System.out.println(set);

        // Aprroch 2
        s.chars().distinct().mapToObj(c -> (char) c).forEach(System.out::print);
    }
}
