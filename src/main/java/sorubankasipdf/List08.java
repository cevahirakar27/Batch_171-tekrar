package sorubankasipdf;

import java.util.ArrayList;
import java.util.List;

public class List08 {
    public static void main(String[] args) {

       // Listedeki 7 veya 10 dışındaki her öğenin değerini 2'şer artırınız.
       // Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)
        List<Integer> h = new ArrayList<>();
        h.add(12);
        h.add(31);
        h.add(7);
        h.add(13);
        h.add(10);

        for (int w : h){
            if (!(w==7 || w==10)){


            h.set(h.indexOf(w),w+2);
        }

    }System.out.println(h);   // [14, 33, 7, 15, 10]


        // liistin belli bir bolumunu alma

        List<Integer>arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);      // [1, 2, 3, 4, 5]

        System.out.println(arr.subList(1, 4));


    }
}
