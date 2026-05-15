package com.core.basics;

public class HasARelationshipAggregation {

    private HasChild hasChild;// HasChild is part of the structure.
    private String designation;

    // Aggregation: HasChild is passed in from outside. it means HasChild created outside so that it can exist without
    // HasARelationshipAggregation  class
    public HasARelationshipAggregation(HasChild hasChild, String designation) {
        this.hasChild = hasChild;
        this.designation = designation;
    }
}


class HasChild {
    private static String name = "GridDynamics";
}

/*
This occurs when one class uses another class as a member variable.
It is split into Aggregation and Composition based on how "tight" the bond is

Aggregation (Weak Has-A)
The objects have their own lifecycle. If the "parent" is destroyed, the "child" can still exist.





*/
