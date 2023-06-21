package day03methodobjectcreations.day04forloopskarisiksorular;

import java.util.Scanner;

public class Loops11 {
    public static void main(String[] args) {

        //Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin.

        Scanner scan = new Scanner(System.in);
        System.out.println("20 den kucuk bir poz tamsayi giriniz");
        int sayi = scan.nextInt();
        int fakt=1;
        for (int i = sayi ; i>=1 ; i--){
            fakt= fakt*i;

        }
        System.out.print("faktoriyel = " + fakt);

    }
}
