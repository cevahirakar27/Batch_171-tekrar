package karisiksorular;

import java.util.Scanner;

public class NestedLoop02 {
    public static void main(String[] args) {

        /*

        1 2 3
        2 4 6
        3 6 9
         */

        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=3 ; j++) {

                System.out.print(" " +i * j);
            }
            System.out.println();
        }

        // 3 ten 13 e kadar tum tek sayilari yazdirin

        int i = 3;
        while (i<=13){
            if (!( i %2 == 0)){

                System.out.print(" " +i);

            }i++;
        }

        System.out.println();

        // kullanicidan bas ve bitis degerlerini alin.sinirlar dahil aradaki harfleri buyuk harf olarak yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bas ve bitis harflerini giriniz");
        char harf1 = scan.next().toUpperCase().charAt(0);
        char harf2 = scan.next().toUpperCase().charAt(0);

        for (int j = harf1; j <=harf2 ; j++) {
            if (j>='a' && j<='z'){

            }
            System.out.print(" " +(char)(j));

        }



            }

        }

















