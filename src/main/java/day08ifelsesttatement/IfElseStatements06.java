package day08ifelsesttatement;

import java.util.Scanner;

public class IfElseStatements06 {
    public static void main(String[] args) {

        //Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        int not = scan.nextInt();

        if (not>=50){
            System.out.println("sinifi gectin");
        }else {
            System.out.println("malesef kaldin");
        }
    }
}
