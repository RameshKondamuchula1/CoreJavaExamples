package com.core.basics;

public class DeepCopyTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        ClassRoom classRoom = new ClassRoom("Ramesh");

        ClassRoom classRoom2 = (ClassRoom) classRoom.clone();

        classRoom.address.city = "Hyderbad";
        classRoom.setName("Mansi");

        System.out.println(classRoom);
        System.out.println(classRoom2);

        classRoom2.address.city = "Bangalore";
        classRoom2.setName("Mansi");

        System.out.println(classRoom);
        System.out.println(classRoom2);

        // Both the objects now not sharing the same object references of the Address class .
        // Changes to the state nested instances can not affect the both copying objects.
    }

}

class ClassRoom implements Cloneable{
    private String name;
    public Address address = new Address("Bangalore");
    public ClassRoom(String name) {
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
        ClassRoom classRoom = (ClassRoom) super.clone();
        classRoom.address = new Address(this.address.city);
        return classRoom;
    }
}