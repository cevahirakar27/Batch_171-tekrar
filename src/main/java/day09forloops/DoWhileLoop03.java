package day09forloops;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {

           /*
            Kullanicidan bir tamsayi aliniz
            Tamsayi 100'den kucuk ise kullaniciya "Kaybettiniz!" mesaji vererek oyunu sonlandiriniz
            Tamsayi 100 ve 100'den buyuk ise "Kazandiniz!" mesaji vererek oyuna devam ettiriniz
         */

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("lutfen bir tam sayi giriniz");
            int num = scan.nextInt();
            if (num>=100){
                System.out.println("kazandiniz");
            }else {
                System.out.println("kaybettiniz");
                break;
            }

        }while (true);

    }
}
