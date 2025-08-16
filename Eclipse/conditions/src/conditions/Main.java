package conditions;

public class Main {

	public static void main(String[] args) {
		boolean myBoolValue = true;
		// Usage
		
		// if → ✅
		// if - if → ✅
		// if - else if → ✅
		// if - else → ✅
		// if - else if - else → ✅
		// else if - else → ❌
		// else → ❌
		// else if → ❌
		
		
		if (myBoolValue == true) {
			System.out.println("Here is if!");
		}
		
		else if (myBoolValue == true) {
			System.out.println("Here is else if!");
		}
						
		
		else {
			System.out.println("Here is else!");
		}
		

	}

}
