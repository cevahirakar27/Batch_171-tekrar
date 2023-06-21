package day03methodobjectcreations.day04forloopskarisiksorular;

import java.util.Scanner;

public class NestedLoops02 {
    public static void main(String[] args) {

         /*
              Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                    X X X X X
                    X X X X X
                    X X X X X        */


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen satir ve sutun sayisini giriniz");
        int satir = scan.nextInt();
        int sutun = scan.nextInt();

        for (int k = 1; k <= satir; k++) {

            for (int l = 1; l <= sutun; l++) {
                System.out.print("X");

            }
            System.out.println();
        }
    }}
