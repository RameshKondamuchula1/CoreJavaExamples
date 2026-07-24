package com.core.basics;

public class ObjectClassMethods {

    public static void main(String[] args) throws InterruptedException {
        ObjectClassMethods classMethods = new ObjectClassMethods();

        System.out.println(classMethods.equals(new ObjectClassMethods()));// Compare the objects not references

        classMethods.wait();// put the current thread in wait mode until another thread invoke notify() or notifyAll()
        classMethods.wait(1000);// put the current thread in wait mode for the specified time
        //Causes the current thread to wait until it is awakened, typically by being notified or interrupted,
        // or until a certain amount of real time has elapsed.
        //timeoutMillis – the maximum time to wait, in milliseconds
        //nanos – additional time, in nanoseconds, in the range 0-999999 inclusive
        classMethods.wait(1000, 1000);

        classMethods.notify();// notify the thread which is waiting on this object monitor.
        classMethods.notifyAll();// notify all the thread which are waiting on this object monitor.
        // Both the notify() and notifyAll() are used in multithreading and synchronization blocks.

        // finalize() : deprecated from Java9. The finalize() method is a special method in the Object class that
        // the Garbage Collector (GC) calls before destroying an object.
        //It was designed to perform "cleanup" operations for non-Java resources,
        // such as:Closing open files.Releasing database connections.
        // Closing network sockets.Releasing native memory (from C/C++ libraries).

        classMethods.getClass();//The getClass() method is a member of the Object class. It is used to get the runtime
        // class of an object.
    }

    @Override
    public boolean equals(Object obj) {
        // Compare the underlying object with given object
        return super.equals(obj);
    }


    @Override
    public int hashCode() {
        // Returns the hash value of the Object
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Clone the object returns a copy of the current object. A class needs to implement Cloneable marker interface
        // to achieve this.
        return super.clone();
    }

    @Override
    public String toString() {
        // String representation of the object, default method returns hexaConversion of the hashcode()
        //getClass().getName() + "@" + Integer.toHexString(hashCode());
        return super.toString();
    }


}
