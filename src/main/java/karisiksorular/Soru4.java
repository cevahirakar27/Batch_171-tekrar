package karisiksorular;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {

       //Kullanicidan isim ve soyismini ayri ayri alin.
              //  - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
       // yazdirin
               // - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
       // harflerle yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi ve soy isminizi giriniz");
        String isim = scan.nextLine();
        String soyIsim =  scan.nextLine();

        if (isim.length()>soyIsim.length()){
           String s1 = isim.toUpperCase().charAt(0)+isim.toLowerCase().substring(1);
           String s2 =soyIsim.toUpperCase().charAt(0)+ soyIsim.toLowerCase().substring(1);

            System.out.println(s1+" "+ s2);
        }else {
            String s3 = isim.toUpperCase().charAt(0)+isim.substring(1).toLowerCase();
            String s4 = soyIsim.toUpperCase();
            System.out.println(s3+s4);

        }
    }
}
