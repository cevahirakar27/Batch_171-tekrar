package day18multidimensionalarray;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {

        // bir array in elemanlari array ise bu arraylar muitidimensional array dir
        // multidimensional array nasil olusturulur.

        int a [][] = new int[3][2];
         // bu arraylere eleman nasil eklenir.
        // [[ 5,12  ] ,[ 81,45  ], [ 123,0  ]]
        a[0][0] = 5;
        a[1][1]=45;
        a [2][0]=123;
        a[0][1] = 12;
        a[1][0]= 81;
        a[2][1] = 0;

        // nasil yazdirilir
        System.out.println(Arrays.deepToString(a));  //  [[5, 12], [81, 45], [123, 0]]
        // deepToString methodu kullanilir

        // multidimensional array icinden spesific bir eleman nasil yazdirilir.
        System.out.println(a[0][0]);   // 5
        System.out.println(a[1][1]);   //45
        System.out.println(a[2][0]);   //123
        System.out.println(a[1][0]);  //81


        // multidimentional array icindeki bir array nasil yazdirilir
        System.out.println(Arrays.toString(a[0]));  //  [5,12]
        System.out.println(Arrays.toString(a[1]));  // [81,45]
        System.out.println(Arrays.toString(a[2]));  // [123,0]


        // kisa yoldan multidimensional array nasil olusturulur
        String student[][] = {{"ali","kemal"},{"cemal"},{"ayhan","beyhan","seyhan"},{"ceyhan","kayahan"}};
        System.out.println(Arrays.deepToString(student));  //[[ali, kemal], [cemal], [ayhan, beyhan, seyhan], [ceyhan, kayahan]]

        System.out.println(student[0][1]);   // kemal

         // ornek1 : yukaridaki student arrayinde toplam kac ism oldugunu bulunuz.

        int toplam = 0;
        for (String []  w : student){
            toplam = toplam + w.length;
        }
        System.out.println(toplam);   // 8

        // Ornek 2: Bir integer multidimensional array olusturunuz, tum elemanlarin carpimini hesaplayiniz.
        int nums[][] = {{5, 4}, {2, 3, 2}, {7}};

        int sonuc = 1;
        for (int w [] : nums){
            for (int k : w){
                sonuc = sonuc * k;

            }
        }
        System.out.println(sonuc);        // 1680



    }
}
