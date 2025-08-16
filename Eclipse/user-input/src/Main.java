import java.util.Scanner;  // Import the Scanner class

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username, lastname and school: ");

	    String userName = read.nextLine();  // Read  Line
	    String lastName = read.next(); // Read Next Value
	    String schoolName = read.next();
	    
	    System.out.println("Username is: " + userName);  // Output user input
	    System.out.println("Lastname is: " + lastName);
	    System.out.println("School name is: " + schoolName);

	}

}
