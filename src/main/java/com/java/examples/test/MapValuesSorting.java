package com.java.examples.test;

import java.util.*;

public class MapValuesSorting {

	

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("1", "Ram");
		map.put("2", "SHyam");
		map.put("3", "Krish");
		mapValuesSorting(map);
		
	}


	private static void mapValuesSorting(Map<String, String> map) {
		//Approach1
		List<String> list = map.values().stream().sorted(Comparator.naturalOrder()).toList();

		System.out.println("Sorted Values : " + list);

		//Approach2 Without Streams
		List<String> val = new ArrayList<>(map.values());

		val.sort(Comparator.naturalOrder());

		System.out.println("Sorted Values without Streams : " + val);
	}
}
