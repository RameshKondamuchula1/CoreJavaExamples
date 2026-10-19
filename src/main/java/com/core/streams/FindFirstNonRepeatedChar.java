package com.core.streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedChar {
    public static void main(String[] args) {
        System.out.println("findFirstNonRepeatedChar: " + findFirstNonRepeatedChar("ffiinnddFFirstNonRepeatedChar"));
    }

    public static Character findFirstNonRepeatedChar(String word) {

        return word.chars().mapToObj(c->(char) c).collect(
                Collectors.groupingBy(c->c, LinkedHashMap::new, Collectors.counting())
                ).entrySet().stream().filter(e -> e.getValue()==1)
                .map(Map.Entry::getKey).limit(1).findAny().orElse('0');
    }
}
