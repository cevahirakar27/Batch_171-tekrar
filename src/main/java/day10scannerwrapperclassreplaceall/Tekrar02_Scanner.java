package day10scannerwrapperclassreplaceall;

import java.util.Scanner;

public class Tekrar02_Scanner {

    public static void main(String[] args) {

        //Ornek kullanicidan adresini aliniz ve ekrana yazdiriniz
        
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen adresinizi giriniz");
        
        String adres = input.nextLine();

        System.out.println("adres = " + adres);
    }
}
