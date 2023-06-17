package sorubankasipdf;

import java.util.Arrays;
import java.util.List;

public class ArrayListKonu {
    public static void main(String[] args) {


        Integer arr [] = {1,2,3,4,5};
        List<Integer>liste = Arrays.asList(arr);
        System.out.println(liste);   //   [1, 2, 3, 4, 5]

        Object arr1[]= liste.toArray();


    }
}
