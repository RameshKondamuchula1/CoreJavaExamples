package com.core.scenarios;

public class FindHeapMemoryInApplication {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total Heap Memory allocated to the JVM: " + runtime.totalMemory());// Gives total memory
        System.out.println("Total Free Heap Memory of JVM: " + runtime.freeMemory());// Gives total free memory
        System.out.println("Total used Heap Memory of JVM: " + (runtime.totalMemory() - runtime.freeMemory()));
        System.out.println("Get the maximum memory JVM will attempt to use: " + runtime.maxMemory());
    }
}
