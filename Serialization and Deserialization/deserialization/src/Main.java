import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Deserializing the object
            FileInputStream fileIn = new FileInputStream("data.ser"); //Opens the file for reading
            ObjectInputStream in = new ObjectInputStream(fileIn); //Establishing a pipeline for reading serialized Java objects from the file. The data is not yet converted to a Java object at this point; instead, in is set up to perform this conversion when readObject is called.
            MyClass obj = (MyClass) in.readObject(); //This line reads the serialized object from the file associated with the "ObjectInputStream" instance "in" and deserializes it (converts the byte stream representation back into an object). The object is then cast to the appropriate type.
            in.close(); //When this line is executed, you can delete the file because the file is closed.
            fileIn.close();

            // Using the deserialized object
            System.out.println("Message from deserialized object: " + obj.getMessage());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}