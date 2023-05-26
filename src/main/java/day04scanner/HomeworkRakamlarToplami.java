package day04scanner;

import java.util.Scanner;

public class HomeworkRakamlarToplami {
    public static void main(String[] args) {


        //2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
        // ornegin => 312 icin 3+1+2=6

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen 3 basmakli bir sayi giriniz");
        int sayi = input.nextInt();
        int birlerBas ;
        birlerBas=sayi%10;
        sayi = sayi / 10;

        int sondanIkinciSayi = sayi%10;
        sayi = sayi/10;

        int sondanUcuncuSyi = sayi%10;

        System.out.println("rakamlar toplami = " +(birlerBas+sondanIkinciSayi+sondanUcuncuSyi));



    }
}