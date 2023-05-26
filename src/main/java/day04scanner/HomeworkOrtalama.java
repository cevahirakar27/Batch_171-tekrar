package day04scanner;

import java.util.Scanner;

public class HomeworkOrtalama {
    public static void main(String[] args) {
        //homework
        //1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz
        //ornegin => 3,5,7 icin ortalama

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen 3 tane sayi giriniz");
        double sayi1 = input.nextDouble();
        double sayi2 = input.nextDouble();
        double sayi3 = input.nextDouble();
        double ortalama = (sayi1+sayi2+sayi3)/3;
        System.out.println("ortalama = " + ortalama);

    }


}
