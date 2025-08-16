

public class Main {
	int x = 10;
	
	class InnerClass {
	    int y = 5;
	  }
	
	public static void main(String[] args) {
	
	    
	    Main mainObject = new Main();
	    Main.InnerClass myInner = mainObject.new InnerClass();
	    System.out.println(myInner.y + mainObject.x); // Outputs 15 (5 + 10)
	    
	}

}
