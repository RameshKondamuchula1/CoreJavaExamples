package com.core.basics;

public class ObjectCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        TestModel testModel = new TestModel("Mansi");
        //TestModel testModel1 = (TestModel) testModel.clone(); // Super class throws exception
        SubClassModel subClassModel = new SubClassModel();

        SubClassModel subClassModelClone = (SubClassModel) subClassModel.clone();// Throws ClassNotSupported Exception

    }
}


class TestModel {
    private String name;

    public TestModel(String name) {
        this.name = name;
    }

    public TestModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected final Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of this object is not allowed");
    }
}

class SubClassModel extends TestModel implements Cloneable{

    public SubClassModel() {
    }

    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/

    // A compilation error occurs when we try to override the super class clone method because It is declared as final
    // Since Object class clone method Return type is Object, This is not a best practice to clone object with clone method.
    // A CopyContructor is better option which can give options like Shallow Copy and Deep(Copying the mutable
    // (Collections) Object into a new memory location) Copy.
}