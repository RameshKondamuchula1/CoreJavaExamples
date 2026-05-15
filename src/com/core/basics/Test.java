package com.core.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		String lines[] = new String[] { "10.0.0.1 frank", "10.0.0.1 frank", "10.0.0.2 frank", "10.0.0.2 frank",
				"10.0.0.1 frank", "10.0.0.4 frank" };
		System.out.println(findMostFrequentIPs(lines));
	}

	// String lines[] = new String[]{"10.0.0.1 frank", "10.0.0.1 frank"}
	public static String findMostFrequentIPs(String[] lines) {

		Map<String, Integer> countMap = new HashMap<>();
		List<String> frequestIps = new ArrayList<>();
		for (String line : lines) {
			String[] ipArray = line.split(" ");
			String ip = ipArray[0];
			if (ip.contains(".")) {
					countMap.put(ip, countMap.getOrDefault(ip, 1) + 1);
			}
		}
		
		int max = countMap.values().stream().max(Integer::compare).orElse(0);
				
		countMap.entrySet().forEach(ipEntry -> {
			if (ipEntry.getValue() == max) {
				frequestIps.add(ipEntry.getKey());
			}
		});
		return frequestIps.stream().collect(Collectors.joining(","));//String.join(",", frequestIps)
	}
}
