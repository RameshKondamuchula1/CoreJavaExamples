package com.core.Threads;

import java.util.concurrent.*;

public class  CallableRunnerThreads {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Future<String> message = executorService.submit(() -> "Mansi");
		System.out.println("Callable execution started");
		String msg = message.get();
		System.out.println("Callable execution completed : " + msg);
		System.out.println("main execution completed");
		executorService.shutdown();
	}

}

class CallableThread implements Callable<String> {
	
	private String name;

	public CallableThread(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello " + name;
	}
}
