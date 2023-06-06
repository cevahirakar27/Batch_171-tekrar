package karisiksorular;

public class MethodOwerloading {
    public static void main(String[] args) {

        // ceket fiyati 100
        // ogrenciye 10, gazilere 20, yaslilara 5 lira indirim yapan bir method yazin

        int fiyat = 100;

        System.out.println(indirimliFiyat("ogrenci", fiyat));  // 80
        System.out.println(indirimliFiyat("gazi", fiyat));     // 90
        System.out.println(indirimliFiyat("yasli", fiyat));    // 95
        System.out.println(fiyat);  // 100


    }

    private static int indirimliFiyat(String tipler, int fiyat) {
        switch (tipler){
            case "ogrenci":
                fiyat= fiyat-20;
                break;
            case  "gazi":
                fiyat = fiyat-10;
                break;
            case "yasli":
            fiyat= fiyat-5;
            break;
            default:
                fiyat= fiyat;
        }
        return fiyat;

    }


}
