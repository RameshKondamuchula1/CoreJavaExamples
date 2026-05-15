package com.core.basics;

public class ShallowCopyTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("Ramesh");

        Person person2 = (Person) person.clone();

        person.address.city = "Hyderbad";
        person.setName("Mansi");

        System.out.println(person);
        System.out.println(person2);

        person2.address.city = "Bangalore";
        person2.setName("Mansi");

        System.out.println(person);
        System.out.println(person2);

        // Both the objects sharing the same object reference of the Address class basically a bested object.
        // Changes to the state nested instances can affect the both copying objects in bidirectional
    }

}

class Person implements Cloneable{
    private String name;
    public Address address = new Address("Bangalore");
    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" + name + ", " + address + "}";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Address {
    public String city;

    public Address(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "{" + city + "}";
    }
}

/***
 In Java, copying an object isn't as simple as using =, because that usually just copies the reference (the address),
 meaning both variables point to the exact same object in memory. [1, 2, 3, 4, 5]
 To actually create a new object, you use Shallow or Deep copying. [1, 2]

 1. Shallow Copy
 A shallow copy creates a new object, but it does not create copies of the objects that the original object references.
 It just copies the memory addresses of those internal objects. [1, 2, 3, 4]
 * The Result: The "top-level" object is new, but nested objects are shared between the original and the copy.
 * If you change a nested object in the copy, it changes in the original too. [1, 2, 3, 4]

 **/