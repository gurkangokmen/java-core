package lambda_using;

public class Main {

	public static void main(String[] args) {
		
		// Lambda expression for the Runnable interface
        Runnable myRunnable = () -> {
            System.out.println("Executing myRunnable with Lambda");
        };

        // Creating a new thread and passing the myRunnable instance to it
        Thread thread = new Thread(myRunnable);

        // Starting the thread
        thread.start();

        // Main thread continues to execute concurrently with the new thread
        System.out.println("Main method execution continues...");

	}

}
