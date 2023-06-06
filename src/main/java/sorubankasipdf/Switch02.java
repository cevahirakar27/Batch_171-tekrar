package sorubankasipdf;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {


        /*
        2) Ayın numarasını girdiğinizde ayın adını yazdırmak için bir switch ifadesi kullanınız.
Örneğin;
kullanıcı 1 girerse kodunuz "Ocak" yazmalıdır,
kullanıcı 2 girerse kodunuz "Şubat" yazmalıdır vb.
Kullanıcı geçersiz ay numarası girerse kodunuz "Geçersiz numara" yazmalıdır
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ay numarasini gir sana ismini soyleyeyim");
        int ayNumarasi = scan.nextInt();

        switch (ayNumarasi){
            case 1:
                System.out.println("ocak");break;
            case 2:
                System.out.println("subat");break;
            case 3 :
                System.out.println("mart");break;
            case 4:
                System.out.println("nisan");break;
            case 5 :
                System.out.println("mayis");break;
            case 6:
                System.out.println("haziran");break;
            case 7:
                System.out.println("temmuz");break;
            case 8:
                System.out.println("agustos");break;
            case 9:
                System.out.println("eylul");break;
            case 10:
                System.out.println("ekim");break;
            case 11:
                System.out.println("kasim");break;
            case 12:
                System.out.println("aralik");break;
            default:
                System.out.println("gecersiz ay numarasi");





        }
    }
}
