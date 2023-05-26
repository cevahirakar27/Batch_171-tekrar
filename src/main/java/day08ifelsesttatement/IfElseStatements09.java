package day08ifelsesttatement;

import java.util.Scanner;

public class IfElseStatements09 {
    public static void main(String[] args) {

        //Ornek: Verilen bir sayinin pozitif, negatif yada notr oldugunu kontrol eden kodu yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi>0){
            System.out.println("pozitif");
        } else if (sayi<0) {
            System.out.println("negatif");

        }else {
            System.out.println("notr");
        }

    }
}
