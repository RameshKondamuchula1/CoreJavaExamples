package com.java.examples.test;

import java.util.Arrays;
import java.util.Comparator;

public class SortBinariesOneAndZero {

	public static void main(String[] args) {
		int[] input = {1, 1, 0, 0, 1, 0, 1, 1, 0};

		/////// Approach 1
		Arrays.sort(input);
		Object[] object = Arrays.stream(input).boxed().toList().stream()
				.sorted(Comparator.naturalOrder()).toArray();
		System.out.print(Arrays.toString(object));

		/////// Approach 2
		int zeroCount = 0;
		for(int i =0; i<input.length;i++) {
			if(input[i] == 0) {
				zeroCount++;

			}
		}
		int[] result = new int[input.length];
		for(int i =0; i<result.length;i++) {
			if(zeroCount > i) {
				result[i] = 0;
			} else {
				result[i] = 1;
			}
		}

		System.out.print("Result: " + Arrays.toString(result));

	}

}
