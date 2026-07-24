package com.java.examples.test;

import java.util.HashMap;

public class SubarraySumEqualsK {

	public static int countSubarraysWithSumK(int[] nums, int k) {
        int count = 0;
        int currentSum = 0;

        // HashMap to store the frequency of prefix sums
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1); // Base case: a sum of 0 occurs once (empty subarray)

        for (int num : nums) {
            currentSum += num;

            // Check if there exists a prefix sum that satisfies the condition
            if (prefixSumMap.containsKey(currentSum - k)) {
                count += prefixSumMap.get(currentSum - k);
            }

            // Update the hashmap with the current prefix sum
            prefixSumMap.put(currentSum, prefixSumMap.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 6;
        int result = countSubarraysWithSumK(nums, k);
        int result1 = countSubarrays(nums, k);
        System.out.println("Number of subarrays with sum " + k + ": " + result);
        System.out.println("Number of subarrays with sum " + k + ": " + result1);
    }

    public static int countSubarrays(int[] nums, int k) {
        // Map stores: <PrefixSum, Frequency>
        HashMap<Integer, Integer> map = new HashMap<>();
        int currentSum = 0;
        int count = 0;

        // Base case: a prefix sum of 0 has been seen once
        map.put(0, 1);

        for (int num : nums) {
            currentSum += num;

            // If (currentSum - k) exists, it means there are
            // 'n' subarrays ending here that sum to k
            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }

            // Update the frequency of the current prefix sum
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}
