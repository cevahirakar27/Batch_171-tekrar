package day11_whileloop;

import java.util.Scanner;

public class C12_WhileLoop {
    public static void main(String[] args) {

        //Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin 5! =5*4*3*2*1

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 20 den kucuk bir poz tamsayi giriniz ");
        byte sayi = scan.nextByte();
        int fak= 1;
        String hesap = sayi +"!";

        for (int i = sayi; i >=1 ; i--) {
            fak= fak*i;

        }
        System.out.println(hesap );

    }
}
