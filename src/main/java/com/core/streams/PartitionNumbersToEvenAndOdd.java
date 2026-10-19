package com.core.streams;

import java.util.List;
import java.util.stream.Collectors;

public class PartitionNumbersToEvenAndOdd {
    public static void main(String[] args) {
        System.out.println(" Odd and Even Numbers: " + partitionNumbersToEvenAndOdd(List.of(1,2,3,4,5,6,7,8,9)));
    }

    static List<List<Integer>> partitionNumbersToEvenAndOdd(List<Integer> list) {

        return list.stream().collect(Collectors.collectingAndThen(
                Collectors.partitioningBy(i -> i%2==0),
                map -> List.of(map.get(false), map.get(true))
                )
        );

    }
}
