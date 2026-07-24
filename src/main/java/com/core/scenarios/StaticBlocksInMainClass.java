package com.core.scenarios;

public class StaticBlocksInMainClass {

    private static String name = "GridDynamics";

    static {
        System.out.println("Static Block 1" + name);
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }

    static {
        name = "Bangalore";
        System.out.println("Static Block 2");
    }

    static {
        System.out.println("Static Block 3" + name);
    }

    // Static blocks executes first even before main method.
    //If two or more static blocks present in same class, they will be executed as they declared i.e in the same order
    // top to bottom in a class/

}
