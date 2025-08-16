public class Bmw extends Car{

    public Bmw() {
        System.out.println("Vehicle constructor");
    }
    public Bmw(String color) {
        this.color = color;
    }

    @Override
    public void drive() {
        System.out.println("Driving a bmw");
    }

    public String color = "Black";
}
