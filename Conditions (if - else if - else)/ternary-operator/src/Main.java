/**
 * Ternary Operator
 * <p> Syntax: variable = (condition) ? expressionTrue :  expressionFalse;
 */
public class Main {
    public static void main(String[] args) {
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result); // Output: Good evening.
    }
}