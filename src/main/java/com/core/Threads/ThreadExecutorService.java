package com.core.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutorService {

	public static void main(String[] args) {
		
		//ExecutorService executorService = Executors.newSingleThreadExecutor();//Executes only one thread at any point of time.
		ExecutorService executorService = Executors.newFixedThreadPool(2);//Executes 2 threads at any point of time.
		executorService.execute(new Task1());
		executorService.execute(new Task2());
		executorService.execute(new Task3());
		
		System.out.println("main completed ");
		executorService.shutdown(); // We need to shutdown the executor-service
		
		
	}

}
