package com.core.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class SumOfSquaresOfAllOddNumbers {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        System.out.println("SumOfSquaresOfAllOddNumbers: " + sumOfSquareOfAOdds(nums));
    }

    public static int sumOfSquareOfAOdds(int[] nums) {

        return Arrays.stream(nums).filter(i -> i%2==1).map(i -> i*i).sum();
    }
}
