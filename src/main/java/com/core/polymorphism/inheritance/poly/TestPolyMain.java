package com.core.polymorphism.inheritance.poly;

public class TestPolyMain {

    public static void main(String[] args) {
        Poly1 poly1 = new Poly1();// Parent reference - Parent instance
        poly1.test();//Executes parent method

        Poly1 poly11 = new TestPoly1();// Parent reference - Child instance
        poly11.test();//Executes Child method. This is Poly technique1 - Compile time it check that method is present in the parent or not
        // Run time it executes child method.

        TestPoly1 poly12 = new TestPoly1();// Child reference - Child instance
        poly12.test();//Executes Child method


        Poly2 poly2 = new Poly2();// Parent reference - Parent instance
        poly2.test2();//Executes parent method

        Poly2 poly21 = new TestPoly2();// Parent reference - Child instance
        poly21.test2();//Executes parent method This is Poly technique2 - Compile time it check that method is present in the child or not
        // Run time it executes parent method. due to inheritance at compile time that method will be visible so no compilation errors.
        // Run time it checks for that method in child, since its not part of the child it next check in parent class and execute parent class method.

        TestPoly2 poly22 = new TestPoly2();// Parent reference - Child instance
        poly22.test2();//Executes parent method This is Poly technique2 - Compile time it check that method is present in the child or not
        // Run time it executes parent method. due to inheritance at compile time that method will be visible so no compilation errors.
        // Run time it checks for that method in child, since its not part of the child it next check in parent class and execute parent class method.

    }
}
