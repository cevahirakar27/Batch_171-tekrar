package day10scannerwrapperclassreplaceall;

import java.util.Scanner;

public class Tekrar01_Scanner {
    public static void main(String[] args) {

        //Ornek: Kullanicidan ilk ismini ve soyismini alip ikisini ayni satirda ekrana yazdiriniz.

        Scanner input= new Scanner(System.in);
        System.out.println("lutfen isminizi");
        String firstName = input.next();

        System.out.println("lutfen soyisminizi giriniz");
        String lastName = input.next();

        System.out.println(firstName + " " + lastName);
    }
}
