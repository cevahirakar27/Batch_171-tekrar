package day18multidimensionalarray;

import java.util.Arrays;

public class Md04 {
    public static void main(String[] args) {

        int arr[][] = {{1, 2, 3}, {4, 5}, {6}};
        //ic arraydeki son elemanlarin carpimi


        int carpi = 1;
        for (int w[] : arr) {

    carpi = carpi* w[w.length-1] ;


        }
        System.out.println("son elemanlarin carpimi = " +carpi);

    }
}