package day09forloops;

import java.util.Scanner;

public class WhileLoop04 {
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("3 sayi giriniz");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        
        if (a<0 || b<0 || c<0 ){
            System.out.println("hatali giris lutfen poz tam sayi giriniz");
        } else if (a*a == (b*b)+(c*c) || b*b == a*a + c*c || c*c == a*a +b*b) {
            System.out.println("dik ucgen");
        }else {
            System.out.println("dik ucgen degil");
        }
    }
}
