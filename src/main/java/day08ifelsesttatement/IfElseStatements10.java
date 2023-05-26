package day08ifelsesttatement;

import java.util.Scanner;

public class IfElseStatements10 {
    public static void main(String[] args) {

        //Example 1: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz
        //  1==> Pazar, 2 ==> Pazartesi .....
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");
        byte num = input.nextByte();
        if (num == 1) {
            System.out.println("pazar");
        }
         else if (num == 2) {
            System.out.println("pazartesi");

        } else if (num == 3){
            System.out.println("sali");
         } else if (num == 4){
            System.out.println("carsamba");
        }else if (num == 5){
            System.out.println("persembe");
        }
         else if (num== 6) {

        System.out.println("cuma");
        } else if (num== 7){
            System.out.println("cumartesi");
        }else {
            System.out.println("yanlis giris");
        }

}}