package day08ifelsesttatement;

import java.util.Scanner;

public class NestedIf05 {
    public static void main(String[] args) {

        //Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        //hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        //obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        //zayif yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println(" lutfen kilonuzu giriniz");
        double kilo = scan.nextDouble();
        System.out.println("lutfen boyunuzu giriniz");
        double boy = scan.nextDouble();

        double vke = ( kilo*10000) /(boy*boy);
        if (vke > 30){
            System.out.println("obez");
        } else if (vke >25) {
            System.out.println("kilolu");

        } else if (vke>20) {
            System.out.println("normal");

        } else if (vke>0 && vke<20) {
            System.out.println("zayif");

        }else {
            System.out.println("yanlis giris");
        }
    }
}
