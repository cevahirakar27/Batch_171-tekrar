package day12array;

import sorubankasi.Array;

import java.util.Arrays;

public class C11_Arrays {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4};
         // verilen elemanlari bir sola kaydriniz. output : [2,3,4,1]


        int brr [] = new int[arr.length];
        brr[brr.length-1] = arr[0];
        System.out.println(Arrays.toString(brr));  // [0, 0, 0, 1]


        int idx = 0;
        for (int i = 1; i<arr.length; i++){

            brr[idx]= arr[i];
            idx++;
        }
        System.out.println(Arrays.toString(brr));

        // yukaridaki arrayin tum elemanlarini toplayin.
        int toplam = 0;

        for (int w : arr){

            toplam = toplam+w;
        }
        System.out.print(toplam);
        System.out.println();



        // arr arrayini tersten yazdiralim
        for (int i = arr.length-1 ; i>= 0 ; i-- ){
            System.out.print(" " +arr[i]);
        }


    }
}
