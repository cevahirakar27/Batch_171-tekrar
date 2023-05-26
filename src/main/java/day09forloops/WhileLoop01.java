package day09forloops;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {


        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
        /*            3 ==> 3x1=3
                            3x2=6
                            3x3=9
                            3x4=12 ...
                            3x10=30
                            */

        Scanner scan = new Scanner(System.in);
        System.out.println("carpi tablosonu gormek icin lutfen bir poz tam sayi giriniz");
        int num = scan.nextInt();

        int i =1;
        while (i<11){

            System.out.println(i+ "x" + num + "  =  " + i*num);
           i++;

        }

        ////Example 2: Verilen bir string de her harfin sonrasina "*" sembolu ekleyiniz
        //        //      Java  ==> J*a*v*a*

                System.out.println("Bir kelime giriniz");
                String kelime = scan.next();
                String yeni ="";

                int a =0;
                while (a<kelime.length()){

                    yeni = yeni + kelime.charAt(a)+ "*";

                    a++;
                }
                System.out.println(yeni);

        System.out.println();

        // Example 3: Bir string deki tekrarsiz karakterleri console a yazdiriniz
        //        // kertenkelle  ==> rtn

        String s = "kertenkelle";
        String tekrarsiz = "";

       int k =0;
       while (k<s.length()){
           char ch = s.charAt(k);
           if (s.indexOf(ch)==s.lastIndexOf(ch)){
               tekrarsiz= tekrarsiz+ch;
           }


           k++;
       } System.out.println(tekrarsiz);
    }
}
