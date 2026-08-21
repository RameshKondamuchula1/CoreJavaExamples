package com.java.examples;

import java.util.*;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {
        RemoveDuplicatesFromArray duplicates = new RemoveDuplicatesFromArray();
        int[] nums = {1,1,2,2};
        System.out.println(duplicates.removeDuplicates(nums));

        duplicates.removeDuplicateElements();
    }

    public String removeDuplicates(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int i:nums) {
            set.add(i);
        }
        System.out.println(Arrays.toString(nums));


        return Arrays.toString(set.toArray());
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
