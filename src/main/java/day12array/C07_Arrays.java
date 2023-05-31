package day12array;

import java.util.Arrays;

public class C07_Arrays {
    public static void main(String[] args) {

        //Specific bir elemanin array de olup olmadigini anlamak icin gereken kodu yaziniz.
        String names[] = {"K", "C", "R", "A", "S"};
        String s  ="R";

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));  //[A, C, K, R, S]

       int k = Arrays.binarySearch(names,"R");   // 3
        System.out.println(k);

        if (k>0){
            System.out.println("R karakterini iceriyor");
        }else {
            System.out.println("icermiyor");
        }

        int a = Arrays.binarySearch(names,"S");
        if (a>0){
            System.out.println("S yi iceiryor");
        }else {
            System.out.println("icermiyor");
        }


    }
}
