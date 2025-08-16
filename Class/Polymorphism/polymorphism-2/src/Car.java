public class Car extends Vehicle{

    public Car() {
        System.out.println("Vehicle constructor");
    }

    public Car(String color) {
        //this.color = color;
    }

    @Override
    public void drive() {
        System.out.println("Driving a car");
    }

    //public String color = "Blue";
}
