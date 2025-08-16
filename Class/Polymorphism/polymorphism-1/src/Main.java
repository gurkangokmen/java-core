//
// Polymorphism
//

// Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
// Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.

//
// Why And When To Use "Inheritance" and "Polymorphism"?
//

// Code Reusability (fields and methods)
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(); // Polymorphism: Car object assigned to a Vehicle reference
        Vehicle vehicle2 = new Motorcycle(); // Polymorphism: Motorcycle object assigned to a Vehicle reference
        Motorcycle motorcycle = new Motorcycle();
        Vehicle vehicle = new Vehicle();

        vehicle1.drive(); // Calls the drive() method of Car class
        vehicle2.drive(); // Calls the drive() method of Motorcycle class
        motorcycle.drive();
        vehicle.drive();
    }
}