package com.core.java17;

public class RecordTest {
    public static void main(String[] args) {
        User user = new User("Meenu", 1);

        System.out.println("User: " + user.name());
        System.out.println("User: " + user.toString());

        Mommy mommy = new Mommy("Mansi", 16);
        System.out.println("Mommy: " + mommy.name());
    }
}

record User(String name, Integer age){}

record Mommy(String name, Integer age){

    public Mommy {
        if(name == null || (age == null || age < 18)) {
            throw new IllegalArgumentException("Invalid input");
        }
    }
}