package day18multidimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class Md03 {
    public static void main(String[] args) {

        int arr[][] = {{1, 2, 3}, {4, 5, 6}};  //  tum elemanlari carp

        int carpim = 1;
        for (int[] w : arr) {
            for (int k : w) {
                carpim = carpim * k;
            }

        }
        System.out.println(carpim);

        // kullanicidan cumle isteyip kelime sayisini bulunuz
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle = scan.nextLine();
        int a[] = new int[cumle.length()];

        // [java cok guzeldir cok]
        int b = cumle.split(" ").length;
        System.out.println("kelime sayisi =" + b);


        }
    }

