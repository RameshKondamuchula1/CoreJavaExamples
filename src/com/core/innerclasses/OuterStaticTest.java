package com.core.innerclasses;

public class OuterStaticTest {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.printName();
    }
}

class OuterClass {
    private static final String name = "Mansi Static";

    static class InnerClass {
        void printName() {
            System.out.println("Name : " + name);
        }
    }
}

/*A static nested class is a static class defined inside another class.
It does not have access to instance members of the outer class but can access static members.*/
