package com.core.basics;

public class PrimitiveTest {
    public static void main(String[] args) {
        PrimitiveTest primitiveTest = new PrimitiveTest();
        int j = 100;
        Integer i = Integer.valueOf("100");
        primitiveTest.printInteger(i);
        primitiveTest.printInteger(j);// Auto boxed the j value because printInteger expecting the Wrapper "Integer"

        //primitiveTest.printInt(i);
        //primitiveTest.printInt(j);

    }

    private void printInteger(Integer i) {
        System.out.println(i.byteValue());// In both the cases we will have control over the object.
    }

    private void printInt(int i) {
        System.out.println(i);
    }
}
