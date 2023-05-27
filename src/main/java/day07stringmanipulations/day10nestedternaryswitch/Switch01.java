package day07stringmanipulations.day10nestedternaryswitch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        //Example 1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz
        //           Sunday==>1  . . .  Saturday==>7

        Scanner scan =  new Scanner(System.in);
        System.out.println("lutfen gun ismini giriniz");

        String gunIsmi = scan.next();
        switch (gunIsmi.toLowerCase()){
            case "pazartesi":
                System.out.println("1.gun");
                break;
            case "sali":
                System.out.println("2.gun");
                break;
            case "carsamba":
                System.out.println("3.gun");
                break;
            case "persembe":
                System.out.println("4.gun");
                break;
            case "cuma":
                System.out.println("5.gun");
                break;
            case "cumartesi":
                System.out.println("6.gun");
                break;
            case "pazar":
                System.out.println("7.gun");
                break;
            default:
                System.out.println("hatali giris");
        }


    }
}
