package com.core.innerclasses;

public class OuterStaticTest {
    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.printName();
    }
}

class OuterClass {
    private static final String name = "Mansi Static";
    private String names1;

    static class InnerClass {
        private String names;
        void printName() {
            //System.out.println("Name : " + names1); Non-Static members of outer class are not allowed
            System.out.println("Name : " + names);// Non-Static members of inner static class are allowed
            System.out.println("Name : " + name);
        }
    }
}

/*A static nested class is a static class defined inside another class.
It does not have access to instance members of the outer class but can access static members.*/
