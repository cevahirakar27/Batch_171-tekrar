package karisiksorular;

import java.util.Scanner;

public class DoWhileLoopSifre {
    public static void main(String[] args) {

        //kullanicidan sifre isteyin dogru sifre girene kadar islemi tekraralamasini isteyin.
        //gecerli isfre girdiginde "sifreniz kabul edilmistir" yazdirin
        // sifre kucuk harf icermeli
        // ozel karakter icermeli
        // buyuk harf icermeli
        // en az 8 karakter olmali

        Scanner scan = new Scanner(System.in);


        do {
            System.out.println("lutfen sifreniz giriniz");
            String sifre = scan.nextLine();

           if (
              sifre.replaceAll("[^a-z]", "").length() > 0 &&


              sifre.replaceAll("[^A-Z]", "").length() > 0 &&

              sifre.length() > 8 &&

              sifre.replaceAll("[^\\p{Punct}]", "").length() > 0){
               System.out.println("sifreniz kaydedildi");
               break;

           }else {

           }
        } while (true);

    }

}
