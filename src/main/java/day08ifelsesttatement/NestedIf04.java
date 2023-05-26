package day08ifelsesttatement;

import java.util.Scanner;

public class NestedIf04 {
    public static void main(String[] args) {


       // Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
       // yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi giriniz");
        char cinsiyet = scan.next().charAt(0);
        System.out.println("lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (cinsiyet == 'K' || cinsiyet == 'k'){
            if (yas >= 60){
                System.out.println("bayan emekli olabilir");
            }else {
                System.out.println("emekli olamak icin " + (60-yas) + " " + " yil daha calismalisin");
            }
        }    else if (cinsiyet == 'e' || cinsiyet == 'E'){
            if (yas>=65){
                System.out.println("erkek emekli olabilirsin");
            }else {
                System.out.println("emekli olmak icin " + (65-yas)+ " " +" daha calismalisin");
            }

            }else {
            System.out.println("gecersiz karakter");
        }
    }
}
