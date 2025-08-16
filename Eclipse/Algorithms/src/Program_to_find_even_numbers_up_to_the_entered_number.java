import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Program_to_find_even_numbers_up_to_the_entered_number {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Enter positive number:");
		int number = read.nextInt();
		
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i <= number; i++) {
			
			if (i%2==0) {result.add(i);}
			
		}
		
		System.out.println(result);
	}

}
