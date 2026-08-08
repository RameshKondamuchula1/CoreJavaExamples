package com.core.basics.AbstractInterface;

public class AbstractInterfaceTest extends AbstractB implements InterfaceB {

    @Override
    public String print() {
        return "";
    }

    public static void main(String[] args) {
        AbstractB abstractB = new AbstractInterfaceTest();
        abstractB.print();
        abstractB.getMM();

        InterfaceB interfaceB = new AbstractInterfaceTest();
        interfaceB.print();
        interfaceB.getMsg();

        AbstractInterfaceTest test = new AbstractInterfaceTest();
        test.getMM();
        test.getMsg();
        test.print();

    }

    // For public, abstract and default methods, they pointed to Variable Declaration class methods, irrespective of Object Implementation
    /*This pattern is a core concept of Object-Oriented Programming (OOP) known as Polymorphism (specifically, "coding to an interface").
    It allows you to swap out the right side with any other class that implements InterfaceA without changing the code on the left side.*/
}
