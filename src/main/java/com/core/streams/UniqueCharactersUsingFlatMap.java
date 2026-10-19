package com.core.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueCharactersUsingFlatMap {
    public static void main(String[] args) {
        System.out.println("Unique Characters: " +  uniqueCharacters(List.of("banana", "kiwi", "apple", "fig")));
    }

    public static List<Character> uniqueCharacters(List<String> words) {

        return words.stream().flatMapToInt(CharSequence::chars).mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();
    }
}
//List<List<String>>> --> flatMap(List::stream) --> gives stream of strings
// List of strings -> flatMapToInt(CharSequence::chars)  --> gives stream of chars (their int value)