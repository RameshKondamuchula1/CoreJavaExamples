package com.java.examples.test;

public class MaxProfit {

	public static void main(String[] args) {
		int[] input ={7,1,3,2,5,6,4};
		int maxProfit = 0;
		int currentMin =  input[0];
		for(int i = 1 ; i < input.length; i++) {			
			currentMin = Integer.min(input[i], currentMin);
			if (input[i] > currentMin) {
				maxProfit = Math.max(maxProfit, input[i]-currentMin);
			}
		}		       

		
		System.out.println(maxProfit);
	}

}
