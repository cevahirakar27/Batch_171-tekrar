package day08ifelsesttatement;

import java.util.Scanner;

public class NestedIfMusteriKarti {

    //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
    //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
    //%20 indirim yapin, 10 urunden az alirsa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
    //alirsa %15,  10 urunden az alırsa %10 indirim yapin
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen urun adedini giriniz");
        int urunAdedi = scan.nextInt();
        System.out.println("lutfen liste fiyatini giriniz");
        double listeFiyati = scan.nextDouble();
        System.out.println("musteri karti var mi? (Evet/Hayir");
        String musteriKartiVarMi = scan.next();


        if (musteriKartiVarMi.equalsIgnoreCase("evet")){
            if (urunAdedi>10){
                System.out.println("odeme miktari ="+(listeFiyati-listeFiyati*0.2));
            }else {
                System.out.println("odeme miktari = "+(listeFiyati-listeFiyati*0.15));
            }
        } else if (musteriKartiVarMi.equalsIgnoreCase("hayir")) {
            if (urunAdedi>10){
                System.out.println("odeme miktari = "+ (listeFiyati-listeFiyati*0.15));
            }else {
                System.out.println("odeme miktari = " +(listeFiyati-listeFiyati*0.1));
            }

        }
    }
        }


