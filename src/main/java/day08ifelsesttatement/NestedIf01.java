package day08ifelsesttatement;

import java.util.Scanner;

public class NestedIf01 {

    public static void main(String[] args) {

        /*
      Example 1: Kullanicidan 3 tane sayi aliniz.
                 Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
                 Eger ucgen ise “eskenar” Ucgen olma durumunu kontrol ediniz.
                 INFO :
                 Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                                   herhangi iki kenar farki ucuncu kenardan kucuk olmali
                 a+b>c>|a-b|
                 a+c>b>|a-c|
                 b+c>a>|b-c|
                 a=b=c ise eskenar ucgen     */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 3 kenar uzunlugu giriniz");
        double a = Math.abs(scan.nextDouble());
        double b = Math.abs(scan.nextDouble());
        double c = Math.abs(scan.nextDouble());

        boolean ucgenMi = a+b >c && c> Math.abs(a-b) &&
                          a+c>b && a> Math.abs(a-c)&&
                          b+c>a && a> Math.abs(b-c);

        if (ucgenMi){
            if (a==b && b==c){
                System.out.println("ucgen hem de eskenar");
            }else {
                System.out.println("ucgen ama eskenar degil");
            }
        }else {
            System.out.println("ucgen degil");
        }

    }
}
