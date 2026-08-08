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

    public static int firstUniqChar(String s) {
        if(s == null || s.isEmpty()) {
            return -1;
        }

        if(s.length() == 1) {
            return 0;
        }

        List<Character> chars = s.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey).toList();

        System.out.println("FindFirstNonRepeatedChar : " + chars);
        if(chars.isEmpty()) {
            return -1;
        }
        int index = Integer.MAX_VALUE;
        for (char c: chars) {
            index = Math.min(index, s.indexOf(c));
        }

        return index;
    }

    // This Approach only works lowercase alphabates
    // See the description of the problem, if its mentioned lowercase alphabets then this is he best solution
    public int firstUniqChar2(String s) {
        // Stores lowest index / first index
        int ans = Integer.MAX_VALUE;
        // Iterate from a to z which is 26 which makes it constant
        for(char c='a'; c<='z';c++){
            // indexOf will return first index of alphabet and lastIndexOf will return last index
            // if both are equal then it has occured only once.
            // through this we will get all index's which are occured once
            // but our answer is lowest index
            int index = s.indexOf(c);
            if(index!=-1&&index==s.lastIndexOf(c)){
                ans = Math.min(ans,index);
            }
        }

        // If ans remain's Integer.MAX_VALUE then their is no unique character
        return ans==Integer.MAX_VALUE?-1:ans;
    }

    public int firstUniqChar3(String s) {

        HashMap<Character, Integer> count = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(count.get(ch) == 1) return i;
        }

        return -1;
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
