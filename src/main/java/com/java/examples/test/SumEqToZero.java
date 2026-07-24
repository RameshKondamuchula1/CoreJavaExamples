package com.java.examples.test;

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
	}

}
