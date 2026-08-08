package com.core.basics.Abstract;

public class Abstract extends AbstractA{
    public static void main(String[] args) {

        AbstractA anAbstract = new Abstract();
        String getMsg25 = anAbstract.getMsg24;
        anAbstract.print();
    }

    @Override
    String print() {
        System.out.println("print called");
        return "";
    }
}
//protected, private, public and static methods are allowed.
//default methods are not allowed.
//protected, private, public, default and static attributes are allowed
