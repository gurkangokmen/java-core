package singleton;

public class SingletonPatternDemo {
	   public static void main(String[] args) {

	      //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
	      SingleObject object = SingleObject.getInstance();
	      SingleObject object2 = SingleObject.getInstance();
	      
	      System.out.println(object); //singleton.SingleObject@626b2d4a =====> same object with "object2"
	      System.out.println(object2); //singleton.SingleObject@626b2d4a =====>same object with "object"
	      
	      //show the message
	      object.showMessage();
	   }
	}
