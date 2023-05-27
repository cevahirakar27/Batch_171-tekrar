package day11_whileloop;

import java.util.Scanner;

public class C10_WhileLoop {
    public static void main(String[] args) {

        //Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        //dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen baslangic ve bitis degerlerini giriniz");

        int start = scan.nextInt();
        int end = scan.nextInt();
        int top =0;
        if (end<=start){
            System.out.println("UYARİ!!");
        }else {
            for (int i = start; i <=end ; i++) {
               top+=i;
            }
            System.out.println("toplam = " +top);
        }

    }
}