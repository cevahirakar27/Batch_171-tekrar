package day23datetimevarargs;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {

        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir tarih giriniz");
        int yil = scan.nextInt();
        int ay = scan.nextInt();
        int gun = scan.nextInt();

        LocalDate verilenTarih = LocalDate.of(yil,ay,gun);
        if (verilenTarih.isBefore(LocalDate.now())){

            System.out.println("gecersiz");
        }else {
            System.out.println("bilet tarihi giriniz");
        }
    }
}
