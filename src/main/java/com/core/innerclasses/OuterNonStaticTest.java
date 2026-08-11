package com.core.innerclasses;

public class OuterNonStaticTest {
    public static void main(String[] args) {
        Outer outer = new Outer("Mansi");
        Outer.InnerClass innerClass = outer.new InnerClass();

        innerClass.printName();

        localInnerMethod();
    }


    static void localInnerMethod() {
        int x = 98;
        final int Y = 100;
        //Method Local Inner Class
        //A method-local inner class is defined inside a method of the outer class.
        // It can only be instantiated within the method where it is defined.
        //Cannot access non-final local variables before Java 8.
        //From Java 8 onwards, can access effectively final local variables.
        //Cannot be declared as private, protected, static, or transient.
        //Can be declared as abstract or final, but not both.
       class LocalInnerClass {
          //x = 100; //throws an error because this statement can change the scope final to non final.
            public void localInnerMethodZZPrint () {
                System.out.println("Name : Local Inner Class Limited to a method" );
                System.out.println("x = " + x + ", Y = " + Y);//From Java 8 onwards, method-local inner classes can
                                               // access effectively final or non-final local variables.
            }
        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.localInnerMethodZZPrint();
    }


}

class Outer {
    private final String name;
    public static String lastName = "Kondamuchula";// from Java - 16
    public static String lastName2 = "Kondamuchula";// from Java - 16

    public Outer (String name) {
        this.name = name;
    }
   //Inner Class - Non Static
    class InnerClass {
        private String name; //Shadowing the outer class variable with same variable name
        void printName() {
            System.out.println("Name : " + name);
            // Accessing the Shadowing variables and inner class variables.
            System.out.println("Name : " + Outer.this.name); // Prints outer class variable
            this.name = "Ramesh";
            System.out.println("Name : " + this.name);// Prints inner class variable
            System.out.println("Name : " + name);// Prints inner class variable
        }
    }

    /*
    A member inner class is a non-static class defined at the member level of another class.
    It has access to all members of the outer class, including private members.
    Cannot have static members (except static final constants) until Java 16.
    Before Java 16: member inner classes could NOT have static members (except static final constants).

    After Java 16: Member inner classes CAN have static member, Only if they do not depend on an outer class instance*/
}

