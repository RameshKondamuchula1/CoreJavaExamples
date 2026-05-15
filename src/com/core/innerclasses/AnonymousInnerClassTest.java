package com.core.innerclasses;

public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous() {
            @Override
            public void printLastName() {
                System.out.println("Anonymous LastName");
            }
        };
        anonymous.printLastName();

        Anonymous1 anonymous1 = new Anonymous1() {
            @Override
            public void printLastName() {
                super.printLastName();
                System.out.println("Anonymous1 LastName");
            }
        };
        anonymous1.printLastName();
    }
}

//As an Interface Implementation
interface Anonymous {
    void printLastName();
}
//As a Subclass
class Anonymous1 {
    void printLastName() {
        System.out.println("Anonymous1");
    }
}
/*
An anonymous inner class is an inner class without a name. It is declared and instantiated in a single statement.
It is used to provide a specific implementation of a class or interface on the fly.

Uses:
Declared and instantiated in one statement.
Used for one-time use implementations.
Cannot have constructors (since it has no name).
Commonly used in event handling and functional programming.

*/

