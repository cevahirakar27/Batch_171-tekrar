package sorubankasi;

import java.util.Scanner;

public class IfElseTernary02 {
    public static void main(String[] args) {

         /*  Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
                a) Son basamak 5 ‘e eşit ve 5 den büyükse, “Son basamağı bir üst ondalığa yuvarla”
        b) Son basamak 5 den küçükse, “Son basamağı bir alt ondalığa yuvarla”
        Örneğin; 127 yukarı yuvarlanacak ve değer 130 olacaktır.
        125 yukarı yuvarlanacak ve değer 130 olacaktır.
        123 aşağı yuvarlanacak ve değer 120 olacaktır.
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        int sonBasamak = sayi%10;
        sayi = sayi/10;
        String sonuc = sonBasamak>=5 ? "son bas bir ust ondaliga yuvarla : "+ (sayi+1)*10
                : "kendi onluguna yuvarla : " +(sayi*10);

        System.out.println(sonuc);



     //   Nested Ternary kullanarak;
       // Şifreyi kontrol etmek için kodu yazınız.
        //8'den fazla karakter içeriyorsa, baş harfi 'i' olmalıdır.
        //8 karakterden fazla içermiyorsa, baş harfi 'K' olmalıdır.

        String pwd ="ihvfvvmnvb";

        String sifreGcerliMi = pwd.length()>8 ? pwd.startsWith("i") ?"gecerli" : "gecersiz":
                pwd.startsWith("K") ? "gecrli ":  "gecrsiz";

        System.out.println(sifreGcerliMi);


        if (pwd.length()>8){
            if (pwd.startsWith("i")){
                System.out.println("sifre gecrli");
            }else {
                System.out.println(" sifre gecersiz");
            }
        }else {
            if (pwd.startsWith("K")){
                System.out.println("gecerli");
            }else {
                System.out.println("gecersiz");
            }
        }

        //kullanicidan bir tamsayi alin
        //sayi poz cift sayi veya cift sayi degil yazdirin
        //sayi poz degilse  3 bas veya 3 bas degil seceneklerinden uygun olanı yazdirin


        System.out.println("lutfen bir sayi giriniz");
        int i = scan.nextInt();
        if (i>0) {
            String s = i % 2 == 0 ? "cift sayi " : "cift sayi degil";
            System.out.println(s);

        } else {
            String s1 = i<-99 && i>-1000 ? "uc basamkli" : "uc basamakli degil";
            System.out.println(s1);
        }






    }
}

