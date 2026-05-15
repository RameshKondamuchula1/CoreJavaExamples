package com.java.examples.test;

import java.util.Arrays;
import java.util.Comparator;

public class SortBinariesOneAndZero {

	public static void main(String[] args) {
		int[] input = {1, 1, 0, 0, 1, 0, 1, 1, 0};
		
		Arrays.sort(input);
		Object[] object = Arrays.stream(input).boxed().toList().stream().sorted(Comparator.naturalOrder()).toArray();
		for (Object num: object) {
			System.out.print(num+ " ");
		}
		
		for (Object num: input) {
			System.out.print(num+ " ");
		}
	}

}
