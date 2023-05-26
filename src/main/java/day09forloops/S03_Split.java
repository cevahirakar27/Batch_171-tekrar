package day09forloops;

import java.util.Scanner;

public class S03_Split {
    public static void main(String[] args) {
         /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız.
       Ad ayrı, soyad ayrı sekilde ekrana yazdırınız.
       Örnek:
          Ad: Ali
          Soyad: Can
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ad ve soyadinizi giriniz");
        String adSoyad = scan.nextLine();

        String ad = adSoyad.split(" ")[0];
        System.out.println("Ad : " + ad);
        String soyIsim = adSoyad.split(" ")[1];
        System.out.println("Soyisim :" +soyIsim);
    }
}
