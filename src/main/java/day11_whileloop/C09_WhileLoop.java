package day11_whileloop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {

        // 2- Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
        //dahil) 7 ila bolunebilen sayilari yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen poz bir tam sayi giriniz");
        int sayi = scan.nextInt();

        int k = 1;
        while (k<=sayi){
            if (k%7==0){
                System.out.print( " " +k);
            }k++;
        }

        // do while cozumu
        System.out.println();

        int l = 1;
        do {
           if (l % 7 == 0){
               System.out.print(" " +l);
           }

            l++;
        }while (l<= sayi);

        //
    }
}
