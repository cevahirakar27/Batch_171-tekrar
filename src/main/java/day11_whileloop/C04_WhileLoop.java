package day11_whileloop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {

        /*
            Kullanicidan bir tamsayi aliniz
            Tamsayi 100'den kucuk ise kullaniciya "Kaybettiniz!" mesaji vererek oyunu sonlandiriniz
            Tamsayi 100 ve 100'den buyuk ise "Kazandiniz!" mesaji vererek oyuna devam ettiriniz
         */

        Scanner scan = new Scanner(System.in);


        do {
            System.out.println("lutfen bir tam sayi giriniz");
            int sayi = scan.nextInt();


            if (sayi<100){
                System.out.println("kaybettiniz");
                break;

            }else {
                System.out.println("kazandiniz");
            }


        }while (true);
    }
}
