/**
 * <h1>Polymorphism:</h1>
 * <p>Fields left part
 * <p>Methods right part
 */

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
        Bmw bmw = new Bmw();
        System.out.println(bmw.color); // Black
        bmw.drive(); // Driving a bmw

        Car car = new Bmw();
        System.out.println(car.color); // Blue (If we remove the color field from Car class, it will print Red)
        car.drive(); // Driving a bmw

        Vehicle vehicle = new Bmw();
        System.out.println(vehicle.color); // Red (If we remove the color field from Vehicle class, it will throw error)
        vehicle.drive(); // Driving a bmw
    }
}