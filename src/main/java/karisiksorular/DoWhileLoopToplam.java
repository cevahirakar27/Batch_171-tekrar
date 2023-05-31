package karisiksorular;

import java.util.Scanner;

public class DoWhileLoopToplam {
    public static void main(String[] args) {

        //Kullanicidan Kullanicidan sifre
        //isteyin asagidaki sartlari saglamayan
        //sifrelerde hatalari yazdirip,
        //kullanicinin yeni sifre girmesi isteyin
        //Gecerli bir sifre yazilincaya kadar bu
        //islemi tekrar edin gecerli sifre
        //yazilinca “sifreniz basari ile
        //kaydedildi” yazdirin
        //sartlar :
        //- sifrenin ilk karakteri kucuk harf
        //olmali
        //- sifrenin son karakteri rakam olmali
        Scanner scan = new Scanner(System.in);
        int sayac = 0;

        while (true) {


            System.out.println("lutfen sifrenizi giriniz");
            String sifre = scan.nextLine();

            if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
                System.out.println("ilk karakter kucuk harf olmali");
                sayac++;
                continue;

            }
            if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
                System.out.println("son karakter rakam olmali");
                sayac++;


            } else {
                System.out.println("sifreniz basariyla kaydedildi");


                break;

            }


        }System.out.println("hatali giris sayisi : "+ sayac);

    }
}
