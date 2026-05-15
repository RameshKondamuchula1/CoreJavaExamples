package com.core.polymorphism.inheritance.poly;

public class TestPoly1 extends Poly1 {
    @Override
    public void test() {
        System.out.println("Child Class");
    }

    @Override
    protected void test2() {

    }

   /* @Override
    public void test2() {

    }*/

    //protected to public -- Allowed
    //public to protected -- Not Allowed
}
