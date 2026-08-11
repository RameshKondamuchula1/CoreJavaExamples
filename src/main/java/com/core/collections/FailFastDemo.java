package com.core.collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println("Processing: " + fruit);

            // Unsafe modification directly via the collection instance
            if (fruit.equals("Apple")) {
                list.add("Orange"); // Triggers internal modCount increment
                // post this, for next iteration, iterator throws concurrent Modification Exception.
            }
        }
    }
}

/*Fail-Fast Iterators:
A Fail-Fast iterator operates directly on the original memory structure of the collection. If it detects any structural change to the collection during iteration, it immediately halts operations and throws a ConcurrentModificationException.
How it works internally: The collection maintains a tracking counter called modCount (modification count). When an iterator is created, it takes a snapshot value of this counter as expectedModCount. On every call to .next(), it checks if modCount == expectedModCount. If another thread or loop section breaks the rules and updates the array structure, the count changes, and the loop fails fast.
 Common Classes: ArrayList, HashMap, HashSet, LinkedList
 */
