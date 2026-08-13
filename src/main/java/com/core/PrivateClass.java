package com.core;

public class PrivateClass {
    public static void main(String[] args) {
        //PrivateTest privateTest = new PrivateTest();// throws compilation error . We can not cretae instance for a class
        // with private constructor

        PrivateTest privateTest = PrivateTest.getObject("user");// A static method we can create objects like this.

        PrivateClass privateClass = new PrivateClass();
        //We can cretae instance for a class with private constructor within the class.
    }

    private PrivateClass() {

    }
}

class PrivateTest {
    private String name;
    public String surName;
    public static String nickName = "Meenu";

    private PrivateTest() {

    }

    private PrivateTest(String name) {

    }
    public static PrivateTest getObject(String user) {
        return new PrivateTest();
        //return new PrivateTest(user);// We can create a instance like this but ,
        // before doing it we can validate the user for security.
        // Throw an exception if user is not authenticated or authorized
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/*
class PrivateTest2 extends  PrivateTest{
    // throws compilation error . We can not extend classes with private constructor
}*/
