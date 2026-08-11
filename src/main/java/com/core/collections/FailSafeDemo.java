package com.core.collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeDemo {
    public static void main(String[] args) {
        // Safe concurrent collection structure
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Apple");
        list.add("Banana");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println("Processing: " + fruit);

            // Safe modification. No exception is thrown!
            if (fruit.equals("Apple")) {
                list.add("Orange");
            }
        }

        System.out.println("Final list state: " + list);
    }
}

/*Fail-Safe Iterators (Weakly Consistent)
A Fail-Safe iterator avoids crashing entirely. It allows you to alter your data frames safely mid-traverse.
How it works internally: These iterators typically operate on a cloned snapshot copy or structured memory segment of
the collection instead of the live active view. Any additions or removals you make apply to the original collection
stream but do not affect the isolated data copy your iterator is currently using.
Common Classes: CopyOnWriteArrayList, ConcurrentHashMap, CopyOnWriteArraySet
*/


