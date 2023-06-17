package sorubankasipdf;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListForEach01 {
    public static void main(String[] args) {


        //) İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.


        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        for (int i = 0; i <arr.length ; i++) {
            String first = arr[i].substring(0,1);
            String last = arr[i].substring(arr[i].length()-1);

            if (first.equalsIgnoreCase(last)){
                System.out.println(arr[i]);
            }
        }


    }
}
