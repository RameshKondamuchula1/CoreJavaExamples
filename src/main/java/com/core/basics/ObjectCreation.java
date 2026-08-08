package com.core.basics;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicInteger;

public class ObjectCreation {

    private static final AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, CloneNotSupportedException {
        // new key word
        ObjectCreation objectCreation = new ObjectCreation();
        // Using reflection: newInstance() Deprecated from Java 9
        ObjectCreation objectCreation2 = ObjectCreation.class.newInstance();
        // Using reflection: with getConstructor.newInstance()
        ObjectCreation objectCreation3  = ObjectCreation.class.getConstructor().newInstance();
        // Object class clone method
        //ObjectCreation objectCreation4  = (ObjectCreation) objectCreation.clone();

        ObjectCreation objectCreation5 = new ObjectCreation();

        System.out.println(" Object Creation count: " + objectCreation5.getCount());
    }

    public ObjectCreation() {
        count.incrementAndGet();
    }

    public Integer getCount() {
        return count.intValue();
    }



}
