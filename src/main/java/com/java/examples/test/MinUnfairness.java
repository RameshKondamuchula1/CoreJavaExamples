package com.java.examples.test;

import java.util.Arrays;

public class MinUnfairness {
	
    public static int[] minUnfairnessSubarray(int[] arr, int k) {
        
    	// Sort the array
        Arrays.sort(arr);
        
        // Initialize variables to track the minimum unfairness and starting index of the subarray
        int minUnfairness = Integer.MAX_VALUE;
        int startIndex = 0;

        // Iterate through the sorted array to find the subarray of length k with minimum unfairness
        for (int i = 0; i <= arr.length - k; i++) {
            int currentUnfairness = arr[i + k - 1] - arr[i];
            if (currentUnfairness < minUnfairness) {
                minUnfairness = currentUnfairness;
                startIndex = i;
            }
        }

        // Extract the subarray of length k with minimum unfairness
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[startIndex + i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 1};
        int k = 3;
        int[] result = minUnfairnessSubarray(arr, k);
        System.out.println("Subarray with minimum unfairness: " + Arrays.toString(result));
    }
}
