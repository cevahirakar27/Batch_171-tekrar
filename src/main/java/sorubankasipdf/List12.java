package sorubankasipdf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List12 {
    public static void main(String[] args) {



        Integer arr [] = {1,2,3,4,5,6};

        List<Integer>list = Arrays.asList(arr);  //  array i liste cevirdik
        System.out.println(list);
        System.out.println(list.get(2));   // 3

        List<Integer>list2 = List.of(1,2,3,4,5);

        Object[] arr2 =list2.toArray();  // listi arraye cevirdik.
        System.out.println(Arrays.toString(arr2));
/*
        Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip, yeni
        olusturacagimiz tek katli bir array’e bu toplamlari atayin.
         int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        output: [10, 3, 12, 10, 9]
*/

        int[][] arr3 = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        int yeniArr[] = new int[arr3.length];

        for (int i = 0 ; i<arr3.length; i++){
            int top = 0;
            for (int k = 0; k<arr3[i].length; k++){
                top = top+arr3[i][k];
            }yeniArr[i]= top;
        }
        System.out.println(Arrays.toString(yeniArr));


    }
}
