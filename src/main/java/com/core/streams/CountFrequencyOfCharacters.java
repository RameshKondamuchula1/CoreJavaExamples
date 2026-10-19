package com.core.streams;

import java.time.Instant;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class CountFrequencyOfCharacters {
    public static void main(String[] args) {
        String input =  "programming";

        System.out.println(Instant.now());
        System.out.println("FrequencyCount: " + getFrequencyCount(input));
        System.out.println(Instant.now());
        System.out.println("FrequencyCountInCharOrder: " + getFrequencyCountInCharOrder(input));

        System.out.println(Instant.now());
        System.out.println("getFrequencyCountInCharOrderGroupingByConcurrent: " + getFrequencyCountInCharOrderGroupingByConcurrent(input));
    }

    static Map<Character, Long> getFrequencyCount(String input) {

        return input.chars().mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(c->c, counting()));// By default, writes to HashMap
    }

    static Map<Character, Long> getFrequencyCountInCharOrder(String input) {

        return input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c->c, LinkedHashMap::new, counting()));// By default, writes to LinkedHashMap
    }

    static Map<Character, Long> getFrequencyCountInCharOrderGroupingByConcurrent(String input) {

        return input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingByConcurrent(c->c, counting()));// By default, writes to ConcurrentMap
                                                                            // --> Suitable for Multithreading
    }
}
