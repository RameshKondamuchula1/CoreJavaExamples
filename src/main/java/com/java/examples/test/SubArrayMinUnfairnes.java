package com.java.examples.test;

import java.util.Arrays;

public class SubArrayMinUnfairnes {

	public static int[] minimizeUnfairness(int[] arrn, int k) {
        // Step 1: Sort the array
        Arrays.sort(arrn);

        int minUnfairness = Integer.MAX_VALUE; // To track the minimal unfairness
        int[] result = new int[k]; // To store the resulting subarray

        // Step 2: Sliding window to find the subarray with minimal unfairness
        //1, 3, 5, 6, 9 -> length - k = 2 -> 0, 1, 2
        for (int i = 0; i <= arrn.length - k; i++) {
            // 2 - 0
            // 3 - 1
            // 4 - 2
            int currentUnfairness = arrn[i + 2] - arrn[i]; // max - min in the current window
            if (currentUnfairness < minUnfairness) {
                minUnfairness = currentUnfairness;
                // Copy the subarray of length k
                System.arraycopy(arrn, i, result, 0, k);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arrn = {6, 3, 9, 5, 1, 7}; //1, 3, 5, 6, 7, 9
        //int k = 4; // Resulting Subarray: [5, 6, 7, 9]
        int k = 3; // Resulting Subarray: [5, 6, 7]
        // Get the subarray with minimized unfairness
        int[] result = minimizeUnfairness(arrn, k);
        
        // Print the result
        System.out.println("Resulting Subarray: " + Arrays.toString(result));
    }

}
