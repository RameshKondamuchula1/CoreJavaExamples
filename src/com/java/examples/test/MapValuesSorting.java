package com.java.examples.test;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class MapValuesSorting {

	

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("1", "Ram");
		map.put("2", "SHyam");
		map.put("3", "Krish");
		mapValuesSorting(map);
		
	}

    private static void mapValuesSorting(Map<String, String> map) {
    	SortedSet<String> sortedSet = new TreeSet<>();
    	
    	for (Map.Entry<String, String> entry: map.entrySet()) {
    		System.out.println(entry.getValue());
    		sortedSet.add(entry.getValue());
    	}
    	
    	System.out.println(sortedSet.toString());
	}
}
