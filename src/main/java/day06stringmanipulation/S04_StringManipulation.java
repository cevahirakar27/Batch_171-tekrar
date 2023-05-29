package day06stringmanipulation;

import java.util.Scanner;

public class S04_StringManipulation {
    public static void main(String[] args) {
            /*
        Kullanıcıdan adını, ikinci adını ve soyadını tek bir satırda girmesini isteyin.
        Ardından ikinci adın ve soyadın ilk karakterini yazdırın.
        Örnek: Mark Hansel Twain ==> HT
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi, ikinci adinizi ve soyadinizi giriniz");
        String adSoyad = scan.nextLine();

        char ikinciAd = adSoyad.split(" ")[1].toUpperCase().charAt(0);

        char soyad = adSoyad.split(" ")[2].toUpperCase().charAt(0);
        System.out.println(ikinciAd+ "" +soyad);
    }
}
