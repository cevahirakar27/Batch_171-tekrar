package sorubankasipdf;

import java.util.Arrays;

public class Array01 {

    public static void main(String[] args) {

        /*

        String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
        Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
         */

        String arr[] = {"kemal","jonathan","mark","angie","veli"};

        int minlengh = arr[0].length();

        for (String w : arr){
           minlengh =  Math.min(w.length(),arr[0].length());

        } System.out.println(minlengh);

        for (String w :arr){
              if (minlengh==w.length()){
                  System.out.println(w);   // mark , veli
              }
        }





    }
}
