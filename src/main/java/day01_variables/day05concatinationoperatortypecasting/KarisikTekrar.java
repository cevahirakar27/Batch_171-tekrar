package day01_variables.day05concatinationoperatortypecasting;

import java.util.Scanner;

public class KarisikTekrar {
    public static void main(String[] args) {

        // Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");

        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        int bos;

        bos = sayi1;
        sayi1= sayi2;
        sayi2= bos;
        System.out.println("sayi1 = " +sayi1);
        System.out.println("sayi2 = " + sayi2);



    }
}
