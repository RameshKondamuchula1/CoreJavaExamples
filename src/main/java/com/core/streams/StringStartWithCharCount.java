package com.core.streams;

import java.util.List;

public class StringStartWithCharCount {
    public static void main(String[] args) {

        System.out.println("getCountStartsWith: " + getCountStartsWith(List.of("Avengers", "kiwi", "Apple", "fig")));
    }

    static long getCountStartsWith(List<String> names) {

        return names.stream().filter(s-> s.startsWith("A")).count();
    }
}
