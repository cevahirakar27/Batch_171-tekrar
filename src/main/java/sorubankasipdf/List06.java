package sorubankasipdf;

import java.util.ArrayList;
import java.util.List;

public class List06 {
    public static void main(String[] args) {

        // Listede 15 veya 13 varsa, bu elemanları kaldırınız.
         //Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(31);
        list.add(15);
        list.add(13);
        list.add(54);
        List<Integer> silinmis = new ArrayList<>();
        silinmis.add(13);
        silinmis.add(15);

        list.removeAll(silinmis);
        System.out.println(list);     // [10,31,54]
    }

    public static class List01 {
        public static void main(String[] args) {



    //Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz.
    List<Integer> myList = new ArrayList<>();
    myList.add(12);
    myList.add(31);
    myList.add(7);
    myList.add(13);
    myList.add(10);

    int sum =0;

    for (int w : myList){
        sum = sum+w;

    }
            System.out.println(sum);


        }
    }
}
