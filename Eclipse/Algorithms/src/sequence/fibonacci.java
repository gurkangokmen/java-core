package sequence;

public class fibonacci {

	public static void main(String[] args) {
		// Definition: 
		// f(n) = f(n-1) + f(n-2)
		// {1,1,2,3,5,8,13,21,34,55,………}
		
		System.out.print(fibonacci(8));

	}
	
	// Generate fibonacci numbers up to nth Fibonacci number
	int n = 15;
	int first_number = 1;
	int second_number = 1;
	for () {
		
	}
	// Recursive function to calculate the nth Fibonacci number
	public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
