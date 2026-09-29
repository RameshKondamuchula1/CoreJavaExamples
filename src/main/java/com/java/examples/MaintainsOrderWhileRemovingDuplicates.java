package com.java.examples;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Stream;

public class MaintainsOrderWhileRemovingDuplicates {
    public static void main(String[] args) {

        List<Integer> list = Stream.of(5,5,5,5,2,2,4,4,1,1,7,7,7,3,3).distinct().toList();
        // Times: O(N)
        int[] arr = {5,5,5,5,2,2,4,4,1,1,7,7,7,3,3};
        remove(arr);
        System.out.println(list);
    }

    static void remove(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i:arr) {
            set.add(i);
        }

        System.out.println(set);

    }
}
