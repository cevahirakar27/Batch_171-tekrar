package day05concatinationoperatortypecasting;

import java.util.Scanner;

public class KarisikTekrar2 {

    public static void main(String[] args) {

        //Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //girilen bilgiler : J Doe, 44


        Scanner input = new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim = input.nextLine();
           char ch = isim.toUpperCase().charAt(0);

        System.out.println("lutfen soyisminizi giriniz");
        String soyIsim = input.nextLine();


        System.out.println("lutfen yasinizi giriniz");
        byte yas = input.nextByte();


        System.out.println(ch + " " + " " +soyIsim+ " " + yas);  // J doe 44

    }
}
