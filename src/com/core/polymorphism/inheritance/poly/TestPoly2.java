package com.core.polymorphism.inheritance.poly;

public class TestPoly2 extends Poly2 {

    @Override
    public void test() {
        System.out.println("Child Class");
    }
    
    @Override
    void test3() {
        super.test3();
    }

   /* @Override
    protected void test3() {

    }
    @Override
    public void test3() {

    }*/

    //default to protected, public -- Allowed
    //protected, public to default -- Not Allowed
}
