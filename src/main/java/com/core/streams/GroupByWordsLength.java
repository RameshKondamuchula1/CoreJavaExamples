package com.core.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByWordsLength {
    public static void main(String[] args) {

        System.out.println("Group Words By Length: " + groupByWordsLength(List.of("banana", "kiwi", "apple", "fig", "Mango", "Orange", "Gauva", "PineApple")));
    }

    public static Map<Integer, List<String>> groupByWordsLength(List<String> words){
          
        return words.stream().collect(Collectors.groupingBy(String::length));
    }
}
