package com.core.scenarios;

public final class ImmutableTest implements Cloneable {

    private final String name;

    public ImmutableTest (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Restricting the clone by making it final and controlling the clone method by creating new object
    @Override
    protected final ImmutableTest clone() throws CloneNotSupportedException {
        return new ImmutableTest(this.getName() + " Dynamics");
    }

    @Override
    public String toString() {
        return "{ name: " + name + "}";
    }
}
// Immutable Class: Once object gets created we can not modify best way we are not allowed the state of the object.
// Thread Safety: Immutable objects are inherently thread-safe, This object can freely share in multithreaded
//                environment and race conditions
// Predictability: The object state is consistent throughout the life cycle, so that it can be easily predictable.
// Cache-Friendly: They can be freely shared and cached without synchronization.
//
//
