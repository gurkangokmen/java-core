import java.io.*;

/**
 * If a class has a reference of another class, all the data members of that class also get serilized.
 */
public class Main {
    public static void main(String[] args) {
        try {
            // Creating an object to serialize
            Address address = new Address("New York", "NY");
            Employee employee = new Employee("John Doe", 30, address);

            // Serializing the object
            FileOutputStream file = new FileOutputStream("data.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(employee);
            out.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // Deserializing the object
            FileInputStream fileIn = new FileInputStream("data.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Employee obj = (Employee) in.readObject();
            in.close();
            fileIn.close();

            // Using the deserialized object
            System.out.println("Deserialized Employee:");
            System.out.println("Name: " + obj.name);
            System.out.println("Age: " + obj.age);
            System.out.println("City: " + obj.address.city);
            System.out.println("State: " + obj.address.state);

            //
            // Output:
            //

            // Deserialized Employee:
            // Name: John Doe
            // Age: 30
            // City: New York
            // State: NY

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}