package day08ifelsesttatement;

import java.util.Scanner;

public class IfElseStatements02 {
    public static void main(String[] args) {

       // Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi % 5 == 0){
            System.out.println("Syi 5' in tam kati");
        }else {
            System.out.println("Sayi 5'in tam kati degil");
        }
    }
}
