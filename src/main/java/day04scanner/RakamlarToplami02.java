package day04scanner;

import java.util.Scanner;

public class RakamlarToplami02 {

    public static void main(String[] args) {
        //kullanicidan 4 bas bir sayi alip rakamlar toplamini bulun

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 4 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();

        int birlerBas;
        int rakamlarToplami;
        birlerBas = sayi%10;
        sayi = sayi/10;

        int onlarBas = sayi%10;
        sayi=sayi/10;

        int yuzlerBas = sayi%10;
        sayi= sayi/10;

        int binlerBas = sayi%10;
        sayi=sayi/10;
        System.out.println(binlerBas+yuzlerBas+onlarBas+birlerBas);
    }
}
