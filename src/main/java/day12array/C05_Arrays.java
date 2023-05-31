package day12array;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {

        //Arrayleri kisa yoldan nasil olusturabiliriz?
        int arr[] = {63, 2, 313, 8, 7, 100, 4};
        System.out.println(Arrays.toString(arr));//[63, 19, 313, 353, 7, 100, 4]

        //Ornek 1: Verilen array de kac tane cift sayi kac tane tek sayi oldugunu bulan kodu yaziniz.

        int sayac = 0;
        for (int w : arr) {
            if (w%2==0){
                sayac++;

            }

        }      System.out.println("cift sayi sayisi : " +sayac);
        System.out.println("tek sayi sayisi : " +(arr.length-sayac));


        //Ornek 2:Size verilen bir String arraydeki isimlerden 5 character den az character icerenleri console a yazdiriniz

        String  stdNames [] =  new String [5];
        stdNames [0] ="Ajda";
        stdNames [3] ="Cuneyt";
        stdNames [2] ="Tom";
        stdNames [1] ="Ayhan";
        stdNames [4] ="Filiz";

        System.out.println(Arrays.toString(stdNames));
        for ( String w : stdNames){
            if (w.length()<5) {
                System.out.println(w);    //  [Ajda, Ayhan, Cuneyt, Filiz, Tom]

            }
        }


        //Ornek 3: Size verilen bir string array deki isimleri alfabetik siraya koyduktan sonra
        // "F" ile baslayan isimler haric diger isimleri console a yazdiriniz

        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames));



        //Ornek 3: Size verilen bir string array deki isimleri alfabetik siraya koyduktan sonra
        // "F" ile baslayan isimler haric diger isimleri console a yazdiriniz

        //Note 1: sort() methodu sayisal data type lari kucukten buyuge siralar (ascending order)
        //Note 2: sort() methodu String data type lari alfabetik olarak siralar (alphabetical order)
        //Note 3: ascending order  +  alphabetical order ==> Natural Order
        //Note 4: sort() methodu array elemanlarini "Natural Order" a gore siralar

        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames));  // [Ajda, Ayhan, Cuneyt, Filiz, Tom]

        for (String w  : stdNames){
            if (!(w.charAt(0)=='F')){
                System.out.print(" " +w);    //Ajda,Ayhan,Cuneyt,Tom

            }
        }



    }

}