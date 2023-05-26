package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulationsHomework {
    public static void main(String[] args) {

        //homework
        /*
        1. bir string variable olusturun ve bu strindeki rakam olmayan tum karakterlerin sayisini konsola yazdiriniz
        2.bir string olusturun ve ilk karakter ile son karakter disindaki tum karakterleri konsola buyuk harfle yazdirin
        3. bir strin varible olusturun.ilk ve son karakterlerin ascii degerleri toplamini konsola yazdirin
        4. tek kelimeli bir sehir ismi icin sehir isminin ilk harfini buyuk harfle diger harflerini kucuk harflerle konsola yazdirin
        5. asagidaki kurallara gore kullanicinin girdigi psswordu kontrol ediniz
           - en az 6 karakter olsun
           -en az 1 tane buyuk harf olsun
           -en az 1 tane kucuk harf olsun
           -en az 1 rakam olsun

         */
        //ORNEK 1: bir string variable olusturun ve bu strindeki rakam olmayan tum karakterlerin sayisini konsola yazdiriniz

          String str = "Jav5a c&(ook85 weg%û45zel0dir..";
          String s1 = str.replaceAll("[0-9]","");
        System.out.println(s1);
        int karakterSayisi = s1.length();
        System.out.println("karakterSayisi = " + karakterSayisi);         //25

        // ORNEK 2 :bir string olusturun ve ilk karakter ile son karakter disindaki tum karakterleri konsola buyuk harfle yazdirin

        String s2 = "Java ile ogrenmek cok kolay";
       String s3 = s2.substring(0,1).toLowerCase()+s2.substring(1,s2.length()-1).toUpperCase()+
               s2.substring(s2.length()-1).toLowerCase();
        System.out.println(s3);    //  jAVA ILE OGRENMEK COK KOLAy
        
        // ORNEK 3 :bir string variable olusturun.ilk ve son karakterlerin ascii degerleri toplamini konsola yazdirin
          
          String name = "Berrin";
          int ilkIndexAscii = name.charAt(0);
        System.out.println("Ilk Indexin Ascii degeri = "+ ilkIndexAscii);  //66

        String sonIndex = name.substring(name.length()-1);
        int sonIndexAscii = sonIndex.charAt(0);
        System.out.println("Son Index Ascii = " + sonIndexAscii);       //110
        System.out.println("Toplam Ascii degeri = " +(ilkIndexAscii+sonIndexAscii));    //176
        
        
        //ORNEK 4 : tek kelimeli bir sehir ismi icin sehir isminin ilk harfini buyuk harfle
        // diger harflerini kucuk harflerle konsola yazdirin
        
        String sehir = "gaziantep";
     String sonHali =  sehir.toUpperCase().charAt(0)+(sehir.substring(1).toLowerCase());
        System.out.println("sonHali = " + sonHali);    //Gaziantep

      /*  ORNEK 5 : asagidaki kurallara gore kullanicinin girdigi psswordu kontrol ediniz
        - en az 6 karakter olsun
        -en az 1 tane buyuk harf olsun
        -en az 1 tane kucuk harf olsun
        -en az 1 rakam olsun

       */
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen passwordunuzu giriniz");
        String password = input.nextLine();

        boolean first = password.length()>5;
        boolean second = password.replaceAll("[^A-Z]","").length()>0;
        boolean third = password.replaceAll("[^a-z]","").length()>0;
        boolean fifth = password.replaceAll("[^0-9]","").length()>0;
        boolean sonuc = first && second && third && fifth;
        System.out.println("sonuc = " + sonuc);
    }
}
