// Base class

// Did you notice the protected modifier in Vehicle?
// We set the brand attribute in Vehicle to a protected access modifier. If it was set to private, the Car/Motorcycle class would not be able to access it.

public class Vehicle {
    protected String brand;

    public void honk() {
        System.out.println("Honk honk!");
    }
}
