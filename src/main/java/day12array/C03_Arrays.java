package day12array;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        // ornek 1 : int bir array olusturun icine 6 eleman yerlestiriniz.bu elenanlarin en kucugu ile
        //en buyugunu yazdirin.

        int arr [] = new int [6];
        arr [0] =24;
        arr [1] =19;
        arr [2] =78;
        arr [3] =34;
        arr [4] =56;
        arr [5] =75;
        System.out.println(Arrays.toString(arr));   // [24, 19, 78, 34, 56, 75]
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));    // [19, 24, 34, 56, 75, 78]

        System.out.println(arr[0] +","+ arr[arr.length-1]);   // 19,78


        // 2.yol
        int min = arr [1];
        int max = arr [3]; // istedigimiz indexi koyabilirs.kıyaslama yapicaz

        for ( int w : arr){
           min =  Math.min(w,min);
              max = Math.max(w,max);

        } System.out.println("minumum = " +min);
        System.out.println("maksimum = " +max);









        // Ornek 2 :  string bir array olusturun 6 eleman ejkeyin.yellowdan onceki elemanlari yazdirin

        String color [] = new  String[6];
        color [0]="red";
        color [1]="orange";
        color [2]="blue";
        color [3]="yellow";
        color [4]="green";
        color [5]="brown";
        System.out.println(Arrays.toString(color));  //[red, orange, blue, yellow, green, brown]

        for ( String w : color){
            if (w.equals("yellow")){
                break;

            }

            System.out.println(w);     // red, orange, blue

        }



    }
}
