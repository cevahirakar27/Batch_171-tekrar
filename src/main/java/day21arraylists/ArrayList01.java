package day21arraylists;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {

        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages);  // []

        ages.add(8);
        ages.add(12);
        ages.add(23);
        ages.add(6);
        ages.add(15);
        System.out.println(ages); // [8, 12, 23, 6, 15]

        ages.add(2,16);
        System.out.println(ages);    //  [8, 12, 16, 23, 6, 15]
        ages.add(4,18); // [8,12,16,23,18,6,15]
        System.out.println(ages);

        //List'e coklu eleman nasil eklenir? veya Liste baska bir list nasil eklenir?
        //Bir list e coklu eleman eklemek icin o elemanlari oncelikle bir listin icine koymalisiniz

        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(1);
        newAges.add(3);
        newAges.add(10);
        ages.addAll(newAges);
        System.out.println(ages);  // [8, 12, 16, 23, 18, 6, 15, 1, 3, 10]

        ages.addAll(2,newAges);
        System.out.println(ages);      // [8, 12, 1, 3, 10, 16, 23, 18, 6, 15, 1, 3, 10]

        int elemanSyisi = ages.size();
        System.out.println(elemanSyisi);  // 13

        System.out.println(ages.get(2)); // 2.indexi verir.  // 1
        System.out.println(ages.get(5)); //  5.indexi verir. // 16

        ages.set(4,111);
        ages.set(6,666);
        System.out.println(ages);

        // ages.clear butun elemanlari siler.
// contains bir elemanin var olup olmadigini kontrol eder.

        System.out.println(ages.contains(666)); // true

        System.out.println(ages.isEmpty());  // false

        // Ornek1 : size verilen bir listin bos olup olmadigini kontrol eden kodu yaziniz.
        ArrayList<String> names = new ArrayList<>();
        names.add("Gulce");
        names.add("seda");
        names.add("benna");
        names.add("rıdvan");
        names.add("enes");

        int elSayisi = names.size();
        System.out.println(elSayisi);  // 5
        if (elSayisi==0) {
            System.out.println("list bos");
        }else {
            System.out.println("list bos");
        }





    }
}
