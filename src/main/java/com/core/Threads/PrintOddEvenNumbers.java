package com.core.Threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PrintOddEvenNumbers {
	//You have two threads - t1,t2 which are responsible for printing even and odd numbers respectively. 
	//Design a program to generate numbers from 1 to 100 and add them to a list.
	private static List<Integer> oddEvenNumbersList = new ArrayList<>();
	private int MAX = 100;

	public static void main(String[] args) throws InterruptedException {
		List<Integer> intList = List.of(12, 3, 5, 6, 14, 56, 89, 67, 94, 2, 1, 4, 7, 46, 51);
		PrintOddEvenNumbers printOddEvenNumbers = new PrintOddEvenNumbers();
		Thread oddThread = new Thread(() -> printOddEvenNumbers.filterNumbers(intList, n -> n%2==1));
		Thread evenThread = new Thread(() -> printOddEvenNumbers.filterNumbers(intList, n -> n%2==0));
		
		oddThread.start();
		evenThread.start();
		
		oddThread.join();
		evenThread.join();
		Collections.sort(oddEvenNumbersList);
		System.out.print("\n");
		System.out.println("SortedList : " + oddEvenNumbersList);
	}

	private void filterNumbers(List<Integer> numbers, Predicate<Integer> predicate) {
		numbers.stream().filter(predicate)
		                .forEach(num -> {System.out.print(num + " ");
		                         oddEvenNumbersList.add(num);
		                });
	}
}
