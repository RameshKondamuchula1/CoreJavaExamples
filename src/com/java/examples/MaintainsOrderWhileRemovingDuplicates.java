package com.java.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MaintainsOrderWhileRemovingDuplicates {
    public static void main(String[] args) {

        List<Integer> list = Stream.of(5,5,5,5,2,2,4,4,1,1,7,7,7,3,3).distinct().toList();
        // Times: O(N)

        System.out.println(list);
    }
}
