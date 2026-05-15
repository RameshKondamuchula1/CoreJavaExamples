package com.core.collections;

import java.time.Instant;
import java.util.*;

public class ListTest {

	public static void main(String[] args) throws InterruptedException {
		//featuresArrayList();
		Thread.sleep(1000);
		featuresLinkedList();

	}
	
	private static void featuresLinkedList() {
		List<String> linkedList = new LinkedList();
		linkedList.add("Mansi");
		linkedList.add("Ramesh");
		linkedList.add("Ram");		
		linkedList.add("Bangalore");
		linkedList.add("Ramesh");//allows duplicates
		linkedList.add(0, null);//Adding or deleting at any position is faster.
		
		System.out.println("LinkedList");
		System.out.println(Instant.now());
		linkedList.stream().forEach(s -> System.out.println(s));// retrieval is slower
		System.out.println(Instant.now());
		//Insertion order
		//Methods are not synchronized
		//Not thread-safe
		//Not sorted
		//Uses doubly linked list at back end
		
		linkedList.stream().filter("R"::startsWith).forEach(System.out::println);
	}
	
	private static void featuresArrayList() {
		List<String> arrayList = new ArrayList();
		
		arrayList.add("Ramesh");
		arrayList.add("Ram");
		arrayList.add("Mansi");
		arrayList.add("Bangalore");
		arrayList.add("Ramesh");//allows duplicates
		arrayList.add(0, null);//Adding or deleting at the end or middle is expensive -
		// performance issue will occur
		
		System.out.println("ArrayList");
		System.out.println(Instant.now());
		arrayList.stream().forEach(s -> System.out.println(s));// Constant retrieval time - retrieval is faster
		System.out.println(Instant.now());
		//Insertion order
		//Methods are not synchronized
		//Not thread-safe
		//Not sorted
		//Uses Object array at back end
		
		
		//While using Enhanced for loop data manipulation over a collection is not suggestible.
		//To do that we can use Iterator. it has remove() which can used to remove the data from collection.
		
		//Iterator
		
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			//iterator.remove(); --> removes current iterated item or value. Post that Iterator will
			// adjust the iterative cursor.
		}
		
	}
	
	private void featuresVectorList() {
		
		List<String> vectorList = new Vector<>();
		
		vectorList.add("Ramesh");
		vectorList.add("Ram");
		vectorList.add("Mansi");
		vectorList.add("Bangalore");
		vectorList.add("Ramesh");
		
		// Same as ArrayList
		//methods are synchronized
		//Uses in Multi threaded env
		//Used to share data between threads in Multi threaded execution.
		
	}

}
