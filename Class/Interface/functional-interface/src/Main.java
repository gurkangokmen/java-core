/**
 * <h1>Functional Interface</h1>
 *
 * <br>Lambda expressions provide
 * <br>a concise way to implement the abstract method of a functional interface.
 * <br>You don’t need to create a separate class
 * <br>or
 * anonymous class to implement the interface.
 */

public class Main {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;

        int result1 = add.calculate(5, 10);       // Output: 15
        int result2 = multiply.calculate(5, 10);  // Output: 50

        System.out.println("Result 1: " + result1 + "\nResult 2: " + result2);

    }
}