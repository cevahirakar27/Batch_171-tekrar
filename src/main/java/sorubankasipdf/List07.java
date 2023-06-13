package sorubankasipdf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List07 {
    public static void main(String[] args) {

        //Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
        //Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür


        List<Integer>list = new ArrayList<>();
        list.add(12);
        list.add(31);
        list.add(15);
        list.add(13);
        list.add(54);
        System.out.println(list);   // [12, 31, 15, 13, 54]

        Collections.sort(list);
        System.out.println(list);   // [12, 13, 15, 31, 54]


       int  min= list.get(1)-list.get(0);

        for (int i= 1; i<list.size(); i++){
          min =  Math.min(min,(list.get(i)-list.get(i-1)));

        }

        for (int i =1; i<list.size(); i++){
            if ((list.get(i)-list.get(i-1))== min){
                System.out.println(list.get(i) +" and  " + list.get(i-1));
            }
        }


    }
}
