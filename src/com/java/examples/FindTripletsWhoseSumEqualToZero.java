package com.java.examples;

import java.util.Arrays;

public class FindTripletsWhoseSumEqualToZero {

    public static void main(String[] args) {
        int[] input = {3,-1,0,1,2,2,-3,-2,-2};
        FindTripletsWhoseSumEqualToZero whoseSumEqualToZero = new FindTripletsWhoseSumEqualToZero();

        //whoseSumEqualToZero.findTriplets(input);

        whoseSumEqualToZero.findTriplets2(input);
    }

    private void findTriplets(int[] input) {
        Arrays.sort(input);

        for (int i = 0; i < input.length - 2;i++) {
            if (input[i] + input[i+1] + input[i+2] == 0) {
                System.out.println(input[i] + " " + input[i+1] + " "+ input[i+2]);
            }
        }

    }

    public static void findTriplets2(int[] nums) {
        // 1. Sort the array to use the two-pointer technique
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // 2. Skip duplicates for the first element to ensure uniqueness
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Found a triplet
                    System.out.println("[" + nums[i] + ", " + nums[left] + ", " + nums[right] + "]");

                    // 3. Skip duplicates for the second and third elements
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    // Move both pointers inward
                    left++;
                    right--;
                } else if (sum < 0) {
                    // Sum is too small, we need a larger number from the left
                    left++;
                } else {
                    // Sum is too large, we need a smaller number from the right
                    right--;
                }
            }
        }
    }
}
