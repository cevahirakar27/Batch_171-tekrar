package day11_whileloop;

import java.util.Scanner;

public class C15_WhileBasTop {
    public static void main(String[] args) {

        //Girilen tamsayının basamaklarının toplamını yazan program.

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi = scan.nextInt();

        int toplam =0;
        while (sayi!=0){
            sayi=Math.abs(sayi);
            toplam=toplam+sayi%10;
            sayi=sayi/10;

        }
        System.out.println("basamaklar toplami :" +toplam);


        do {
            sayi=Math.abs(sayi);
            toplam=toplam+sayi%10;
            sayi=sayi/10;


        }while (sayi>0);
        System.out.println(toplam);

        //  //Bir tamsayının tam bölenlerini ve tam bölenlerinin toplamını bulun.
        int sayi2 = 20;
        int toplam2 = 0;
        int bolen = 1;

        do {
            if (sayi2%bolen==0){
                System.out.println("bolen sayisi :" +bolen);
                toplam2=toplam2+bolen;
            }

           bolen++;
        }while (bolen<=sayi2);
        System.out.println("tam bolenleri toplamai:"+toplam2);
    }
}
