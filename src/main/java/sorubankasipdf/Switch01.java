package sorubankasipdf;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
      /*
        1) Yazdırmak için switch ifadesini kullanınız.
        a) Aralık, Ocak, Şubat için "Kış"
        b) Mart, Nisan, Mayıs için "Bahar"
        c) Haziran, Temmuz, Ağustos için "Yaz"
        d) Eylül, Ekim, Kasım için "Güz"
        e) Diğerleri için "Geçersiz ay adı"
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ay adini giriniz size mevsimi soyleyeyim");
        String ayAdi = scan.next();

        switch (ayAdi.toLowerCase()){
            case "aralik":
            case "ocak":
            case "subat":
                System.out.println("kis");
                break;
            case "mart":
            case "nisan":
            case "mayis":
                System.out.println("ilkbahar");
                break;
            case "haziran":
            case "temmuz":
            case "agustos":
                System.out.println("yaz");
                break;
            case "eylul":
            case "ekim":
            case "kasim":
                System.out.println("sonbahar");
                break;
            default:
                System.out.println("gecersiz ay");




        }
    }
}
