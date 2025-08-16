
# Serialization and Deserialization

Serialization is the process of converting an object into a byte stream, which can be stored in a file or sent over a network. This byte stream contains the object's data as well as information about the object's type and structure.

Deserialization, on the other hand, is the process of converting the byte stream back into an object. During deserialization, the byte stream is read and used to recreate the original object with its data and structure intact.

![alt text](https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2016/01/serialize-deserialize-java.png)

## Goal of Serialization

The primary goal of serialization is to persist an object's state so that it can be saved to a file, sent over a network, or otherwise transported from one application to another.

## Goal of Deserialization

The goal of deserialization is to recreate an object from its serialized form. This allows the object to be restored to its original state, enabling applications to work with the data it represents.

The byte stream created is **platform independent**. So, the object serialized on one platform can be deserialized on a different platform.

To make a Java object serializable we implement the **java.io.Serializable** interface. The **ObjectOutputStream** class contains **writeObject()** method for serializing an Object.

## When We Use Serialization and Deserialization?

Serialization and deserialization are commonly used in scenarios where objects need to be transmitted between different applications or stored persistently. Examples include saving objects to files, sending objects over a network, or caching objects in memory.

## Why We Use Serialization and Deserialization?

Serialization and deserialization allow objects to be easily transferred between different applications and platforms. They provide a convenient way to persist object state and facilitate communication between distributed systems.

## Note:

**To make a Java object serializable we implement the java.io.Serializable interface.**



Points to remember:

- Serializable is a marker interface (has no field, method etc... so it is empty)
- If a parent class has implemented Serializable interface then child class doesn’t need to implement it but vice-versa is not true.
- Only non-static fields(data members) are saved via Serialization process.
- Static data members and transient data members are not saved via Serialization process. So, if you don’t want to save value of a non-static data member then make it transient.
- Constructor of object is never called when an object is deserialized.
- Associated objects must be implementing Serializable interface.