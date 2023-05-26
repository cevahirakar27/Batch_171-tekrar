package day08ifelsesttatement;

import java.util.Scanner;

public class IfElseStatementsHomework02 {
    public static void main(String[] args) {


        // 2)Haftanin gün ismini verdiginizde kacinci gün oldugunu yazan kodu yaziniz
        //  Pazar ==> 1.gün , Pazartesi  ==> 2.gün  .....

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String gunIsmi = scan.next();

        if (gunIsmi.equalsIgnoreCase("pazar")) {
                System.out.println("1.gun");

        } else if (gunIsmi.equalsIgnoreCase("pazartesi")) {
            System.out.println("2.gun");
        } else if (gunIsmi.equalsIgnoreCase("sali")) {


        System.out.println("3.gun");
        } else if (gunIsmi.equalsIgnoreCase("carsamba")) {

            System.out.println("4.gun");
        } else if (gunIsmi.equalsIgnoreCase("persembe")) {
            System.out.println("5.gun");
        } else if (gunIsmi.equalsIgnoreCase("cuma")) {
            System.out.println("6.gun");
        } else if (gunIsmi.equalsIgnoreCase("cumartesi")) {
            System.out.println("7.gun");
        }else {
            System.out.println("hatali giris");
        }
    }}