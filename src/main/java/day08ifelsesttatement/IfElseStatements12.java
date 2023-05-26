package day08ifelsesttatement;

import java.util.Scanner;

public class IfElseStatements12 {
    public static void main(String[] args) {

                  /*
             Example 1:Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                       asagidaki tabloya gore yazdiran kodu olusturunuz
                       0-4 ==> bebek
                       5-12 ==> cocuk
                       13-20 ==> genc
                       21-30 ==> yetiskin
                       30 ustu ==> Tanimlanmamis
                       Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas<0){
            System.out.println("gecrli bir yas giriniz");
        }
          else if (yas<5){
            System.out.println("bebek");
        } else if (yas<13) {
            System.out.println("cocuk");
        } else if (yas< 21) {
            System.out.println("genc");
        } else if (yas< 31) {
            System.out.println("yetiskin");
        } else  {
            System.out.println("tanimlanmamis");

        }
    }
}
