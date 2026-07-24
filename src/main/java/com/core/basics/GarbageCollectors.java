package com.core.basics;

public class GarbageCollectors {

	public static void main(String[] args) {
		

	}

	
	  /*
	    Garbage Collection tracks each and every object available in the JVM heap space, and removes the unused ones
	
	    Basically, GC works in two simple steps, known as Mark and Sweep:

		Mark – this is where the garbage collector identifies which pieces of memory are in use and which aren’t.
		Sweep – this step removes objects identified during the “mark” phase.
		
		Advantages:

		No manual memory allocation/deallocation handling because unused memory space is automatically handled by GC
		No overhead of handling Dangling Pointer
		Automatic Memory Leak management (GC on its own can’t guarantee the full proof solution to memory leaking; however, it takes care of a good portion of it)
		
		Disadvantages:

		Since JVM has to keep track of object reference creation/deletion, this activity requires more CPU power than the original application. 
		It may affect the performance of requests which require large memory.
		Programmers have no control over the scheduling of CPU time dedicated to freeing objects that are no longer needed.
		Using some GC implementations might result in the application stopping unpredictably.
		Automatized memory management won’t be as efficient as the proper manual memory allocation/deallocation.
		
		*/
	    /*
	     * Java 8:
	     * Java 8u20 has introduced one more JVM parameter for reducing the unnecessary use of memory by creating too many instances of the same String. 
	     * This optimizes the heap memory by removing duplicate String values to a global single char[] array.
           We can enable this parameter by adding -XX:+UseStringDeduplication as a JVM parameter.
	     */
	   
	     /*
	      * Once we make an object eligible for garbage collection, it may not destroy immediately by the garbage collector. 
	      * Whenever JVM runs the Garbage Collector program, then only the object will be destroyed
	      * We can also request JVM to run Garbage Collector. There are two ways to do it
	      * Using System.gc() method: System class contain static method gc() for requesting JVM to run Garbage Collector.
	      * another one is using Runtime.getRuntime().gc() method: Runtime class allows the application to interface with
	      * the JVM in which the application is running. Hence by using its gc() method, we can request JVM to run Garbage Collector.
	      * 
	      * Just before destroying an object, Garbage Collector calls finalize() method on the object to perform cleanup activities. 
	      * Once finalize() method completes, Garbage Collector destroys that object.
	      */
	
}
