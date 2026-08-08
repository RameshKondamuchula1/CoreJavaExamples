package com.core.methodReferences;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MethodReferences {

    public static void main(String[] args) {
        MethodReferences references = new MethodReferences();

        // Lambdas without StreamAPI
        Thread thread = new Thread(() -> references.print("MethodReferences without Lambda"));
        thread.start();


        //MethodReferences without StreaAPI

        List<String> names = Arrays.asList("Ram", "Mansi", "Meenu");
        names.sort(String::compareToIgnoreCase);

        System.out.println("Sorted Names: " + names);


        Comparator<Integer> comparator = Integer::compareTo;


    }

    public void print(String str) {
        System.out.println(str);
    }
}
