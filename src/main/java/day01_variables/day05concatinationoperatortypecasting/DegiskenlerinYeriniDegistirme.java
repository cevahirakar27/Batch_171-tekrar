package day01_variables.day05concatinationoperatortypecasting;

import java.util.Scanner;

public class DegiskenlerinYeriniDegistirme {

    public static void main(String[] args) {

        // Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin yerlerini degistirin

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");

        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        sayi1 = sayi1+sayi2;
        sayi2 = sayi1-sayi2;
        sayi1 = sayi1-sayi2;
        System.out.println("sayi1 = " +sayi1);
        System.out.println("sayi2 = " +sayi2);



    }
}
