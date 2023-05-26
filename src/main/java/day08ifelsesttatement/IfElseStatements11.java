package day08ifelsesttatement;

import java.util.Scanner;

public class IfElseStatements11 {
    public static void main(String[] args) {

        //Example 1: Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz.
        //January ==> 1...

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir ay ismi giriniz");
        String monthName = scan.next();

        if (monthName.equalsIgnoreCase("january")){
            System.out.println("1. ay");
        } else if (monthName.equalsIgnoreCase("February")) {
            System.out.println("2.ay");
        } else if (monthName.equalsIgnoreCase("march")) {
            System.out.println("3.ay");
        } else if (monthName.equalsIgnoreCase("april")) {
            System.out.println("4.ay");  
        } else if (monthName.equalsIgnoreCase("may")) {
            System.out.println("5.ay");   
        } else if (monthName.equalsIgnoreCase("june")) {
            System.out.println("6.ay"); 
        } else if (monthName.equalsIgnoreCase("july")) {
            System.out.println("7.ay");
        } else if (monthName.equalsIgnoreCase("august")) {
            System.out.println("8.ay");   
        } else if (monthName.equalsIgnoreCase("september")) {
            System.out.println("9.ay");
        } else if (monthName.equalsIgnoreCase("october")) {
            System.out.println("10.ay");
        } else if (monthName.equalsIgnoreCase("november")) {
            System.out.println("11.ay");
        } else if (monthName.equalsIgnoreCase("december")) {
            System.out.println("12.ay");
        }else {
            System.out.println("yanlis giris yaptınız");
        }
    }
}
