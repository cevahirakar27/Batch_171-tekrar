package sorubankasi;

import java.util.Scanner;

public class IfElseTernary01 {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin



      /*  Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
                a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa yuvarla”
        b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”
        Örneğin; 127 yukarı yuvarlanacak ve değer 130 olacaktır.
        125 yukarı yuvarlanacak ve değer 130 olacaktır.
        123 aşağı yuvarlanacak ve değer 120 olacaktır.
*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int sonBas = sayi%10;
        int kucultulmus = sayi/10;
        String result = sonBas>=5 ?  "bir ust ondaliga = " +(kucultulmus+1)*10 : "kendi onluga = " +kucultulmus*10;
        System.out.println(result);


   /*  Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
                a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa yuvarla”
        b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”
        Örneğin; 127 yukarı yuvarlanacak ve değer 130 olacaktır.
        125 yukarı yuvarlanacak ve değer 130 olacaktır.
        123 aşağı yuvarlanacak ve değer 120 olacaktır.
*/
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int k = scanner.nextInt();
        // 1.yol
        String pwd ="Kigdg";

        String sonuc = pwd.length() >=8 ? (pwd.startsWith("i") ? "gecerli" : "bas harfi i olmalidir") :
                (pwd.startsWith("K") ?"gecerli" : "bas harfi K olmalidir");
        System.out.println(sonuc);

        // 2.yol
        if (pwd.length()>8){
            if (pwd.startsWith("i")){
                System.out.println("gecerli sifre");
            }else {
                System.out.println("bas harfi i olmalidir");
            }
        }else {
            if (pwd.startsWith("K")){
                System.out.println("gecerli");
            }else {
                System.out.println("bas harfi K olmalidir");
            }

        }

        //kullanicidan bir tamsayi alin
        //sayi poz cift sayi veya cift sayi degil yazdirin
        //sayi poz degilse  3 bas veya 3 bas degil seceneklerinden uygun olanı yazdirin


        if (sayi>0){
            String t = sayi%2 == 0 ? "cift sayi" : "tek sayi";
            System.out.println(t);
        }else {
             String t1 = sayi<-99 && sayi>-1000 ? "uc basmakli" : "uc bas degil";

            System.out.println(t1);
        }


          // 2.yol
       String s = sayi>0 ? sayi%2==0 ? "poz cift sayi" : "cift sayi degil" : sayi<-99 && sayi>-1000 ? "uc bas ": "uc bas degil";

        System.out.println(s);































    }
}
