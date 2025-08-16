import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program_to_find_the_sum_of_odd_numbers_up_to_the_entered_number {

	public static void main(String[] args) {
Scanner read = new Scanner(System.in);
		
		System.out.print("Enter positive number:");
		int number = read.nextInt();
		
		int result = 0;
		for (int i = 0; i <= number; i++) {
			
			if (i%2==1) {
				result = result + i;
			}
			
		}
		
		System.out.println(result);

	}

}
