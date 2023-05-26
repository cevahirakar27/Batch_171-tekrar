package day02datatypesmethodcreation;

public class Tekrar03_MethodCreation {
    public static void main(String[] args) {
        //girilen 2 sayiyi carpan bir method olusturun ve yazdirin
        
        int a=5;
        int b=6;
        carpimSonucu(a,b);

        //ornek2 nin cevabi
        String kelime = "Berrin Akar";
        isim(kelime);


    }

    private static void isim(String kelime) {

        System.out.println("isim = " + kelime);
    }

    private static void carpimSonucu(int a, int b) {
        System.out.println("sonuc = " + a*b);
    }

    // //ornek2: girilen bir kelimeyi ekrana yazdiran bir method olusturup yazdirin





}
