package day08ifelsesttatement;

import java.util.Scanner;

public class NestedIf07 {
    public static void main(String[] args) {

        //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15,  10 urunden az alırsa %10 indirim yapin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen urun adedinizi giriniz ");
        int urunAdedi = scan.nextInt();

        System.out.println("lutfen liste fiyatinizi giriniz");
        int listeFiyati = scan.nextInt();
        System.out.println("musteri kartiniz var mi");
        boolean musteriKarti = scan.nextBoolean();
        if (musteriKarti == true) {
            if (urunAdedi > 10) {
                System.out.println(listeFiyati - (listeFiyati) * 20 / 100);
            } else {
                System.out.println(listeFiyati - (listeFiyati) * 15 / 100);
            }

        } else if (musteriKarti == false) {
            if (urunAdedi > 10) {
                System.out.println(listeFiyati - (listeFiyati) * 15 / 100);
            } else {
                System.out.println(listeFiyati - (listeFiyati) * 10 / 100);
            }

        }
    }
}