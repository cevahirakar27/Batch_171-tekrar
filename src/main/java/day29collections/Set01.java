package day29collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set01 {
    public static void main(String[] args) {

        // 3tane set vardir
        // 1) HashSet :  cok hizlidrlar.rastgele siralar
        //2)LinkHasSet : Ekleme sirasina gore koyar
        //3) TreeSet : Tek tek kontrol eder.kucukten buyuge siralar.sonra dizer.bu yuzden cok yavastir.cok tercih edilmez

        HashSet<String>list = new HashSet<>();
        list.add("ali");
        list.add("Gulce");
        list.add("Seda");
        list.add("Omer");
        list.add("Hasan");
        list.add("Benna");
        System.out.println(list);   // [Hasan, Seda, Omer, ali, Gulce, Benna]
        list.add("Seda");
        System.out.println(list);   // sedayi eklemez. tekrarli elemanlari kabul etmez.
        System.out.println(list.add(null));// true. null i kabul eder

        //19,13,313,45
        LinkedHashSet<Integer>sayilar = new LinkedHashSet<>();
        sayilar.add(19);
        sayilar.add(13);
        sayilar.add(-33);
        sayilar.add(312);

        System.out.println(sayilar);   //  [19, 13, -33, 312]

        LinkedHashSet<Integer>sayi1 = new LinkedHashSet<>();
        sayi1.add(19);
        sayi1.add(13);
        sayi1.add(313);
        sayi1.add(45);
        sayilar.retainAll(sayi1);
        System.out.println(sayilar);    // [19, 13]
        System.out.println(sayi1);      //[19, 13, 313, 45]

        TreeSet<Character> ts = new TreeSet<>();
        ts.add('E');
        ts.add('G');
        ts.add('B');
        ts.add('A');
        ts.add('L');
        ts.add('Y');
        ts.add('E');
// ts.add(null); // tree setlerde null eklenemz.
        System.out.println(ts);  // [A, B, E, G, L, Y]

        System.out.println(ts.lower('B')); // A
        System.out.println(ts.lower('F')); // E         // F olsaydi bir onceki

        System.out.println(ts.subSet('B', 'L'));  // [B,E,G]

        System.out.println(ts.floor('A')); // A
        System.out.println(ts.floor('F')); // E

        System.out.println(ts.ceiling('G')); // G
        System.out.println(ts.ceiling('H'));  // L

        System.out.println(ts.tailSet('A'));  // [A, B, E, G, L, Y]  // A dahil sonrakiler

        System.out.println(ts.headSet('E')); // [A,B] // E den onceki kisim
        System.out.println(ts.higher('B'));  //  E


    }
}
