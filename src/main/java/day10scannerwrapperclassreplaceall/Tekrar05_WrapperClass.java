package day10scannerwrapperclassreplaceall;

import java.util.Scanner;

public class Tekrar05_WrapperClass {

    public static void main(String[] args) {

        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve
        // son iki basamagindaki rakamlarin toplamini yazdiran kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");
        int number = input.nextInt();

        int birlerBas;
        birlerBas = number %10;
        number= number/10;

        int sondanIkinciSayi = number %10;
        number = number/10;

        int sondanUcuncuSayi = number%10;
        number = number/10;

        int sondanDorduncuSayi= number%10;
        number = number/10;

        int sondanBesinciSayi = number%10;
        number = number/10;

        System.out.println(sondanBesinciSayi+sondanDorduncuSayi+sondanIkinciSayi+birlerBas);


        //ornek long data type nin minumum degeri ile byt data type nin max dgerinin toplamini bulunuz
         
        long min = Long.MIN_VALUE;
        System.out.println("min = " + min);
        long max = Long.MAX_VALUE;
        System.out.println("max = " + max);



    }
}
