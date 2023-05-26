package day08ifelsesttatement;

import java.util.Scanner;

public class IfElseStatements08 {
    public static void main(String[] args) {

        //- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        //olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf = scan.next().charAt(0);

        if (harf >= 'a' && harf >= 'z'){
            System.out.println((char)(harf-32));
        }else {
            System.out.println(harf);

        }
    }
}
