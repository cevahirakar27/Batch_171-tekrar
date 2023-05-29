package day06stringmanipulation;

import java.util.Scanner;

public class S05_StringManipulation {
    /*
     Kullanıcının girdiği bir String ifadenin son üç karakterini alarak bu üç karakteri String ifadenin başına ve sonuna ekleyen
     bir Java programı yazınız.
             */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("En az üç karakterli bir kelime giriniz: ");
        String kelime = input.next();
        if (kelime.length()>2) {


            String sonUc = kelime.substring(kelime.length() - 3);

            System.out.println(sonUc + kelime + sonUc);
        }else {
            System.out.println("lutfen 3 karakterki bir kelime giriniz");
        }
    }
}