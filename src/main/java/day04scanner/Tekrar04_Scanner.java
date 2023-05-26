package day04scanner;

import java.util.Scanner;

public class Tekrar04_Scanner {
    public static void main(String[] args) {

        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //a)Alanini hesaplayiniz  ==> Kisa kenar * Uzun kenar
        //b)cevresini hesaplayiniz ==> 2*kisa kenar + 2*uzun kenar

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen kisa kenar ve uzun kenari giriniz");
        double kisaKenar = input.nextDouble();
        double uzunKenar = input.nextDouble();

        double alan = kisaKenar*uzunKenar;
        double cevre = (2*kisaKenar + 2*uzunKenar);

        System.out.println("Alan = " +alan);
        System.out.println("Cevre = " +cevre);

    }
}
