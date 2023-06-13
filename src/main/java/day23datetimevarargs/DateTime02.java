package day23datetimevarargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        // ANlik zamnai nasil alabiliriz
        LocalTime anlikZaman = LocalTime.now();
        System.out.println(anlikZaman);   // simdiki saati verir


        // Anlik zamanda bilesenler nasil alinir.
     int saat =   anlikZaman.getHour();
        System.out.println(saat);         // simdiki zamanin sadece saatini verir

        System.out.println(anlikZaman.minusHours(2)); // 2 saat once
        System.out.println(anlikZaman.getMinute());  // anlik dakikayi verir.
        System.out.println(anlikZaman.getSecond());// anlik saniyeyi verir.
        System.out.println(anlikZaman.getNano());  // anlik saniseyi verir
        System.out.println(anlikZaman.minusMinutes(2)); // 2 dakika oce
        System.out.println(anlikZaman.plusHours(3));  // 3 saat sonra

        //gelecek ve gecmise nasil gidilir
      LocalTime saat2 =  anlikZaman.plusHours(2).plusMinutes(3).minusSeconds(3);
        System.out.println(saat2);

        // zaman formati nasil degistiilir.
        /*
        DateTime class ta kullanilan tarih saat formatlari
        HH : mm    ==> 24 lu saat sistemi. AM,PM gosterilmez.
        hh : mm ==> 12 li saat sistemi  AM,PM gosterilmez.
        hh : mm a ==> 12 li saat sistemi AM,PM gosterilir.ogleden once ogleden sonra
        HH : mm ss ==> 24 lu saat sistemi.
        HH :MM ==> yanlis format. MM aylar icin kullanilir.
        "mm" minute demektir. "MM" month demektir.

        dd-MM-yyy==> gun ay ve yil veriyor.
        MMM ==> ayini lk 3 harfini verir
        MMMM ==> ayi hepsini verir.

          dd-MM-yyyy ==> gun ay yil
        MMM ==> Aug
        MMMM ==> August

         */
        //Anlik zamani nasil aliriz?
        LocalTime saat3 = LocalTime.now();

      DateTimeFormatter format1 = DateTimeFormatter.ofPattern( "HH : mm" );

         String k = format1.format(saat3);
        System.out.println(k);

        //Date formati nasil degistirilir?

        LocalDate tarih = LocalDate.of(2023,6,11);
        System.out.println(tarih);  // 2023-06-11

        // 2023/06/11
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
       String t = format2.format(tarih);
        System.out.println(t);   // 2023/06/11

        // 23/06/11 sekilinde formatlayi
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("yy/MM/dd");
       String l = format3.format(tarih);
        System.out.println(l);    // 23/06/11

        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println(format4.format(tarih));   // 11 / Haz/ 2023

        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("dd/MMMM/yy");
        System.out.println(format5.format(tarih));  // 11/Haziran/23

        DateTimeFormatter format6 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        System.out.println(format6.format(tarih));  // 11/Haziran/2023

        LocalDate asyaTarih = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(asyaTarih);

        LocalTime berlinSaat = LocalTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(berlinSaat);


    }
}
