package day12array;

import java.util.Arrays;
import java.util.Scanner;

public class C06_Arrays {
    public static void main(String[] args) {

// Ornek 1: Kullanicinin coklu data yi bir array e yerlestirebilmesi, istedigi zaman durdurabilmesi
        // icin gereken kodu yaziniz

        /*
        1)Kullanicidan data almak icin Scanner object olustur
        2)Coklu data yi yerlestirmek icin bir array olusturmaliyiz
        3)Array olusturabilmek icin kullanicidan array e kac tane eleman koyacagini almaliyiz
        4)loop olusturup eleman ekleme islemini tekrar tekrar yapabilmeliyiz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ogrenci sayisini giriniz");
        int ogrenciSyisi = scan.nextInt();
        String ogrenciAd [] = new String[ogrenciSyisi];

        for ( int i = 0; i<ogrenciAd.length ; i++){
            System.out.println((i+1)+ " . ogrenci adini giriniz");
            String name = scan.next();
            if (name.equals("q")){
                break;
            }else {
                ogrenciAd[i] = name;

            }

        }
        System.out.println(Arrays.toString(ogrenciAd));
    }
}
