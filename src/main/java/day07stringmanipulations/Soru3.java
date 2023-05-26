package day07stringmanipulations;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {

        //: Kullanicidan alinan bir String alin, String’in uzunlugu tek sayi ise ortadaki harfi silin
        //:) koyun, String’in uzunlugu cift sayi ise tam ortasina yerine :( ekleyin
        //yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime = scan.nextLine();

         if (kelime.length()%2==0){
            String ch5 =kelime.substring(0,kelime.length()/2)+":(" +(kelime.substring(kelime.length()/2));
            System.out.println(ch5);
        }else {
             String ch6 = kelime.substring(0,kelime.length()/2)+":)"+(kelime.substring(kelime.length()/2+1));
             System.out.println(ch6);
         }
    }

}
