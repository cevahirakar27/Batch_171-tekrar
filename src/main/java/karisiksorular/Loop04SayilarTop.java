package karisiksorular;

import java.util.Scanner;

public class Loop04SayilarTop {
    public static void main(String[] args) {

        // kullanicidan 2 sayi isteyin sinirlar dahil aralarindaki sayilari toplayip yazdrin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 2 sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int toplam = 0;




        for (int i = sayi1; i <= sayi2; i++) {
            toplam = toplam + i;
        }
        System.out.println(toplam);





    }
}






