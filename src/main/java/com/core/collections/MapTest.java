package com.core.collections;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        testHashMap();

        testIdentityHashMap();
    }

    static void testHashMap() {
        Map<String, String> map = new HashMap<>();
        map.put(" ", " ");
    }

    static void testLinkedHashMap() {
        Map<String, String> map = new LinkedHashMap<>();
        map.put(" ", " ");
    }

    static void testIdentityHashMap() {
        String key1 = new String("key");
        String key2 = new String("key");

        // Standard HashMap
        Map<String, String> standardMap = new HashMap<>();
        standardMap.put(key1, "Value 1");
        standardMap.put(key2, "Value 2"); // Overwrites "Value 1" because key1.equals(key2) is true

        // IdentityHashMap
        Map<String, String> identityMap = new IdentityHashMap<>();
        identityMap.put(key1, "Value 1");
        identityMap.put(key2, "Value 2"); // Stores BOTH because key1 == key2 is false

        System.out.println("HashMap: " + standardMap.get(key2));
        System.out.println("HashMap: " + standardMap.get(key1));
        System.out.println("HashMap size: " + standardMap.size());       // Outputs 1
        System.out.println("IdentityHashMap size: " + identityMap.size()); // Outputs 2

        /**
         * The Core Difference: Equality vs. IdentityHashMap
         * (Equality):Treats two distinct objects as the same key if their values match.
         * IdentityHashMap(Identity): Treats two objects as the same key only if they point to the exact
         *                            same memory address.
         */
    }
}
