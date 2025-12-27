import java.util.ArrayList;
import java.util.function.Consumer;

/**
 *
 * Lambda Expressions
 * <p> Syntax: parameter -> expression
 */
public class Main {
    public static void main(String[] args) {

        // Lambda expression way 1

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        numbers.forEach((n) -> {
            System.out.println(n);
        });



        /*
        // Lambda expression way 2
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };
        numbers.forEach(method);

         */

    }
}