package day06swapvaluesstringmanipulations.day10forloops;

import java.util.Scanner;

public class Loops16 {
    public static void main(String[] args) {

        ///*
        //         * Kullanicidan bir cumle ve bir harf alin,
        //         * Cumlede harfin kac kere
        //         * kullanildigini bulup, yazdirin
        //         *
        //         * ORNEK:
        //         *
        //         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
        //         *
        //         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
        //         */
        //
               Scanner scan = new Scanner(System.in);
               System.out.println("Lutfen bir cumle giriniz");
               String cumle = scan.nextLine().toLowerCase();
               System.out.println("Lutfen bir harf giriniz");
               char harf=scan.next().toLowerCase(). charAt(0);

                String s1 = cumle.replaceAll("e","");
        int eSayisi = cumle.length()-s1.length();
        System.out.println("e harfi : " +eSayisi + " defa kullanilmis");

            }

        }




