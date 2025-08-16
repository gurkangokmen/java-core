import java.io.*;

/**
 * Transient variables are not serialized.
 */
public class Main {
    public static void main(String[] args) {
        try {
            // Creating an object to serialize
            MyClass object = new MyClass("Simge Sağın","Hello, World!");

            // Serializing the object
            FileOutputStream file = new FileOutputStream("data.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);
            out.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // Deserializing the object
            FileInputStream fileIn = new FileInputStream("data.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            MyClass obj = (MyClass) in.readObject();
            in.close();
            fileIn.close();

            // Using the deserialized object
            System.out.println("Message from deserialized object: " + obj.getMessage() + ", "+obj.getTransientMessage());

            // Output: Message from deserialized object: Hello, World!, null
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}