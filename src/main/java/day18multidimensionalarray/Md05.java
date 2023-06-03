package day18multidimensionalarray;

import java.util.Arrays;

public class Md05 {
    public static void main(String[] args) {

        int arr [][] = {{1,2},{3,4,5},{6,7}};
        // tum elemanlarin toplamini birer birer bulup yeni arrayi elemani yapan kodu yaziniz
        // [3,12,13

        int[] yeniDizi = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            int toplam = 0;

            for (int j = 0; j < arr[i].length; j++) {
                toplam += arr[i][j];
            }
            yeniDizi[i] = toplam;
        }

// Yeni diziyi ekrana yazdırma
        for (int eleman : yeniDizi) {
            System.out.print(eleman + " ");
        }


    }
}
