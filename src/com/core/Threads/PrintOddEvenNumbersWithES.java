package com.core.Threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;


public class PrintOddEvenNumbersWithES {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Integer> listOfNumbers = new ArrayList<>();
		//You have two threads - t1,t2 which are responsible for printing even and odd numbers respectively. 
		//Design a program to generate numbers from 1 to 100 and add them to a list.
		List<Callable<List<Integer>>> list = List.of(new OddPrint(), new EvenPrint());
		ExecutorService executorService = Executors.newFixedThreadPool(2);//fixedThreadPool(2);
		List<Future<List<Integer>>> result = executorService.invokeAll(list);
		
		for(Future<List<Integer>> rs: result) {
			listOfNumbers.addAll(rs.get());
		}
		executorService.shutdown();
		Collections.sort(listOfNumbers);
		System.out.println(listOfNumbers);
	}
	
	

}

class OddPrint implements Callable<List<Integer>>{

	@Override
	public List<Integer> call() throws Exception {
		List<Integer> oddList = new ArrayList<>();
		 for(int i = 1; i <=100; i++) {
			 if(i%2 != 0) {
				 oddList.add(i);
			 }
		 }
		 System.out.println("OddList: " + oddList);
		return oddList;
	}
	
}

class EvenPrint implements Callable<List<Integer>>{

	@Override
	public List<Integer> call() throws Exception {
		List<Integer> evenList = new ArrayList<>();
		 for(int i = 1; i <=100; i++) {
			 if(i%2 == 0) {
				 evenList.add(i);
			 }
		 }
		 System.out.println("EvenList: " + evenList);
		return evenList;
	}	
}