package day12array;

import java.util.Arrays;

public class C09_Arrays {
    public static void main(String[] args) {

        // //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]

        // baska bi array olustururuz. 2,3 12 en basa koyariz 0 lar sona kalir

        int a [] = {0,2,2,0,12,0};
        int b [] = new int [a.length];
        System.out.println(Arrays.toString(a));

        int idx = 0;

        for ( int w : a){
            if (w!=0){
                b[idx]=w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(b));






    }
}
