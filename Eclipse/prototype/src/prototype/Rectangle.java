package prototype;

public class Rectangle implements CloneableShape {
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public CloneableShape clone() {
        return new Rectangle(width, height);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }
}
