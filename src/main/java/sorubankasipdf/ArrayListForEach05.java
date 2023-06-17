package sorubankasipdf;

import java.util.Arrays;

public class ArrayListForEach05 {
    public static void main(String[] args) {

/*
        Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip, yeni
        olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        output: [10, 3, 12, 10, 9]
*/

        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};  // 10,3,12,10,9

        int yeni[] = new int[arr.length];


        for (int i = 0; i <arr.length ; i++) {
           int top = 0;

            for (int k = 0; k <arr[i].length ; k++) {
               top = top+arr[i][k];
               yeni[i]= top;

            }
        }
        System.out.println(Arrays.toString(yeni));



    }
}
