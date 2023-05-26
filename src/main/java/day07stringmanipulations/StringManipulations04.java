package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulations04 {
    public static void main(String[] args) {

/*
     Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod
      yaziniz
 */
        int a = 3;
        int b = 5;
        int c = 8;
        double ortalama =Double.valueOf(a+b+c)/3;
        System.out.println(ortalama);

        //Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scan = new Scanner( System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf = scan.next().charAt(0);
        System.out.println(""+(char)+ (harf+1)+(char) + (harf+2)+(char) +(harf+3));


        //Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        //ile 127 arasindaki bir sayiya donusturup yazdirin

         int sayi = scan.nextInt();
         byte sayi2 = (byte) sayi;
        System.out.println(sayi2);


    }
}
