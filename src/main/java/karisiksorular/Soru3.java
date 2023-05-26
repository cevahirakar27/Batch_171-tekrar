package karisiksorular;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {

        //: Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        //sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
        //input : java1 ogRe2@nMek3 #ne +Gu=zel
        //output : Java ogrenmek ne guzel.

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir metin giriniz");
        String metin = scan.nextLine();

        String s1 = metin.replaceAll("[0-9]","");
        System.out.println(s1);

        String s2 = s1.replace(" ","5");
        System.out.println(s2);

        String s3 = s2.replaceAll("\\W","");
        System.out.println(s3);

        String s4 = s3.replace("5", " ");
        System.out.println(s4);


        String s5 = s4.toUpperCase().charAt(0)+ s4.substring(1).toLowerCase();
        System.out.println(s5);





    }
}
