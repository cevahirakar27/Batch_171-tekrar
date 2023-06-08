package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {

        // verilen 2 integer arrayi ayni olup olmadigini kontrol eden kodu yaziniz

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(8);
        num1.add(10);
        num1.add(9);

        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(8);
        num2.add(9);
        num2.add(10);

        boolean c1 = num1.equals(num2);
        System.out.println(c1);    // normalde false verir.
        // ama kucukten buyuge siralarsak true dondurur

        Collections.sort(num1);
        Collections.sort(num2);
        boolean c2 = num1.equals(num2);
        System.out.println(c2);      // true dondurur.

        // Arraylistte bir elemanin ilk gorunumu nasil silinir?

        ArrayList<String>sehirler = new ArrayList<>();
        sehirler.add("miami");
        sehirler.add("istanbul");
        sehirler.add("yozgat");
        sehirler.add("barcelona");
        sehirler.add("miami");
        sehirler.add("istanbul");
        sehirler.add("istanbul");
        sehirler.add("yozgat");
        // remove bir elemanin ilk gorunumunu siler.

        System.out.println(sehirler.remove("miami"));  // true yazdirir.
        System.out.println(sehirler);  // [istanbul, yozgat, barcelona, miami, istanbul, istanbul, yozgat]

        System.out.println(sehirler.remove(2));  // 2.indexi sildi
        System.out.println(sehirler);     // [istanbul, yozgat, miami, istanbul, istanbul, yozgat]


        // Ornek: bir tane integer list olusturun ve 12 elemanini siliniz

        ArrayList<Integer>ages = new ArrayList<>();  // sol tarftaki arraay list terine list de yazilabilir.

        ages.add(1);
        ages.add(8);
        ages.add(12);
        ages.add(5);
        ages.add(15);
        System.out.println(ages);  // [1, 8, 12, 5, 15]

        ages.remove(2);
        System.out.println(ages);  // daaha dinamik yapmak icin asgidaki yollar izlenir

        ages.remove((Integer) 12);
        System.out.println(ages);            // [1, 8, 5, 15]


        // yukaridaki arrayde ilk gorunumlerinin hepsini slin.
        // ORNEK İSTANBUL VE YOZGATLARİ SİLELİM.

        List<String> silineceklerListesi = new ArrayList<>();
        silineceklerListesi.add("istanbul");
        silineceklerListesi.add("yozgat");

        sehirler.removeAll(silineceklerListesi);
        System.out.println(sehirler);




    }
}
