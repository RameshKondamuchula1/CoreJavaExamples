package com.core.scenarios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorFailFastFailSafe {
    public static void main(String[] args) {
        //failFast();
        failSafe();
    }

    public static void failFast() {
        List<String> list = new ArrayList<>();
        list.add("Ram");
        list.add("Manis");
        list.add("Meenu");
        Iterator<String> itr = list.iterator();
        //list.add("ITI");
        while(itr.hasNext()) {
            list.add("Hyd");// Internal cursor index is no longer aligned with size post this chnge
            itr.next();//Check for modifications if any are there throws ConcurrentModificationException
            System.out.println("Came here");//This code never executes
        }

        /*The exception is triggered by the itr.next() method, but your code never reaches it.
         The Trigger: ArrayList iterators check for modifications only when you call next().
         The Bug: You modified the list (list.add("ITI")) after creating the iterator but before
                  starting the loop.
        The Result: The iterator's internal state becomes "stale" immediately.
        In many JVM implementations, this specific sequence causes hasNext() to return false because
        the internal cursor index no longer aligns with the new list size in a way that allows the loop to start.*/
    }

    public static void failSafe() {
        List<String> list = new CopyOnWriteArrayList<>();//
        list.add("Ram");
        list.add("Manis");
        list.add("Meenu");
        Iterator<String> itr = list.iterator();// Internally they create a snapshot of the collection and starts work on that.
        // Original collection remains as it is, after some time during the iteration JVM merge these two collections.
        list.add("ITI");
        Iterator<String> itr2 = list.iterator();
        while(itr.hasNext()) {
            list.add("Hyd");
            itr.next();
            System.out.println("Came here");
        }

        while(itr2.hasNext()) {
            list.add("Hyd");
            itr2.next();
            System.out.println("Came here");
        }



        /*The exception is triggered by the itr.next() method, but your code never reaches it.
         The Trigger: ArrayList iterators check for modifications only when you call next().
         The Bug: You modified the list (list.add("ITI")) after creating the iterator but before
                  starting the loop.
        The Result: The iterator's internal state becomes "stale" immediately.
        In many JVM implementations, this specific sequence causes hasNext() to return false because
        the internal cursor index no longer aligns with the new list size in a way that allows the loop to start.*/
    }
}
