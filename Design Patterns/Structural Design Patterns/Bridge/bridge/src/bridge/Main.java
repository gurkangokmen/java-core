package bridge;

public class Main {
	public static void main(String[] args) {
        Color red = new Red();
        Color blue = new Blue();

        Shape square = new Square(red);
        Shape circle = new Circle(blue);

        System.out.println(square.draw());
        System.out.println(circle.draw());
    }
}
