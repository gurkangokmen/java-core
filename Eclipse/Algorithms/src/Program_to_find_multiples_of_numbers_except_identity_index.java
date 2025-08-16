

public class Program_to_find_multiples_of_numbers_except_identity_index {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4};
		int index = 3;
		
		int result = 1;
		
		int i = 0;
		do {
			result = result * numbers[i];
			i++;
		} while (i < numbers.length-1 && i!=index);
		
		System.out.print(result);,
	}
}
