package prototype;

//Client Code
public class PrototypeDemo {
	public static void main(String[] args) {
        // Create prototype instances
        CloneableShape circlePrototype = new Circle(10, 20, 30);
        CloneableShape rectanglePrototype = new Rectangle(40, 50);

        // Clone and use the prototypes
        CloneableShape clonedCircle = circlePrototype.clone();
        CloneableShape clonedRectangle = rectanglePrototype.clone();
        
        System.out.println(circlePrototype); //prototype.Circle@1c4af82c
        System.out.println(clonedCircle); //prototype.Circle@379619aa
        
        clonedCircle.draw();
        clonedRectangle.draw();
    }
}
