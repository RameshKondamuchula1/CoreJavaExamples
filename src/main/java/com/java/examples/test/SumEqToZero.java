package com.java.examples.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SumEqToZero {

	public static void main(String[] args) {
		
		int[] input = {-4, 2, 3, -3, -1, 4, 5};
		
		Set<Integer> sumSet = new HashSet<>();
		
		for(int num: input) {
			
			if(sumSet.contains(-num)) {
				System.out.println(num + ", " + -num);
			} else {
				sumSet.add(num);
			}
		}

		findUniqueIntegerOfLengthKSumEqualZero(7);

		findUniqueIntegerOfLengthKSumEqualZero(8);
	}

	static void findUniqueIntegerOfLengthKSumEqualZero(int n) {
		int[] result = new int[n];
		int i = 0;
		System.out.println("Value: " + n/2 + " and " + n%2);
		if(n%2==1) {
			result[i++] = 0;
		}

		for (int j = 1; j <=n/2; j++) {
			result[i++] = j;
			result[i++] = j * -1;
		}

		System.out.println("Unique Numbers: " + Arrays.toString(result));
	}

}
