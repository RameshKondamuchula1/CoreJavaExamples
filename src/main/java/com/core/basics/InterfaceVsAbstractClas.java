package com.core.basics;

public class InterfaceVsAbstractClas {

    public static void main(String[] args) {
        AbImpl ab = new AbImpl();
        InterfaceImpl abInterface = new InterfaceImpl();

        testAbImpl(ab);
        testInterfaceImpl(abInterface);
    }


    static void testAbImpl(ABClass abClass) {
        abClass.testAb();
    }

    static void testInterfaceImpl(ABInterface aBInterface) {
        aBInterface.testInterface();
    }

}

abstract class ABClass {

    abstract void testAb();
    private static String name3 = "Mansi";
    static String name = "Mansi";
    String name2 = "Mansi";

    static {
        name = "meenu";
    }

    static void print() {

    }

    void print1() {

    }

    private void print3() {

    }

    public void print4() {

    }

}

interface ABInterface {

    void testInterface();

    String name3 = "Mansi";
    String name = "Mansi";
    String name2 = "Mansi";


    static void print() {

    }

    default void print1() {

    }

    private void print3() {

    }

    default void print4() {

    }

}

class AbImpl extends ABClass {

    @Override
    void testAb() {
            System.out.println("class AbImpl extends ABClass");
    }
}

class InterfaceImpl implements ABInterface {

    @Override
    public void testInterface() {
        System.out.println("class InterfaceImpl implements ABInterface");
    }
}
