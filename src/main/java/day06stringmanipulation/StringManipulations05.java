package day06stringmanipulation;

import java.util.Scanner;

public class StringManipulations05 {
    public static void main(String[] args) {
        /*
        Soru 3 : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
input : java1 ogRe2@nMek3 #ne +Gu=zel
output : Java ogrenmek ne guzel.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir metin giriniz");
        String metin = scan.nextLine();
       char ilkHarf = metin.toUpperCase().charAt(0);

        metin=metin.substring(1).toLowerCase();



        metin= metin.replaceAll("[^a-zA-Z]","");



        System.out.println(ilkHarf+metin);
    }
}
