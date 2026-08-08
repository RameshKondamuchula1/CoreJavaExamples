package com.core.collections;

import java.util.*;

public class SetTest {

    public static void main(String[] args) {
        testHashSet();
        testLinkedHashSet();
        testTresSet();
    }

    private static void testHashSet() {
        Set<String> set = new HashSet<>();
        set.add("ram");
        System.out.println("HashSet Add non duplicate: " + set.add("mansi"));
        System.out.println("HashSet Add duplicate: " + set.add("ram"));
    }

    private static void testLinkedHashSet() {
        Set<String> set = new LinkedHashSet<>();
        set.add("ram");
        System.out.println("LinkedHashSet Add non duplicate: " + set.add("mansi"));
        System.out.println("LinkedHashSet Add duplicate: " + set.add("ram"));
    }

    private static void testTresSet() {
        Set<String> set = new TreeSet<>();
        set.add("ram");
        System.out.println("LinkedHashSet Add non duplicate: " + set.add("mansi"));
        System.out.println("LinkedHashSet Add duplicate: " + set.add("ram"));

        //Navigable Set examples:
        NavigableSet<Integer> scores = new TreeSet<>();
        scores.add(10);
        scores.add(25);
        scores.add(50);
        scores.add(75);

        System.out.println("First/Lowest: " + scores.first());   // Outputs 10
        System.out.println("Last/Highest: " + scores.last());     // Outputs 75

        // Proximity searches based on the code you shared:
        System.out.println("Floor of 30: " + scores.floor(30));   // Outputs 25 (<= 30)
        System.out.println("Lower of 25: " + scores.lower(25));   // Outputs 10 (strictly < 25)
        System.out.println("Ceiling of 30: " + scores.ceiling(30));// Outputs 50 (>= 30)

        // Destructive retrieval
        System.out.println("Removed First: " + scores.pollFirst()); // Outputs 10 (Removes it from set)

        System.out.println("Post pollFirst() call : " + scores);
    }
}

