
public class Main {

	public static void main(String[] args) {
	      ShapeFactory shapeFactory = new ShapeFactory();

	      //get an object of Circle and call its draw method.
	      Shape shape1 = shapeFactory.getShape("CIRCLE"); // Shape shape1 = new Circle();

	      //call draw method of Circle
	      //Output: Inside Circle::draw() method.
	      shape1.draw();

	      //get an object of Rectangle and call its draw method.
	      Shape shape2 = shapeFactory.getShape("RECTANGLE"); // Shape shape1 = new Rectangle();

	      //call draw method of Rectangle
	      //Output: Inside Rectangle::draw() method.
	      shape2.draw();

	      //get an object of Square and call its draw method.
	      Shape shape3 = shapeFactory.getShape("SQUARE"); // Shape shape1 = Square();

	      //call draw method of square
	      //Output: Inside Square::draw() method.
	      shape3.draw();
	   }

}
