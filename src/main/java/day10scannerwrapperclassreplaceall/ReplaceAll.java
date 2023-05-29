package day10scannerwrapperclassreplaceall;

import java.util.Scanner;

public class ReplaceAll {
    public static void main(String[] args) {

        String s1 = "Java 5ile8 &&?hersey guzel";
        String s2 =s1.replace('5','e');
        System.out.println(s2);

        String s3 = s1.replace("sey","ol");
        System.out.println(s3);

            String s4 = s1.replaceAll("sey","al");
        System.out.println(s4);

        String s5 = s1.replaceAll("5","o");
        System.out.println(s5);
    }

    public static class HomeworkRakamlarToplami {
        public static void main(String[] args) {


            //2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
            // ornegin => 312 icin 3+1+2=6

            Scanner input = new Scanner(System.in);
            System.out.println("lutfen 3 basmakli bir sayi giriniz");
            int sayi = input.nextInt();
            int birlerBas ;
            birlerBas=sayi%10;
            sayi = sayi / 10;

            int sondanIkinciSayi = sayi%10;
            sayi = sayi/10;

            int sondanUcuncuSyi = sayi%10;

            System.out.println("rakamlar toplami = " +(birlerBas+sondanIkinciSayi+sondanUcuncuSyi));



        }
    }
}
