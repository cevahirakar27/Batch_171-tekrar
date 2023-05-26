package day08ifelsesttatement;

import java.util.Scanner;

public class NestedIfMusteri {
    public static void main(String[] args) {


        //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //%20 indirim yapin, 10 urunden az alirsa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15,  10 urunden az alırsa %10 indirim yapin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen urun adedinizi  giriniz");
        int urunAdedi = scan.nextInt();
        System.out.println("lutfen liste fiyatini giriniz");
        double liste = scan.nextDouble();
        System.out.println("musteri kartiniz var mi?  (evet/hayir)");
        String musteriKarti = scan.next();

        if (musteriKarti.equalsIgnoreCase("evet")){
            if (urunAdedi>10) {
                System.out.println("odeme miktari = " +(liste-liste*0.2));
            }else {
                System.out.println("odeme miktari =" + (liste-liste*0.15));
            }

        } else if (musteriKarti.equalsIgnoreCase("hayir")) {
            if (urunAdedi>10) {
                System.out.println("odeme miktari =" + (liste-liste*0.15));
            }else {
                System.out.println("odeme miktari =" +(liste-liste*0.1));
            }

        }

    }
}
