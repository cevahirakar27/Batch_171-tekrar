package day09forloops;

import java.util.Scanner;

public class FoorLoop03 {
    public static void main(String[] args) {

        // 1den 20 ye kadar sayilari yazdirin
        int i = 1;
        while (i<21){

            System.out.print(i+ " ");
            i++;
        }

        // 2den 10 a kadar cift sayilari yazdirin.
        System.out.println();

        int k = 2;
        while (k<11){

            if (k%2==0) {

                System.out.print(k + " ");
            }
            k++;
        }
         // 3 den 21 e kadar tek sayilari yazdirin
        System.out.println();

        int j = 3;
        while (j<22){

            if (j % 2 != 0) {
                System.out.print(j+ " ");
            }
            j++;
        }
            // 3 den 5 e kadar sayilarin toplamini yazdirin
        System.out.println();
           int toplam = 0;
        for (int a = 3; a <6 ; a++) {

            toplam= toplam+a;

        }  System.out.println(toplam);

         // while loop
        int l = 3;
        int top = 0;
        while (l<6){
            top= top+l;

            l++;
        }  System.out.print(top);
    }

    }
