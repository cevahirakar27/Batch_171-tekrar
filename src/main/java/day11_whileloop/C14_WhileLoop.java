package day11_whileloop;

import java.util.Scanner;

public class C14_WhileLoop {
    public static void main(String[] args) {


        /// kullanicidan toplanmak uzere poz tam sayilar alin.
        // islemi bitirmek icin '0' a basmasini soyleyin.
        //kullanici yanlislikia negatif sayi girerse o sayiyi dikkate almayin ve "negatif sayi giremzsiniz" yazdirin
        // ve basa donun
        //kullanici 0 a bastiginda toplam kac poz sayi girdigini yanlislikla kac negatif sayi grdigini ve
        //girdigi poz tam sayilarin toplaminin kac oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);
        int negatifSayac = 0;
        int pozSayac = 0;
        int toplam = 0;

        while (true) {
            System.out.println("lutfen toplanmak uzere pozitif tam sayilar giriniz");
            int sayi = scan.nextInt();

            if (sayi < 0) {
                System.out.println("negatif sayi giremezsiniz");
                negatifSayac++;
                continue;
            } else if (sayi>0) {
                toplam=toplam+sayi;
                pozSayac++;

            }
            else  {

                System.out.println("Girdiğiniz pozitif sayıların toplamı: " + toplam);
                System.out.println("Girdiğiniz pozitif sayı adedi: " + pozSayac);
                System.out.println("Yanlışlıkla girdiğiniz negatif sayı adedi: " + negatifSayac);

                break;

            }


        }


    }
}