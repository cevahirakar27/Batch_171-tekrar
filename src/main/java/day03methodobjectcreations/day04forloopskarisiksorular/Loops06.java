package day03methodobjectcreations.day04forloopskarisiksorular;

import java.util.Scanner;

public class Loops06 {
    public static void main(String[] args) {

                /*
        Example 1: Kullanicidan baslangic ve bitis degerlerini alin.
        Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari ekrana yazdiriniz
        9 - 14 ==> 10  12  14
     */

        Scanner scan = new Scanner( System.in);
        System.out.println("lutfen baslangic ve bitis sayisini giriniz");
        int start = scan.nextInt();
        int end = scan.nextInt();
        if (start>end){
            System.out.println("baslangic bitisten buyuk olamaz");
        }else {
            for (int i = start ; i<=end ; i++){
                if (i %2 == 0){
                    System.out.println(i);
                }
            }
        }
    }
}
