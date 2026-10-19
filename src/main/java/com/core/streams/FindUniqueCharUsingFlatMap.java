package com.core.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindUniqueCharUsingFlatMap {

    public static void main(String[] args) {

        System.out.println("Unique characters: " +  findUniqueChar(List.of("Ramesh","Manasa","Meenakshi")));
    }

    public static Set<Character> findUniqueChar(List<String> words) {

        return words.stream().flatMapToInt(String::chars).mapToObj(c->(char)c).collect(Collectors.toSet());
    }

    public static Set<Character> findUniqueChar2(List<String> words) {

        return words.stream().flatMap(word -> word.chars().mapToObj(c->(char)c)).collect(Collectors.toSet());
    }
}
