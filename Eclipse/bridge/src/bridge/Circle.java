package bridge;

//Refined Abstraction (Circle)
class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    String draw() {
        return "Drawing a " + color.getColor() + " circle.";
    }
}
