package bridge;

//Refined Abstraction (Square)
public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    String draw() {
        return "Drawing a " + color.getColor() + " square.";
    }
}
