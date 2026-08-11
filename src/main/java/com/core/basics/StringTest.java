package com.core.basics;

public class StringTest {
    public static void main(String[] args) {

        String name = "Ramesh";
        System.out.println(name.hashCode());
        String ramesh = "Ramesh";
        System.out.println(ramesh.hashCode());// Both are referring to the same hashCode of SCP.

        System.out.println("equals: " + name.equals(ramesh));// Returns true

        System.out.println(name == ramesh);// Returns true

        //Immutable Test:
        name = "Mansi";
        /*Changed the object state(Assigned a new value) means variable 'name' referred
        address will change in the SCP, but the value of previous referred address of the name
        won't replace by the new value. A new address will create in SCP*/
        System.out.println(name.hashCode());
        String mansi = "Ramesh";
        System.out.println(mansi.hashCode());

        //Intern
        String s1 = new String("Hello"); // Created on the heap
        String s2 = new String("Hello"); // Created on the heap (separate object)

        System.out.println(s1 == s2); // Returns false (different heap objects)
        System.out.println("equals: " + s1.equals(s2));
        // Interning forces them to point to the pool reference
        String s3 = s1.intern();
        String s4 = s2.intern();

        System.out.println(s3 == s4); // Returns true
        System.out.println("equals: " + s3.equals(s4));// Returns true

        System.out.println(s1 == s3); // Returns false
        System.out.println("equals: " + s1.equals(s3));// Returns true
    }
}
