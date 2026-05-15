package com.core.basics;

public class StringTest {
    public static void main(String[] args) {

        String name = "Ramesh";
        System.out.println(name.hashCode());
        String ramesh = "Ramesh";
        System.out.println(ramesh.hashCode());// Both are referring to the same hashCode of SCP.

        //Immutable Test:
        name = "Mansi";
        /*Changed the object state(Assigned a new value) means variable 'name' referred
        address will change in the SCP, but the value of previous referred address of the name
        won't replace by the new value. A new address will create in SCP*/
        System.out.println(name.hashCode());
        String mansi = "Ramesh";
        System.out.println(mansi.hashCode());
    }
}
