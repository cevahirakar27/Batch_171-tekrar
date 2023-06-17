package sorubankasipdf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List10 {
    public static void main(String[] args) {

        //Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
        //Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70


        List<String>liste = List.of("$12.99","$23.60","$54.45","$8.25");

        System.out.println(liste);         // [$12.99, $23.60, $54.45, $8.25]
        Double toplam = 0.0;

        List<Double> yeni= new ArrayList<>();

        for (String w : liste) {
            Double fiyat = Double.valueOf(w.replace("$", ""));
            yeni.add(fiyat);
        }
        Collections.sort(yeni);
        System.out.println(yeni);   // [8.25, 12.99, 23.6, 54.45]
       double sum = yeni.get(0)+yeni.get(yeni.size()-1);
        System.out.println(sum+ "$");     // 62.7
    }
}