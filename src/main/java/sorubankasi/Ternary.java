package sorubankasi;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {


        //kullanicidan bir tamsayi alin
        //sayi poz cift sayi veya cift sayi degil yazdirin
        //sayi poz degilse  3 bas veya 3 bas degil seceneklerinden uygun olanı yazdirin



        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();


        String t = sayi>0 ? sayi%2 == 0 ? "poz cift sayi" : "cift sayi degil" : sayi<-99 && sayi>-1000 ? "uc bas" : "uc bas degil";
        System.out.println(t);
    }
}
