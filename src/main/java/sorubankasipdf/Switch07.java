package sorubankasipdf;

import java.util.Scanner;

public class Switch07 {

    public static void main(String[] args) {

        /*

        7) Switch ifadesini kullanarak, mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir
   dönüştürücü oluşturmak için kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
    a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz "16 km" yazmalıdır
      (sayı dinamik olacak)
    b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
    kodunuz "2" yazmalıdır (sayı dinamik olacak)
    c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde,
    konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
    d) Kullanıcı mildenKmye, saniyedenSaate, fahrenaytdanSantigarata ‘dan farklı bir işlem girdiğinde,
     kodunuz "Bu operatör, o dönüştürücü için tanımlanmadı" yazmalıdır.
     km = mil*1.609;
     santigrat = (fahrenayt-32)*5/9);
     saat = saniye/3600;

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi = scan.nextDouble();
        System.out.println("lutfen cevirmek istediginiz birimi giriniz .. ml/ f/ sn ");
        String cevirmekIstedigimBirim = scan.next().toLowerCase();


         if (sayi<0){
             System.out.println("lutfen poz sayi girinz");
         }else {


             switch (cevirmekIstedigimBirim) {
                 case "sn":
                     System.out.println("saat = " + (sayi / 3600));
                     break;
                 case "f":
                     System.out.println("santigrat = " + (sayi - 32) * 5 / 9);
                     break;
                 case "ml":
                     System.out.println("km = " + (sayi * 1.609));
                     break;
                 default:
                     System.out.println("bu operator icin donusturucu saglanmadi");

             }

         }


    }
}
