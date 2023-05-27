package day11_whileloop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {

        /*
            Kullanıcıdan bir kelime sisteme girmesini isteyiniz.
            kelimede ilk c harfi rastlanılana kadar a harflerinin sayısını yazdırınız.
           */  //arabacami

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime = scan.next();
        int sayac = 0;

        for (int i = 0; i <kelime.length() ; i++) {
            if (kelime.charAt(i)=='a'){
                sayac++;
            } else if (kelime.charAt(i)=='c') {
                break;

            }


        }
        System.out.println("girdiginiz kelimede ilk c ye kadar a harflerinin sayisi : " + sayac);
    }
}
