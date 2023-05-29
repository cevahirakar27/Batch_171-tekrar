package day04forloopskarisiksorular;

import java.util.Scanner;

public class Loops12 {
    public static void main(String[] args) {

        //6- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 72


        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin 20'den küçük ");
        int sayi = scanner.nextInt();


        int faktöriyel = 1;
        String hesap = sayi + "! = ";

        for (int i2 = sayi; i2 >= 1; i2--) {
            faktöriyel *= i2;
            hesap += i2;

            if (i2 != 1) {
                hesap += " * ";



                hesap += " = " + faktöriyel;
                System.out.println(hesap);


            }
        }
    }

}