package day10scannerwrapperclassreplaceall;

import java.util.Scanner;

public class Tekrar03_Scanner {

    public static void main(String[] args) {

        //Ornek: Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen 1.sayiyi giriniz");
        double a = input.nextDouble();

        System.out.println("lutfen 2. sayiyi giriniz");
        double b = input.nextDouble();

        System.out.println("a+b = " +( a+b) );
        System.out.println("a-b = " +(a-b));
        System.out.println("a*b = " +(a*b));
        System.out.println("a/b = " + a/b);




    }
}
