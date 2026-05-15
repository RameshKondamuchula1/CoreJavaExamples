package com.core.basics;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreation {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, CloneNotSupportedException {
        // new key word
        ObjectCreation objectCreation = new ObjectCreation();
        // Using reflection: newInstance() Deprecated from Java 9
        ObjectCreation objectCreation2 = ObjectCreation.class.newInstance();
         // Using reflection: with getConstructor.newInstance()
        ObjectCreation objectCreation3  = ObjectCreation.class.getConstructor().newInstance();
       // Object class clone method
        ObjectCreation objectCreation4  = (ObjectCreation) objectCreation.clone();
                ;
    }


}
