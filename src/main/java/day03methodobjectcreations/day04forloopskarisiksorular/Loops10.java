package day03methodobjectcreations.day04forloopskarisiksorular;

import java.util.Scanner;

public class Loops10 {

    public static void main(String[] args) {

        //- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucuk olsa da program calissin.

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bas ve bitis degerlerini giriniz");
        int start = scan.nextInt();
        int end = scan.nextInt();
        int top = 0;
        for (int i = start ; i <=end ; i++){
            top = top+i;

        }
        System.out.print("toplam = " +top);
    }
}
