package day08ifelsesttatement;

import java.util.Scanner;

public class IfElseStatements07 {
    public static void main(String[] args) {

        //Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        //olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char krk = scan.next().charAt(0);
        if (krk >= 'A' && krk<= 'Z'){
            System.out.println("buyuk harf");
        }else {
            System.out.println("Buyuk harf degil");
        }
    }
}
