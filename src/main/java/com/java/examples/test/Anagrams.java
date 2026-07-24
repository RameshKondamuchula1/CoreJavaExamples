package com.java.examples.test;

import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
       String[] input = { "aba"
                ,
                "baa"
                ,
                "acb"
                ,
                "ahs"
                ,
                "ash"
                ,
                "abc"
                ,
                "aab"
                ,
                "cba" };

       Map<String, List<String>> anagramGroups = new LinkedHashMap<>();

       for (String s: input) {
           char[] ch = s.toCharArray();
           Arrays.sort(ch);
           String key = new String(ch);
           anagramGroups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
       }

        anagramGroups.values().forEach(v -> System.out.println(String.join(",", v)));

    }
}
