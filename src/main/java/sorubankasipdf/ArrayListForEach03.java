package sorubankasipdf;

import java.util.Arrays;
import java.util.List;

public class ArrayListForEach03 {

    public static void main(String[] args) {


      //  String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini
      //  alınız.

              String arr[] = {"Kemal","Jonathan","Mark","Jackson","Ali"};  // JMJ

        for (String w : arr){
            if (w.endsWith("n") || w.endsWith("k")){
                System.out.println(w.substring(0, 1));
            }
        }






    }
}
