package day12array;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        String arr [] = new String [5];
        arr [0] = "berrin";
        arr [1] = "ali";
        arr [2] = "enes";
        arr [3] = "ayse";
        arr [4] = "veli";
        System.out.println(Arrays.toString(arr));   //[berrin, ali, enes, ayse, veli]

        System.out.println(arr[1]);  //ali
        System.out.println(arr[3]);  // ayse
        System.out.println(arr[2]); // enes
        System.out.println(arr[0]);  //berrin
        System.out.println(arr[4]);  // veli

        //
        //Ornek1 : Arraydeki her elemanin sonuna ! koyalim
        // lenght stringlerde method (), arraylerde ise parantezsiz yazilir

        for (int i = 0; i < arr.length; i++) {
            String yeni = arr[i]+"!";
            System.out.println(yeni);

        }

        }



    }

