public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 4);
        myCar.honk();  // Inherited from Vehicle class
        myCar.drive(); // Specialized method in Car class
        System.out.println("Brand: " + myCar.brand); // Accessing protected attribute from Vehicle class

        Motorcycle myMotorcycle = new Motorcycle("Honda", false);
        myMotorcycle.honk(); // Inherited from Vehicle class
        myMotorcycle.ride(); // Specialized method in Motorcycle class
        System.out.println("Brand: " + myMotorcycle.brand); // Accessing protected attribute from Vehicle class
    }
}