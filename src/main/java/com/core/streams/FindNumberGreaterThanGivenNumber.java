package com.core.streams;

import java.util.List;

public class FindNumberGreaterThanGivenNumber {
    public static void main(String[] args) {
        System.out.println(" Greatest Number: " + getGreaterInteger(List.of(2, 3, 9, 11, 5, 7), 8));
    }

    public static Integer getGreaterInteger(List<Integer> numbers, int num) {
        return numbers.stream().filter(i -> i>num).findFirst().orElse(-1);
    }
}
