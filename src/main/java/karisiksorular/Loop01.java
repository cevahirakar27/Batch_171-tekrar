package karisiksorular;

import java.util.Scanner;

public class Loop01 {
    public static void main(String[] args) {

        // Ornek1 : ekrana 10 kez java guzeldir yazdirin

        for (int i = 0; i <10 ; i++) {
            System.out.print(" java guzeldir");
        }

        // Ornek2 : 10 ile 30 arasindaki sayilari aralarina virgul koyarak yazdirin
        System.out.println();

        for (int k = 10; k <31 ; k++) {
            System.out.print(k+ ",");
        }

        //Ornek 3 : 100 den baslayarak 50 ye kadar yazdirin virgul kullanarak
        System.out.println();

        for (int j = 100; j >=50 ; j--) {
            System.out.print(j+ ",");
        }

        // Ornek 4 :kullanicidan 100 den kucuk bir tam sayi isteyin.1 den baslayarak girilen sayiya kadar
        // 3 un veya 5 in kati olan sayilari yazdirin
        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 100 den kucuk bir tamsayi giriniz");
        int sayi = scan.nextInt();

        for (int l =1 ; l<=sayi ; l++){
            if (l%3 == 0){
                System.out.print(" "+l);
            } else if (l % 5 == 0) {
                System.out.print(" " +l);
            }
        }

        System.out.println();

        // Ornek 5 : kullanicidan 100 den kucuk bir tamsayi isteyin. 1 den baslayarak girilen sayiya kadar
        // butun sayilari yazdirin.Ancak sayi
        // 3 un kati ise "java"
        // 5 in kati ise "guzeldir"
        // hem 3 hem 5 in kati ise "java guzeldir" yazdirin

        for (int w = 1; w <=sayi ; w++) {
            if (w %15 == 0){
                System.out.println("java guzeldir");
            } else if (w%3 ==0) {
                System.out.print(" java ,");
            } else if (w % 5 == 0) {
                System.out.print(" guzeldir,");
            }else {
                System.out.print(" " +w +",");
            }
        }







    }
}
