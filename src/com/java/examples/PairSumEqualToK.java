package com.java.examples;

import java.util.*;
import java.util.stream.IntStream;

public class PairSumEqualToK {

    public static void main(String[] args) {
        int[] intArray = {1,3,4,6,7};
        int sum = 7;
        int[] reversed = Arrays.stream(intArray)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        SortedSet<Integer> set = new TreeSet<>();

        // Print the pair in Ascending order
        for (int num: intArray) {//{1,3,4,6,7};
            int temp = sum - num;
             if (set.contains(temp)) {
                 System.out.println("Pari is: " + temp + " " + num);
                 //System.out.println("Pari is: " + num + " " + (sum - num));
             }else {
                 set.add(num);
             }
        }

        // Print the pair in descending order
        for (int num: reversed) { //{7,6,4,3,1};
            int temp = sum - num;
            if (set.contains(temp)) {
                System.out.println("Pari is: " + num + " " + temp);
            }else {
                set.add(num);
            }
        }
    }
}
