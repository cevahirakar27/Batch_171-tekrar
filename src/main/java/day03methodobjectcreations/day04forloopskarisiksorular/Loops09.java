package day03methodobjectcreations.day04forloopskarisiksorular;

import java.util.Scanner;

public class Loops09 {
    public static void main(String[] args) {

        //Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan = new Scanner( System.in);
        System.out.println("lutfen 2 poz tam sayi girin");
        int bas = scan.nextInt();
        int bitis = scan.nextInt();
        int top = 0;

        if (bitis<bas){
            System.out.println("uyari");
        }
        for (int i =bas ; i <= bitis ; i++){
            top = top+i;

        }
        System.out.print("toplam = " +top);
    }
}
