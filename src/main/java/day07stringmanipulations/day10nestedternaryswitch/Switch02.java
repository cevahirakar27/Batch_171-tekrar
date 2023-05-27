package day07stringmanipulations.day10nestedternaryswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        //Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini
        //           yazdiran kodu yaziniz.
        //           8 ==> August - September - October - November - December


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ay numarasini giriniz");
        byte ayNum = scan.nextByte();

        switch (ayNum){
            case 8:
                System.out.println("agustos");
            case 9:
                System.out.println("eylul");
            case 10:
                System.out.println("ekim");
            case  11:
                System.out.println("kasim");
            case 12:
                System.out.println("aralik");
                break;
            default:
                System.out.println("hatali giris");
        }
    }
}
