package day04forloopskarisiksorular;

import java.util.Scanner;

public class Loops15 {
    public static void main(String[] args) {

        //ornek hic sayi kullanmadan 1 den 100 e kadar olan sayilari yazdirin

        for (int i = 'd'/'d'; i <= 'd' ; i++) {
            System.out.print(i+ " ");

        }

        /*   Example 1: Kullanicidan baslangic ve bitis degerlerini alin.
             Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari ekrana yazdiriniz
             9 - 14 ==> 10  12  14     */

        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen baslangic ve bitis degerlerini giriniz");
        int start = scan.nextInt();
        int end = scan.nextInt();
        if (start>end){
            System.out.println("baslangic bitisten buyuk olamaz");
        }

        for (int i = start; i <= end ; i++) {
            if (i % 2 == 0){
                System.out.print(i+ " ");
            }

        }


    }
}
