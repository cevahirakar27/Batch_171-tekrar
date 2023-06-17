package sorubankasipdf;

import java.util.Arrays;

public class ArrayListForEach04 {
    public static void main(String[] args) {

        // Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
       // toplaminini yazdirin  //  16

        int arr[][] = {{1,2,3},{4,5},{6,7,8}};  // 16
        int sum = 0;
        for (int w[] : arr){

          sum = sum + w[ w.length-1];
        }

        System.out.println(sum);

    }
}
