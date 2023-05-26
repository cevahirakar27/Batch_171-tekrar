package day08ifelsesttatement;

import java.util.Scanner;

public class IfElseStatements05 {
    public static void main(String[] args) {

        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin.negatif sayi girerse "gecersiz giris" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 3 poz. tamsayi uzunlugunu giriniz");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();

        if (kenar1==kenar2 && kenar1 == kenar3){
            System.out.println("eskenar ucgen");

        }else {
            System.out.println("eskenar degil");
        }
    }
}
