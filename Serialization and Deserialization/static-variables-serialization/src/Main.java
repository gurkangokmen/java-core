import java.io.*;

/**
 * Static variables are not serialized in Java.
 */
public class Main {
    public static void main(String[] args) {
        try {
            // Creating an object to serialize
            MyClass object = new MyClass();

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

            MyClass.staticMessage = "New Static Abagai is from New Static Khuzait";

            // Using the deserialized object
            System.out.println("After Deserialization:");
            System.out.println("Static Value = " + obj.staticMessage);
            System.out.println("Instance Value = " + obj.instanceMessage);

            //
            // Output:
            //

            // After Deserialization:
            // Static Value = New Static Abagai is from New Static Khuzait
            // Instance Value = Instance Abagai is from Instance Khuzait

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}