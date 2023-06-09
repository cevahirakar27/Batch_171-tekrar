package day21arraylists;

import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        //Kisa yoldan bir list nasil olusturulur?
        List<Character> initials = List.of('a','b','a','c');
        System.out.println(initials);//[a, c, d, k]
        // initials.add('b');
        // initials.set(0,'u');
        // initials.remove(initials.indexOf('a'));

        //List.of() methodu degistirilemez bir list olusturmak icin kullanilir,
        // bu nedenle list uzerinde degisiklik yapmaya yonelik methodlari desteklemez ama diger list methodlarani kullanabiliriz
        //indexOf(aranan karakter) methodu aranan karakterin ilk gorununumun indexini verir.

        int c1  = initials.indexOf('a');
        System.out.println(c1);  // 0

        int c2 = initials.lastIndexOf('a');
        System.out.println(c2);   // 2
    }
}
