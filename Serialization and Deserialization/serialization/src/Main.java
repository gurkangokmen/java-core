import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {


        try {
            // Creating an object to serialize
            MyClass object = new MyClass("Hello, World!");

            // Serializing the object
            FileOutputStream file = new FileOutputStream("data.ser"); //Creates a new file and open file for writing (You cannot delete file while it is open)
            ObjectOutputStream out = new ObjectOutputStream(file); //Establishing a pipeline for writing serialized Java objects to the file. The data is not yet converted to a byte stream at this point; instead, out is set up to perform this conversion when writeObject is called.
            out.writeObject(object); //This line serializes the object "object" (converts the object into a byte stream representation) and writes its serialized form to the file associated with the "ObjectOutputStream" instance "out".
            out.close(); //When this line is executed, you can delete the file because the file is closed.
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}