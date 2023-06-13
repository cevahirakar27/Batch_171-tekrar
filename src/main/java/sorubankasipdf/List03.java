package sorubankasipdf;

import java.util.ArrayList;
import java.util.List;

public class List03 {
    public static void main(String[] args) {

       // Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);

        System.out.println(myList); // [12, 31, 7, 13, 10]

        int carpim = 1;
        for (int w : myList){
            if (w%2==0){
                carpim= carpim*w;
            }
        }
        System.out.println(carpim);  // 120
    }
}
