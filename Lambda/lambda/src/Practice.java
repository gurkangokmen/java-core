import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Practice {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Consumer<? super Integer> x = (n) -> {
            System.out.println(n);
        };
        numbers.forEach(x);
    }
}
