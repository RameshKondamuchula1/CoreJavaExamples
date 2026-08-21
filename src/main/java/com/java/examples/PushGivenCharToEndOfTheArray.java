package com.java.examples;

import java.util.*;
import java.util.stream.Collectors;

public class PushGivenCharToEndOfTheArray {
    public static void main(String[] args) {

        int[] intArray = {0,1,9,2,0,4,3,0,8,0,7,0,6};
        PushGivenCharToEndOfTheArray charToEndOfTheArray = new PushGivenCharToEndOfTheArray();
        //charToEndOfTheArray.withStreams(intArray);
        charToEndOfTheArray.twoPointerApproach();
    }

    public void twoPointerApproach() {
        int[] intArray = {1,9,2,0,4,3,0,8,0,7,0,6};
        int currentZeroIndex = 0;
         for (int i = 0; i < intArray.length; i++) {
             if (intArray[i] != 0) {
                    int zero = intArray[currentZeroIndex];
                 intArray[currentZeroIndex] = intArray[i];
                 intArray[i] = zero;
                 currentZeroIndex++;
             }
         }

         System.out.println(Arrays.toString(intArray));

    }

    public void withStreams(int[] intArray) {
        //Approach 1 : Time O(N)
        LinkedList<Integer> list = Arrays.stream(intArray).boxed().filter(n -> n != 0)
                .collect(Collectors.toCollection(LinkedList::new));

        //Approach 2: Time O(N)
        List<Integer> setList = new LinkedList<>();
        for (int i: intArray) {
            if(i != 0) setList.add(i);
        }

        int diff = intArray.length - setList.size();

        for (int i = 0; i < diff; i++) {
            setList.add(0);
            list.add(0);
        }

        System.out.println(list);
        System.out.println(setList);

    }
}
