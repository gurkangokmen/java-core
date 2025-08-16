import java.util.Random;
import java.util.Scanner;

public class ArithmeticQuizGame {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numQuestions = 5; // Kaç soru sorulacak
        int correctAnswers = 0; // Doğru cevap sayısı

        System.out.println("Dört İşlem Soru Oyununa Hoş Geldiniz!\n");

        for (int i = 1; i <= numQuestions; i++) {
            int num1 = random.nextInt(10) + 1; // 1-10 arası rastgele sayı
            int num2 = random.nextInt(10) + 1; // 1-10 arası rastgele sayı
            char operator = randomOperator(); // Rastgele operatör seçimi

            // Soruyu ekrana yazdırma
            System.out.print("Soru " + i + ": ");
            System.out.print(num1 + " " + operator + " " + num2 + " = ");

            // Kullanıcıdan cevap alma
            int userAnswer = scanner.nextInt();

            // Doğru cevabı hesaplama
            int correctAnswer = calculateAnswer(num1, num2, operator);

            // Kullanıcının cevabını kontrol etme
            if (userAnswer == correctAnswer) {
                System.out.println("Doğru!");
                correctAnswers++;
            } else {
                System.out.println("Yanlış! Doğru cevap: " + correctAnswer);
            }

            System.out.println();
        }

        // Oyun sonu puanını ekrana yazdırma
        System.out.println("Oyun bitti!");
        System.out.println("Toplam doğru cevap sayısı: " + correctAnswers + "/" + numQuestions);

        scanner.close();
    }

    // Rastgele bir operatör seçen metod
    public static char randomOperator() {
        Random random = new Random();
        char[] operators = {'+', '-', '*', '/'};
        return operators[random.nextInt(operators.length)];
    }

    // İşlemi hesaplayan metod
    public static int calculateAnswer(int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                // Sıfıra bölme hatasını önlemek için kontrol
                if (num2 == 0) {
                    return 0; // Geçersiz işlem, sonuç 0 olarak dönebilir
                } else {
                    return num1 / num2;
                }
            default:
                return 0; // Hata durumu, normalde bu noktaya gelmemeli
        }
    }
}
