package com.core.scenarios;


import java.io.*;

public class SerializeDeserialize {
    public static void main(String[] args) {

    }
}

class TestSerializeModel implements Serializable {
    private String name;

    public TestSerializeModel(String name) {
        this.name = name;
    }

    public TestSerializeModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

class SubClassSerializeModel extends TestSerializeModel {

    public SubClassSerializeModel() {

    }

    /**
     * Blocks the serialization process.
     * Called automatically by ObjectOutputStream.
     */
    @Serial
    private void writeObject(ObjectOutputStream out) throws IOException {
        throw new NotSerializableException("Serialization is blocked for security.");
    }

    /**
     * Blocks the deserialization process.
     * Called automatically by ObjectInputStream.
     */
    @Serial
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        throw new NotSerializableException("Deserialization is blocked for security.");
    }

    //
    private void readObjectNoData(ObjectInputStream in) throws ObjectStreamException {
        throw new NotSerializableException("Deserialization is blocked for security.");
    }

   /* When traversing a graph, an object may be encountered that does not support the Serializable interface.
   In this case the NotSerializableException will be thrown and will identify the class of the non-serializable object.

    Classes that require special handling during the serialization and deserialization process must implement special
    methods with these exact signatures:

    private void writeObject(java.io.ObjectOutputStream out)
            throws IOException
    private void readObject(java.io.ObjectInputStream in)
            throws IOException, ClassNotFoundException;
    private void readObjectNoData()
            throws ObjectStreamException;

    The writeObject method is responsible for writing the state of the object for its particular class so that the
    corresponding readObject method can restore it. The default mechanism for saving the Object's fields can be
    invoked by calling out.defaultWriteObject. The method does not need to concern itself with the state belonging
    to its superclasses or subclasses. State is saved by writing the individual fields to the ObjectOutputStream
    using the writeObject method or by using the methods for primitive data types supported by DataOutput.

    The readObject method is responsible for reading from the stream and restoring the classes fields.
    It may call in.defaultReadObject to invoke the default mechanism for restoring the object's non-static and
    non-transient fields. The defaultReadObject method uses information in the stream to assign the fields of
    the object saved in the stream with the correspondingly named fields in the current object. This handles the
    case when the class has evolved to add new fields. The method does not need to concern itself with the state
    belonging to its superclasses or subclasses. State is restored by reading data from the ObjectInputStream for
    the individual fields and making assignments to the appropriate fields of the object. Reading primitive data
    types is supported by DataInput.

    The readObjectNoData method is responsible for initializing the state of the object for its particular class in
    the event that the serialization stream does not list the given class as a superclass of the object being deserialized.
    This may occur in cases where the receiving party uses a different version of the deserialized instance's class
    than the sending party, and the receiver's version extends classes that are not extended by the sender's version.
    This may also occur if the serialization stream has been tampered; hence, readObjectNoData is useful for initializing
    deserialized objects properly despite a "hostile" or incomplete source stream.
*/

}
