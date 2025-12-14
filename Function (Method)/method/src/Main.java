public class Main {
    public static void main(String[] args) {
        sum(1,2,3);
    }

    public static void sum(int... numbers) {
        for(int i = 0 ; i<= numbers.length-1 ; i++) {
            System.out.println(numbers[i]);
        }
    }
}
