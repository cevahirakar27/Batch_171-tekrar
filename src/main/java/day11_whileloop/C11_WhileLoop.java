package day11_whileloop;

import java.util.Scanner;

public class C11_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan toplanmak uzere poz tam sayilar alin.
        //islemi bitirmek icin '0' a basmasini soyleyin.kullanici 0 a bastiginda toplam kac poz sayi girdigini ve
        // girdigi poz poz sayilarin toplaminin kac oldugunu yazdirin

        Scanner scan = new Scanner(System.in);

       int sayac =0;
       int toplam =0;

       do {
           System.out.println("lutfen toplamak icin poz sayilar girin ve \n bitiırmek" +
                   "icin 0 a basin");

           int sayi = scan.nextInt();
           if (sayi != 0) {
               toplam = toplam + sayi;

               sayac++;

       }else {

               System.out.println("girdiginiz toplam " +sayac+ "sayinin toplami :" +toplam);

                   break;

           }



       }while (true);






    }
}
