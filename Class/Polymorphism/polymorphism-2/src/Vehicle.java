public class Vehicle {

    public Vehicle() {
        System.out.println("Vehicle constructor");
    }

    public Vehicle(String color) {
        this.color = color;
    }

    public void drive() {
        System.out.println("Driving a vehicle");
    }

    public String color = "Red";
}
