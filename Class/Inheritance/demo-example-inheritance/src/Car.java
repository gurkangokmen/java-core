// Derived class
public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
        this.brand = brand;
        this.numberOfDoors = numberOfDoors;
    }

    public void drive() {
        System.out.println("Driving the car...");
    }
}
