package com.core.collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrencyInCollections {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Map<String, String> map = new HashMap<>();

        list.add("Ramesh");
        set.add("Ramesh");
        map.put("Grid", "Ramesh");
        // Most of the Collections are not-thread safe we can not achieve concurrency with them.
        // To achieve that we have to explicitly convert them to Concurrency Collections.
        // Converting the collections to Concurrency Collections
        List<String> listSync = Collections.synchronizedList(list);
        Set<String> setSync = Collections.synchronizedSet(set);
        Map<String, String> mapSync = Collections.synchronizedMap(map);

        //For HashMap we can use ConcurrentHashMap of concurrent package for concurrency
        Map<String, String> concurrentMap = new ConcurrentHashMap<>();

        // Most of the Collections are not-thread safe we can not achieve concurrency with them.

    }
}
