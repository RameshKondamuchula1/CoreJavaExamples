package com.core.basics.Interface;

public class InterfaceTest implements InterfaceA, InterfaceB{

    @Override
    public String print() {
        System.out.println("print called");
        return "";
    }

    @Override
    public String getMsg() {
        System.out.println("getMsg called");
        return "";
    }


    public static void main(String[] args) {
        InterfaceTest test = new InterfaceTest();
        test.print();
        test.getMsg();

        InterfaceA testA = new InterfaceTest();
        testA.print();
        testA.getMsg();
        //InterfaceA.getMsg22 = "Modified";

        InterfaceB testB = new InterfaceTest();
        testB.print();
        testB.getMsg();

    }

    // Abstract Method: If InterfaceA and InterfaceB has same abstract methods, Implementation class won't throw any error, no ambiguity
    // Static method: No Error - Because static methods are bounded to class only.
    // default method: No Error - Child implementation overrides the default method.
    // Public Method: Error - public methods are not allowed.

    // For both abstract and default methods, they pointed to Variable Declaration class methods, irrespective of Object Implementation
    /*This pattern is a core concept of Object-Oriented Programming (OOP) known as Polymorphism (specifically, "coding to an interface").
    It allows you to swap out the right side with any other class that implements InterfaceA without changing the code on the left side.*/

    // Private methods are allowed , but not private attributes inside interface
    // protected methods and attributes are not allowed inside interface
    // Static attributes are allowed, But by default they are " public static final", no need to specific declaration.
    // public static final String getMsg22 = "private";
    // String getMsg22 = "private";   // These both declarations are same.

}
