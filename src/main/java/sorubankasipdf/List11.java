package sorubankasipdf;

import java.util.ArrayList;
import java.util.List;

public class List11 {
    public static void main(String[] args) {

        //) Döngüleri kullanarak tamsayılardan oluşan bir listenin tüm öğelerinin benzersiz (tekrarsız)
        //olup olmadığını kontrol ediniz.
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(23);


        System.out.println(myList);  // [10, 31, 15, 7, 15, 23]

        for (int w : myList){
            if (myList.indexOf(w)== myList.lastIndexOf(w)){
                System.out.println(w+ " sayisi tekrarsiz");
            }else {
                System.out.println(w+ " sayisi tekrarli");
            }

            /*
            10 tekrarsiz
      31 tekrarsiz
      15 tekrarli
      7 tekrarsiz
      15 tekrarli
      23 tekrarsiz

             */

        }

    }
}
