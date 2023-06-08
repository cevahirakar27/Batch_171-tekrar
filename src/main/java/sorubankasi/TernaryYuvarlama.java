package sorubankasi;

import java.util.Arrays;
import java.util.Scanner;

public class TernaryYuvarlama {
    public static void main(String[] args) {

           /*  Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
                a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa yuvarla”
        b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt kendi onluguna yuvarla”
        Örneğin; 127 yukarı yuvarlanacak ve değer 130 olacaktır.
        125 yukarı yuvarlanacak ve değer 130 olacaktır.
        123 aşağı yuvarlanacak ve değer 120 olacaktır.
*/
       Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        int sonBasamak = sayi%10;
        int kucultulmusSayi = sayi/10;


       String snuc =  sonBasamak>=5 ? "sayiyi bir ust ondaliga yıuvarla = " +(kucultulmusSayi+1)*10 :
                "kendi onluguna yuvarla = " +kucultulmusSayi*10;

        System.out.println(snuc);


        }
    }
