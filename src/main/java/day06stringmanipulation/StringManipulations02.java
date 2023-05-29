package day06stringmanipulation;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {

           /*
        ornek: asagidaki kurallara gore kullanicinin girdigi passwor du kontrol ediniz.
        1) en az 8 karakter olsun
        2) space karakteri passwordde olmasin
        3) en az 1 buyuk harf olsun
        4) en az 1 kucuk harf olsun
       5) en az 1 rakam olsun.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz");
        String password = input.nextLine();

        //1) en az 8 karakter olsun
        boolean karakterSayisi =password.length()>7;
      System.out.println("Karakter Sayisi = " + karakterSayisi);

        // 2) space karakteri passwordde olmasin
       boolean s1 = !password.contains(" ");
        System.out.println("s1 = " + s1);
        
        //3) en az 1 buyuk harf olsun
        boolean s2 = password.replaceAll("[^A-Z]","").length()>0;
        System.out.println("s2 = " + s2);
        
        // 4) en az 1 kucuk harf olsun
        boolean s3 = password.replaceAll("[^a-z]","").length()>0;
        System.out.println("s3 = " + s3);

        //    5) en az 1 rakam olsun.
        boolean s4 = password.replaceAll("[^0-9]","").length()>0;
        System.out.println("s4 = " + s4);

        System.out.println("password kontrol = " +(karakterSayisi && s1 && s2 && s3 && s4));
    }
}
