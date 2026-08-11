package com.core;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        // Sample Data
        List<Developer> team = Arrays.asList(
                new Developer("Alice", Arrays.asList("Java", "Python")),
                new Developer("Bob", Arrays.asList("JavaScript", "TypeScript", "Java"))
        );

        // 1. Using map() to extract names
        // Output: One name per developer (1-to-1 mapping)
        List<String> developerNames = team.stream()
                .map(Developer::getName)
                .collect(Collectors.toList());

        System.out.println("Developer Names (map): " + developerNames);
        // Prints: [Alice, Bob]


        // 2. Using map() on a nested collection (Creates a nested list structure)
        List<List<String>> nestedLanguages = team.stream()
                .map(Developer::getLanguages)
                .collect(Collectors.toList());

        System.out.println("Nested Languages (map): " + nestedLanguages);
        // Prints: [[Java, Python], [JavaScript, TypeScript, Java]]


        // 3. Using flatMap() to merge all internal languages into one single list
        // Output: All languages flattened out, duplicates removed using distinct()
        List<String> distinctLanguages = team.stream()
                .flatMap(dev -> dev.getLanguages().stream()) // Converts List<String> to Stream<String>
                .distinct()
                .collect(Collectors.toList());

        System.out.println("All Skills Required (flatMap): " + distinctLanguages);
        // Prints: [Java, Python, JavaScript, TypeScript]
    }
}

class Developer {
    private String name;
    private List<String> languages;

    public Developer(String name, List<String> languages) {
        this.name = name;
        this.languages = languages;
    }

    public String getName() { return name; }
    public List<String> getLanguages() { return languages; }
}

/*
In Java, both map and flatMap are intermediate operations used within the Stream API. They process elements individually,
but they shape the resulting stream differently.

The Core Difference
map (Transforming): Converts each input element into exactly one output element. It transforms an object from type A to type B.
flatMap (Flattening & Transforming): Converts each input element into a stream of elements, then merges (flattens) all these small streams into a single,
continuous stream.

When to use which?
Use map when you want to change the property or object type, like transforming a list of database entities into simple DTOs.
Use flatMap when your objects contain nested arrays, collections, or Optional fields, and you need to unzip them into a single-level structure.*/
