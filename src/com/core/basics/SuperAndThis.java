package com.core.basics;

public class SuperAndThis {
    private String name;// not accessible by sub-calsses
    public  String name2;//accessible by sub-calsse super key word
    public static void main(String[] args) {

    }

    public SuperAndThis () {

    }

    public SuperAndThis (String name) {
        this("private-name", "public-name");
    }

    public SuperAndThis (String name, String name2) {
         this.name = name;
         this.name2 = name2;
    }

    public String getName() {//accessible by sub-calsse super key word
        return this.name;
    }

    String getName2() {//accessible by sub-calsse super key word
        return this.name2;
    }

    private String getName3() {//Not accessible by sub-calsse super key word
        return name2;
    }
}

class SubClassSuper extends SuperAndThis {
    public  String name2Local = "public-name-local";

    public void printMessages() {
        System.out.println(super.name2);//Access on
        System.out.println(super.getName2());
        System.out.println(super.getName());
    }

    public void printMessages2() {
    }
// super should be first statement in constructor or method.
// this vs super :  super has more precedence than this
// No Duplication: A constructor cannot contain both a this() call and a parent super() call.
// First Statement: The this() call must always be the very first line of code inside the constructor execution block.
// Super class constructor is allowed call from the subclass constructor
// this key word is allowed call from the same class constructor from another constructor.
// in Constructor chain the last constructor should not have the key word to initiates the class.
}
