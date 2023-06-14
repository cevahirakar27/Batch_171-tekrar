package sorubankasipdf;

import java.util.ArrayList;
import java.util.List;

public class List02 {
    public static void main(String[] args) {

        //  Bir tamsayı listesinde 13 öğesinden önceki tüm liste öğelerinin toplamını bulunuz.
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);
        System.out.println(myList);   // [12, 31, 7, 13, 10]

        int sum = 0;

        for (int w : myList) {
            if (w == 13) {

                break;
            }sum = sum+w;


        } System.out.println(sum);  // 50
    }
}