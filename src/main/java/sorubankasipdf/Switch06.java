package sorubankasipdf;

import java.util.Scanner;

public class Switch06 {
    public static void main(String[] args) {

        /*

        6) Switch ifadesini kullanarak, herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme
yapan basit bir hesap makinesi oluşturmak için kod yazınız.
a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.
e) Kullanıcı 10 ve -5 girdiğinde +, -, *, / 'den farklı bir işlem yaptığında kodunuz "Geçersiz İşlem" yazmalıdır.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 2 sayi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        System.out.println("lutfen yapmak istediginiz islemi giriniz / +,-,*,/ ");
        char isaret = scan.next().charAt(0);
        switch (isaret){
            case '+':
                System.out.println("toplam= " +(sayi1+sayi2));
                break;
            case '-':
                System.out.println("cikarma = " +(sayi1-sayi2));
                break;
            case '*':
                System.out.println("carpma = " +(sayi1*sayi2));
                break;
            case '/':
                System.out.println("bolme = " +(sayi1/sayi2));
                break;
            default:
                System.out.println("yanlis giris yaptiniz");


        }

    }
}
