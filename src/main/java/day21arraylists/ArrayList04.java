package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList04 {
    public static void main(String[] args) {

        //1) elemanlari A,C,E,F olan bir String array list olusturup yazdirin

        ArrayList<String> karakter = new ArrayList<>();
        karakter.add("A");
        karakter.add("C");
        karakter.add("E");
        karakter.add("F");

        System.out.println(karakter);// [A, C, E, F]

        // 2 ) indexiz add () methodunu kullanarak 'B' yi ekleyin
        karakter.add("B");
        System.out.println(karakter);  // [A, C, E, F, B]


        // L yi 1 numarali indexe ekleyin
        karakter.add(1,"L");
        System.out.println(karakter);   //  [A, L, C, E, F, B]

        // 3) set() methodu kullanarak E yi D yapiniz.

        karakter.set(3,"D");
        System.out.println(karakter);   // [A, L, C, D, F, B]

        // 4) remove() kullanarak F yi siliniz
          karakter.remove("F");
        System.out.println(karakter);     //  [A, L, C, D, B]

        // 5) sort() methodu kullanarak elemanlari alfabetik siraya diziniz.
        Collections.sort(karakter);
        System.out.println(karakter);  // [A, B, C, D, L]

        //6) contains kullanarak L nin Listte oldugunu M nin olmadigini dogrulayin.

        if (karakter.contains("L")){

            System.out.println("L iceriyor");  // iceriiyor

        }else {
            System.out.println("L icermiyor");
        }
        if (karakter.contains("M")){
            System.out.println("M iceriyor");
        }else {

            System.out.println("m icermiyor");
        }

        // 7) size() methodu kullanarak listin eleman sayisini bulunuz.

       int elSayisi = karakter.size();
        System.out.println(elSayisi);  //  5

        // 8) clear methodu kullanarak tum elemanlari silin.
        karakter.clear();
        System.out.println(karakter);  // []

        // 9) is Empty kullanark listin bos oldugunu dogrulayin
        boolean bosMu = karakter.isEmpty();
        System.out.println(bosMu);  // true











    }
}
