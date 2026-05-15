package com.java.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MisingNumbers {
    public static void main(String[] args) {
        int[] intArray = {1,2,15,10,5};
        //15 - 1 = 14
        //14 - 4 = 10


        Arrays.sort(intArray);//1,5,9

        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 0; i < intArray.length - 1; i++) {
            int current = intArray[i];
            int next = intArray[i + 1];

            // Fill all numbers between current and next
            for (int j = current + 1; j < next; j++) {
                missingNumbers.add(j);
            }
        }
         System.out.println(Arrays.toString(missingNumbers.toArray()));
    }
}
