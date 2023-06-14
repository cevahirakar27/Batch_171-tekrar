package sorubankasipdf;

import java.util.ArrayList;
import java.util.List;

public class List05 {
    public static void main(String[] args) {


      //  Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
       // Örnek: (12, 11, 15, 34,15, 43);     ==>  Çıktı (12, 11, 51, 34,51, 43)
        List<Integer> g = new ArrayList<>();
        g.add(12);
        g.add(11);
        g.add(15);
        g.add(34);
        g.add(15);
        g.add(43);
        System.out.println(g);  // [12, 11, 15, 34, 15, 43]

        for (int w : g){
           g.set(g.indexOf(15),51);
            System.out.println(g);   // [12, 11, 51, 34, 51, 43]

        }

    }
}
