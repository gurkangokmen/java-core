package PrivateInnerClass;

class OuterClass {
  int x = 10;

  private class InnerClass {
    int y = 5;
  }
}
// Unlike a "regular" class, an inner class can be private or protected. If you don't want outside objects to access the inner class, declare the class as private
public class Main {

	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass();
	    OuterClass.InnerClass myInner = myOuter.new InnerClass();
	    System.out.println(myInner.y + myOuter.x);

	}

}
