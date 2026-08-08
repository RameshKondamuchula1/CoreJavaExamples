package com.java.examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxRepeatedNumberOrCharacter {
    public static void main(String[] args) {
        int[] input = {2,3,4,2,3,4,1,2,4,4};
        MaxRepeatedNumberOrCharacter maxRepeatedNumber = new MaxRepeatedNumberOrCharacter();
        maxRepeatedNumber.printMaxRepNum(input);
        maxRepeatedNumber.printMaxRepChar("inpuuuutt");
    }

    private void printMaxRepNum(int[] input) {
        if (input == null || input.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        Arrays.sort(input);//{1,2,2,2,3,3,4,4,4,4}
        Map<Integer, Integer> map = new HashMap<>();

        int currentElement = input[0];
        int maxCount = 0;

        for(int i: input) {
           int count = map.getOrDefault(i, 0) + 1;
           map.put(i, count);
           if(count > maxCount) {
               maxCount = count;
               currentElement = i;
            }
        }
        System.out.println("MaxRepeatedCharacter: " + currentElement);
    }

    private void printMaxRepChar(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("String is empty");
            return;
        }
        Map<Character, Integer> map = new HashMap<>();
        int maxCount = 0;
        char currentElement = 0;
        for(char i: input.toCharArray()) { // Time: O(N)
            map.put(i, map.getOrDefault(i,0) + 1);
            if(map.get(i) > maxCount) {
                maxCount = map.get(i);
                currentElement = i;
            }
        }
        System.out.println("MaxRepeatedCharacter: " + currentElement);
    }
}
