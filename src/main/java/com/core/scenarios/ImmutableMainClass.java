package com.core.scenarios;

public class ImmutableMainClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        ImmutableTest immutableTest = new ImmutableTest("Grid");
        System.out.println(immutableTest.hashCode());
        System.out.println(immutableTest.toString());
        ImmutableTest immutableTest2 = immutableTest.clone();// This call returns new object
        System.out.println(immutableTest2.hashCode());
        System.out.println(immutableTest2.toString());
    }
}
