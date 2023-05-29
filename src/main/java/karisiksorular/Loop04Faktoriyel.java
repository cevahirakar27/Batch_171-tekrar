package karisiksorular;

import java.util.Scanner;

public class Loop04Faktoriyel {
    public static void main(String[] args) {

        // kullanicidan 10 dan kucuk bir tamsayi girip faktoriyelini bulunuz
        // 5! = 5*4*3*2*1

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 10 dan kucuk bir tamsayi giriniz");
        int sayi = scan.nextInt();
        int faktoriyel = 1;

        System.out.print( sayi + "! = ");
        for (int i = sayi; i >=1 ; i--) {
            faktoriyel = faktoriyel*i;
            if (i>1){
                System.out.print(i+ "*");
            } else {
                System.out.print(i);
            }
        }
        System.out.print(" = " +faktoriyel);
    }
}




