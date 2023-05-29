package day06stringmanipulation;

import java.util.Scanner;

public class Soru1 {
    /*
    Kullanicidan bir sifre isteyin
- en az 1 harf kucuk harf olmali
- en az 1 rakam olmali
- sifre bosluk icermemeli
- uzunlugu en az 10 karakter olmali
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String sifre = scan.nextLine();
        boolean s1 = sifre.replaceAll("[^a-z]","").length()>0;
        boolean s2 = sifre.replaceAll("[^0-9]","").length()>0;
        boolean s3 = !sifre.contains(" ");
        boolean s4 = sifre.length()>10;
        System.out.println("sonuc = " +(s1 && s2 && s3 && s4 ));

        
    }
}
