package com.java.examples.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {2,5,3,1,9,7,6,4,8};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
            
		bubbleSort(arr, arr.length);
		System.out.println("========== ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void bubbleSort(int[] arr, int legnth) {
		
		int temp;
		boolean swap;
		for(int i = 0; i < legnth - 1; i++) {
			swap = false;
			
			for(int j = 0; j < legnth -i - 1; j++) {
				
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swap = true;
				}
			}
			if (swap == false)
                break;
		}
	}
}
