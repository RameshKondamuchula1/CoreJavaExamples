package com.core.basics;

public class ObjectCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        TestModel testModel = new TestModel("Mansi");
        //shallow copy
        TestModel testModelShallowCopy = testModel.cloneShallowCopyTestModel();

        System.out.println("ShallowName: " + testModelShallowCopy.getName());
        testModel.setName("Ramesh");
        System.out.println("ShallowName: " + testModelShallowCopy.getName());
        testModelShallowCopy.setName("Meenu");
        System.out.println("ShallowName: " + testModel.getName());
        // In shallow copy both objects refer to same object.
        // changes to one object, will affect the other one.

        TestModel testModel1 = new TestModel("Mansi");
        // Deep Copy
        TestModel testModelDeepCopy = testModel1.cloneDeepCopyTestModel();

        System.out.println("DeepName: " + testModelDeepCopy.getName());
        testModel1.setName("Ramesh");
        System.out.println("DeepName: " + testModelDeepCopy.getName());
        testModelDeepCopy.setName("Meenu");
        System.out.println("DeepName: " + testModel1.getName());
        System.out.println("DeepName: " + testModelDeepCopy.getName());
        // In Deep copy both objects refer to different objects, Because deep copy created with new object with new key
        // word pointing to different memory.
        // changes to one object, will not affect the other one.

        //TestModel testModel1 = (TestModel) testModel.clone(); // Super class throws exception
        SubClassModel subClassModel = new SubClassModel();

        //SubClassModel subClassModelClone = (SubClassModel) subClassModel.clone();// Throws ClassNotSupported Exception

    }
}


class TestModel  implements Cloneable {
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

    protected final TestModel cloneShallowCopyTestModel() {
        TestModel testModel = this;
        return testModel;
    }

    protected final TestModel cloneDeepCopyTestModel() {
        TestModel testModel = new TestModel();
        testModel.setName(this.name);
        return testModel;
    }
}

class SubClassModel extends TestModel{

    public SubClassModel() {
    }

    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/

    // A compilation error occurs when we try to override the super class clone method because
    // It is declared as final
    // Since Object class clone method Return type is Object, This is not a best practice to clone
    // object with clone method.
    // A Copy Constructor is better option which can give options like Shallow Copy() and Deep(Copying the mutable
    // (Collections) Object into a new memory location) Copy.
}