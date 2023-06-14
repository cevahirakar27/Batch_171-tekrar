package sorubankasipdf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List09 {
    public static void main(String[] args) {


       // String bir listede verilen tüm fiyatların toplamını bulunuz.
       // Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04

        List<String > liste = new ArrayList<>();
        liste.add("$12.99");
        liste.add("$23.60");
        liste.add("$54.45");

        System.out.println(liste);   // [$12.99, $23.60, $54.45]

        double toplam  = 0;

        for (String w : liste){
          Double fiyat =  Double.valueOf(w.replace("$",""));
            System.out.println(fiyat);
            toplam = toplam+fiyat;
        }
        System.out.println("toplam fiyat = " +toplam + "$");// 91.04



    }
}
