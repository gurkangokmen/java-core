import java.io.*;

/**
 * Case 1: If the superclass is serializable, then subclass is automatically serializable
 */
public class Main {
    public static void main(String[] args) {
        try {
            // Creating an object to serialize
            MySubClass object = new MySubClass("Super Hello, World!","Sub Hello, World!" );

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
            MySubClass obj = (MySubClass) in.readObject();
            in.close();
            fileIn.close();

            // Using the deserialized object
            System.out.println("Superclass field: " + obj.superClassField);
            System.out.println("Subclass field: " + obj.subClassField);

            // Output:
            // Superclass field: Super Hello, World!
            // Subclass field: Sub Hello, World!

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }
    }
}