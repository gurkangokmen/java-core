package number_loop;

public class power_numbers {

	public static void main(String[] args) {
		// Power numbers
		int n = 2; 
		for (int i = 1; i <= 10; i++) {
            int result = (int) Math.pow(n, i);
            System.out.println("2^" + i + " = " + result);
        }

	}

}
