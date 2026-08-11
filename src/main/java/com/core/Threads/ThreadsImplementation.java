package com.core.Threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadsImplementation {
	public static void main(String[] args) throws InterruptedException {
		List<Integer> integers = new ArrayList<>();
		Task1 task1 = new Task1();
		Task2 task2 = new Task2();
		Task3 task3 = new Task3();
		Thread thread = new Thread(task2);
		//thread.setPriority(10);// Task2 given high priority
		task1.setPriority(5);// Task12 given medium priority
		//task2.run();
		task3.start();
		thread.start();
		Thread.sleep(1000);
		task1.start();
		task3.join();// task 1 and task2 execution will wait till task3 completes its execution.
		//integers.addAll(task1.integers1);
		//integers.addAll(task3.integers);
		Collections.sort(integers);
		System.out.println(integers);
		Thread.yield();
		System.out.println("main completed ");
		
		
		System.out.println(task2.integers);

		// Thread.sleep() --> if you want to make your program execution go to sleep
		// state for a period of time you can use this static method.
		// (Thread execution would wait specified period of time)
		// Thread.yield() --> Used to free the CPU by a task or thread execution.
		// Daemon Thread --> provide services to the user thread for background
		// supported tasks. Low priority thread. if there is no thread is running JVM
		// terminates
		// the daemon thread. setDeamon(boolean) --> makes the current thread as daemon
		// thread. isDaemon() checks the curent thread is daemon or not.
		// used to perform 'gc' for a task in the background.
		// synchronized() --> When we declare a method as synchronized, it means if 1
		// thread is performing task on that method, other threads would wait for the
		// task
		// to be completed.

	}

}

class Task1 extends Thread {

	public List<Integer> integers1;

	@Override
	public void start() {
		super.start();
		System.out.println("start(1)");
        // pre-logic that needs to execute before run() method called
		System.out.println("start(2)");
	}
	
	public void run() {
		System.out.println("Task1 executed ");
		integers1 = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			if (i%2 == 0) {
				integers1.add(i);
			}
		}
		System.out.println("Task1 completed ");
		System.out.println("task1 " + integers1);
	}
}

class Task2 implements Runnable {
	public List<Integer> integers = new ArrayList<>();
	@Override
	public void run() {
		System.out.println("Task2 executed ");
		
		for (int i = 1; i <= 100; i++) {
			if (i%2 != 0) {
				integers.add(i);
			}
		}
		System.out.println("Task2 completed " + integers);
	}
}

class Task3 extends Thread {

	public List<Integer> integers = new ArrayList<>();

	public void run() {
		System.out.println("Task3 executed ");
		
		for (int i = 1; i <= 100; i++) {
			if (i%2 != 0) {
				integers.add(i);
			}
		}
		System.out.println("Task3 completed ");
		System.out.println("task3 " + integers);
	}
}

class Task4 extends Thread {

}
