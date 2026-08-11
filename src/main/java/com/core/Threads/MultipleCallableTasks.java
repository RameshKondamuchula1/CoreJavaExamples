package com.core.Threads;

import java.util.List;
import java.util.concurrent.*;

public class MultipleCallableTasks {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//Multi-Threading 
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		List<CallableTask> tasks = List.of(new CallableTask("Mansi"), new CallableTask("Ramesh"), new CallableTask("Bangalore"));
		List<Future<String>> results = executorService.invokeAll(tasks);//invokes all the tasks and wait for all the tasks completed.
		System.out.println("Callable execution started");
		for (Future<String> result: results) {
			System.out.println("Callable execution completed for invokeAll : " + result.get());
		}
		
		String result = executorService.invokeAny(tasks);//invokes any one of the tasks and return the result of that task.
		System.out.println("Callable execution completed for inoke any : " + result);
		System.out.println("main execution completed");
		executorService.shutdown();

	}

}

class CallableTask implements Callable<String> {
	
	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello " + name;
	}
}