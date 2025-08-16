import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Print even numbers
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        // Multiply even numbers by 2, then print
        numbers.stream().filter(n -> n % 2 == 0).map(n -> n * 2).forEach(System.out::println);
    }
}
