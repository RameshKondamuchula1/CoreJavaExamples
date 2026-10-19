package com.core.streams;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JoinStringsWithDelimeter {
    public static void main(String[] args) {
        System.out.println(Instant.now());
        System.out.println("Join the words: " + joinTheStringsWithDelimeter(List.of("banana", "kiwi", "apple", "fig", "Mango", "Orange", "Gauva", "PineApple"), ", "));
        System.out.println(Instant.now());
        System.out.println("Join the words2: " + joinTheStringsWithDelimeter2(List.of("banana", "kiwi", "apple", "fig", "Mango", "Orange", "Gauva", "PineApple"), ", "));
        System.out.println(Instant.now());
    }

    public static String joinTheStringsWithDelimeter(List<String> words, String delimeter) {
        return words.stream().collect(Collectors.joining(delimeter));
    }

    // Fastest way to implement
    public static String joinTheStringsWithDelimeter2(List<String> words, String delimeter) {
        return String.join(delimeter, words);
    }
}
