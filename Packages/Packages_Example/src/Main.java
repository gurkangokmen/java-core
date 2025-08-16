import matematik.DortIslem;
import matematik.Logaritma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Build-in
        Scanner read = new Scanner(System.in);

        //Kendi Yazdığım
        DortIslem dortIslem = new DortIslem();
        dortIslem.toplam(2,3);

        Logaritma logaritma = new Logaritma();
        logaritma.logaritmaHesapla();
    }
}