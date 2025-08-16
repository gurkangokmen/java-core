package StaticInnerClass;
class OuterClass {
	  int x = 10;

	  static class InnerClass {
	    int y = 5;
	    
	    
	  }
	}	

//An inner class can also be static, which means that you can access it without creating an object of the outer class:
public class Main {
  public static void main(String[] args) {
    OuterClass.InnerClass myInner = new OuterClass.InnerClass();
    System.out.println(myInner.y); // Outputs 5
  }
}

	
