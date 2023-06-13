package sorubankasipdf;

import java.util.Arrays;

public class Array02 {
    public static void main(String[] args) {

        /*

        ) Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı
             bulunuz.
          Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2
         */

        int arr [] = {-12,18,-5,23,-2};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));    // [-12, -5, -2, 18, 23]
        int min = arr[1];

        for (int i = 0 ; i< arr.length; i++){
            if (arr[i]<0 && arr[i+1]>0){
                System.out.println("min = "+ arr[i]);

                System.out.println("max = " + arr[i+1]);
            }

        }





    }
}
