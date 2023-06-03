package sorubankasi;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        // Kullanicidan aldigimiz 8 elemanli arrayin icinde
        //3 e bölünebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 8 tane eleman giriniz");
        int arr [] = new int[8];

        for (int i = 0; i <8 ; i++) {
            arr[i]= scan.nextInt();

        }System.out.println(Arrays.toString(arr));


        int sayac = 0;
        for (int i =0; i<8; i++){
        if (arr[i]%3 ==0){
            sayac++;
        }
        }
        System.out.println("3 ile bolunenlerin sayisi :" +sayac);

    }
}
