package day12array;

import java.util.Arrays;

public class C10_Arrays {
    public static void main(String[] args) {

        // verilen 3 elemanli bir arrayi saga kaydirn

        int arr[] = {1, 2, 3};
        System.out.println(Arrays.toString(arr));   // [1, 2, 3]


        int bos = arr[arr.length - 1];
        System.out.println(bos);
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i+1]=arr[i];


        }

        arr[0]=bos;
        System.out.println(Arrays.toString(arr));


        // yukaridaki arrayin tum elemanlarini topla.
        int toplam = 0;
        for (int w : arr){
            toplam = toplam+w;
        }
        System.out.println("toplam = " +toplam);
    }
}