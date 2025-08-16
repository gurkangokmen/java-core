// Derived class
public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, boolean hasSidecar) {
        this.brand = brand;
        this.hasSidecar = hasSidecar;
    }

    public void ride() {
        System.out.println("Riding the motorcycle...");
    }

}
