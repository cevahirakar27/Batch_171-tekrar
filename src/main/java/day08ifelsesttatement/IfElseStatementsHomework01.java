package day08ifelsesttatement;

import java.util.Scanner;

public class IfElseStatementsHomework01 {
    public static void main(String[] args) {

        /*
    Homework
    1)Kullanicidan alinan password 'pwd123!' oldugunda, verilen password'un dogru olup olmadigini kontrol eden
    //ve kullaniciya uygun mesaj veren kodu yaziniz
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen passwordunuzu giriniz");
        String pwd = scan.nextLine();

        if (pwd.equals("pwd123!")){
            System.out.println("sifre dogru");
        }else {
            System.out.println("hatali sifre");
        }


    }
}
