package day12array;

import java.util.Arrays;

public class C04_ArraysElemanlari2Arttir {

    public static void main(String[] args) {

        // verilen bir array in tum elemanlarini 2 arttirin

        int arr [] = new int [4];
        arr [0] =  3;
        arr [1] = 23;
        arr [2] = 51;
        arr [3] = 8;
        System.out.println(Arrays.toString(arr));  // [3, 23, 51, 8]

        for ( int w :arr){
            int arttir = w +2;
            System.out.println(arttir);      // 5,25,53,10

        }

        // Verilen bir array’deki pozitif tamsayilari toplayin
        int brr [] = new int [3];
        brr [0] = -2;
        brr [1] = 3;
        brr [2] =5;
        int toplam = 0;
        for ( int k : brr){
            if (k>0){
                toplam = toplam+k;
            }

        } System.out.println("poz sayilar yoplami = " +toplam);

    }
}
