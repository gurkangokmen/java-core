import java.util.ArrayList;

public class ArrayListWrapperClass {

	public static void main(String[] args) {
		// Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, where primitive types cannot be used (the list can only store objects):
		ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
		ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid
	}

}
