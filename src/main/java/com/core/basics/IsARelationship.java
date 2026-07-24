package com.core.basics;

public class IsARelationship {
    private String parent;

    public String getParent() {
        return parent;
    }
}

// child Is-A specialized version of IsARelationship
class Child extends IsARelationship {

}

//In Java, these relationships define how classes interact and share data
/*
1. Is-A Relationship (Inheritance)This is based on class inheritance.
It means a subclass is a specialized version of the superclass.Keyword: extends
Concept: If "Class B" extends "Class A," then B is a type of A.*/


