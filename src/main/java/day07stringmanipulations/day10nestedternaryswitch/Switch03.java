package day07stringmanipulations.day10nestedternaryswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

        //Example 1: Kulanicidan iki sayi ve yapilacak islemi alan ve +, -, *, /, % islemlerini yapan kodu yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 2 sayi giriniz");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("lutfen yapilacak ,islemi giriniz");
        char opr = scan.next().charAt(0);

        switch (opr){
            case '+':
            System.out.println("a+b = " +(a+b));
            break;
            case '-':
                System.out.println("a-b = " + (a-b));
                break;
            case '*':
                System.out.println("a*b = " +a*b);
                break;
            case '/':
                System.out.println("a/b = " +(a/b));
                break;
            case  '%':
                System.out.println("yuzde  =" + (a*b/100));
                break;
            default:
                System.out.println("hatali giris");

        }
    }
}
