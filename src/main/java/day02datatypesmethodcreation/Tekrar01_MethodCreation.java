package day02datatypesmethodcreation;

public class Tekrar01_MethodCreation {
    // Ornek2: iki sayiyi carpma islemi yapan bir method olusturun ve kullanin

    public static void main(String[] args) {

        double carpimSonucu=ikiSayiyiCarp(9.4,8.5);
        System.out.println("carpimSonucu = " + carpimSonucu);

        System.out.println("sonuc = " +ikiSayiyiCarp(9.4,8.5));

        //ornek3 ün devami
        // 1.yontem:
        int sonuc=ilkIkiSayiyiCarpUcuncuyuTopla(3,4,6);

        System.out.println("sonuc = " + sonuc);

        //2.Yontem:
        System.out.println("sonuc = " +ilkIkiSayiyiCarpUcuncuyuTopla(3,4,6));

    }

    protected static double ikiSayiyiCarp(double a,double b){

        return a*b;
    }

    // Ornek3: verilen 3 sayidan ilk ikisini carpan 3.sayi ile sonucu toplaya sonucu olusturun ve kullanin

    private static int ilkIkiSayiyiCarpUcuncuyuTopla(int x , int y , int z){

        return (x*y) +z;
    }
}

