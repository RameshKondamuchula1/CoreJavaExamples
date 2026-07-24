package com.java.examples;

import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {
        FirstNonRepeatedCharacter nonRepeatedCharacter = new FirstNonRepeatedCharacter();
        String input = "hheellooggttyyuuiioolla";
        char charWithStreams = nonRepeatedCharacter.findFirstWithStreams(input);
        char ch = nonRepeatedCharacter.findFirst(input);
        System.out.println("Char: "+ charWithStreams);
        System.out.println("Char: "+ ch);
    }

    private char findFirstWithStreams(String input) {

        System.out.println(Instant.now());
        char ch = input.chars()
                .mapToObj(c -> (char) c)
                // Use LinkedHashMap::new to preserve insertion order
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse('0');
        System.out.println(Instant.now());
            return ch;
    }

    private char findFirst(String input) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        System.out.println(Instant.now());
        for(char c: input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> e: map.entrySet()) {
            if (e.getValue() == 1) {
                System.out.println(Instant.now());
                return e.getKey();
            }
        }
        return '0';
    }
}
// Loops(Over arrays) are faster the Streams
/*
Streams-timings -start and end
2026-04-24T08:59:39.033795Z
2026-04-24T08:59:39.041629Z

for loop timings -start and end
2026-04-24T08:59:39.041688Z
2026-04-24T08:59:39.041786Z
Char: a
Char: a*/
