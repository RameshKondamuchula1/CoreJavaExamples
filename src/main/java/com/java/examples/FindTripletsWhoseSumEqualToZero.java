package com.java.examples;

import java.util.*;

public class FindTripletsWhoseSumEqualToZero {

    public static void main(String[] args) {
        int[] input = {3,-1,0,1,2,2,-3,-2,-2};
        FindTripletsWhoseSumEqualToZero whoseSumEqualToZero = new FindTripletsWhoseSumEqualToZero();

        //whoseSumEqualToZero.findTriplets(input);
        System.out.println("Answer: " + whoseSumEqualToZero.findTriplets2(input));

    }

    // If array is Contiguous
    private void findTriplets(int[] input) {
        Arrays.sort(input);

        for (int i = 0; i < input.length - 2;i++) {
            if (input[i] + input[i+1] + input[i+2] == 0) {
                System.out.println(input[i] + " " + input[i+1] + " "+ input[i+2]);
            }
        }

    }

    public List<List<Integer>> findTriplets2(int[] nums) {

        Set<List<Integer>> res  = new HashSet<>();
        if(nums.length==0) return new ArrayList<>(res);
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++){
            int j =i+1;
            int  k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                }
                else if (sum >0) {
                    k--;
                }
                else {
                    j++;
                }
            }

        }
        return new ArrayList<>(res);
    }
}
