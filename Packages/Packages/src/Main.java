//build-in
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Ad: ");

        String isim = read.nextLine();

        System.out.println("Merhaba " + isim);
    }
}