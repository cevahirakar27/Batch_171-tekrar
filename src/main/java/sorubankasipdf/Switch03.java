package sorubankasipdf;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
/*
        Verilen ay numaralarından başlayarak tüm ay adlarını yazdıran bir kod yazınız.
                Örnek: Ay numarası 9 ise konsolda kodunuz Eylül Ekim Kasım Aralık olacaktır
                */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ay numarsini giriniz");
        int ayNo = scan.nextInt();

        switch (ayNo){
            case 1:
                System.out.println("ocak");

            case 2:
                System.out.println("subat");
            case 3 :
                System.out.println("mart");
            case 4:
                System.out.println("nisan");
            case 5 :
                System.out.println("mayis");
            case 6:
                System.out.println("haziran");
            case 7:
                System.out.println("temmuz");
            case 8:
                System.out.println("agustos");
            case 9:
                System.out.println("eylul");
            case 10:
                System.out.println("ekim");
            case 11:
                System.out.println("kasim");
            case 12:
                System.out.println("aralik");
                break;
            default:
                System.out.println("gecersiz ay numarasi");

        }


    }
}
