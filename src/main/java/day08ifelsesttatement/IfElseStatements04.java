package day08ifelsesttatement;

import java.util.Scanner;

public class IfElseStatements04 {
    public static void main(String[] args) {
/*
2- Kullanicidan M harfi ile baslayan bir ay varsa yazdirin.
NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
baska bir harf girdiginde "gecersic giris" yazdirin
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen m veya M harfi giriniz");
        char ilkHarf = scan.next().charAt(0);

        if (ilkHarf == 'm' || ilkHarf == 'M'){
            System.out.println("mart,mayis");
        }else {
            System.out.println("gecersiz giris");
        }
    }
}
