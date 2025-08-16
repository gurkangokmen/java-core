import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    int age;
    Address address;  // Reference to another serializable class

    Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
