package advancesorulari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_Student {
    public static void main(String[] args) {

    }

    public static class StudentSorusu {
        public static void main(String[] args) {


               /* Soru: Bir öğrenci listesi tutan bir program yazmamız isteniyor.
            Programımız, aşağıdaki seçenekleri sunmalı:
            - Öğrenci ekleme: Kullanıcıdan bir öğrenci adı alacak
            ve öğrenciyi listeye ekleyecek.
            - Öğrenci silme: Kullanıcıdan silmek istediği öğrenci adını alacak
            ve listeden bu öğrenciyi silecek.
                    - Öğrenci adı güncelleme: Kullanıcıdan güncellemek istediği
            öğrenci adını ve yeni adını alacak velistede ilgili öğrenci adını güncelleyecek.
                    - Toplam öğrenci sayısını sorgulama: Listedeki toplam öğrenci sayısını
            hesaplayacak ve ekrana yazdıracak.
            - Öğrenci arama: Kullanıcıdan aramak istediği öğrenci adını alacak
            ve listede bu öğrencinin olup olmadığını
            kontrol edecek.
            Program, kullanıcının seçtiği işlemi gerçekleştirdikten sonra seçenekleri tekrar
            sunmalı ve kullanıcı programdan çıkmak istediğinde çıkış yapmalıdır.
        */

           List<String> ogrenciListesi = new ArrayList<>();
           Scanner scan = new Scanner(System.in);

           ogrenciListesi.add("Berrin Akar");
           ogrenciListesi.add("Azra Aydin");
           ogrenciListesi.add("Sezen Aksu");
            System.out.println(ogrenciListesi);

            while (true) {
                System.out.println("lutfen asagidaki seceneklerden birini giriniz");
                System.out.println("1.Ogrenci ekleme");
                System.out.println("2.Ogrenci silme");
                System.out.println("3.Ogrenci Adi guncelle");
                System.out.println("4.Toplam Ogrenci sayisi");
                System.out.println("5.Ogrencinin Listede olup olmadigini kontrol etme");
                System.out.println("6.cikis");

                int secenek = scan.nextInt();
                scan.nextLine();
                switch (secenek) {

                    case 1:
                        System.out.println("ogrenci eklemek icin isim giriniz");
                    String ogrenciEkle = scan.nextLine();
                    ogrenciListesi.add(ogrenciEkle);

                    System.out.println("isim listeye eklendi");
                    System.out.println("yeni ogrenci listesi" + ogrenciListesi);
                        System.out.println("===================");
                    break;

                    case 2:
                        System.out.println("silmek istediginiz ogrenci ismini giriniz");
                        String ogrenciSil = scan.nextLine();
                       boolean silindiMi = ogrenciListesi.remove(ogrenciSil);
                       if (silindiMi){
                           System.out.println(ogrenciSil + " listeden silindi");
                           System.out.println("yeni igrenci listesi" +ogrenciListesi);
                       }else {
                           System.out.println(ogrenciSil +" isim listede bulunamadi");
                       }
                        System.out.println("==================");
                       break;

                    case 3:
                        System.out.println("lutfen degistirmek istediginiz ogrenci ismini giriniz");
                        String guncellenecekOgrenci = scan.nextLine();
                        int index = ogrenciListesi.indexOf(guncellenecekOgrenci);
                        if (index!=-1){
                            System.out.println("guncellemek istediginiz ogrenci ismini giriniz");
                            String yeni = scan.nextLine();
                            ogrenciListesi.set(index,yeni);

                            System.out.println(guncellenecekOgrenci + " ismi " + yeni + " olarak degistirildi");
                            System.out.println("yeni ogrenci listesi " + ogrenciListesi);
                            System.out.println("========================");
                        }else {
                            System.out.println("isim listede bulunamadi");
                        }
                        break;

                    case 4:
                        System.out.println("toplam ogrenci sayisi = " +(ogrenciListesi.size()));
                        System.out.println("============================");
                      break;

                    case 5:
                        System.out.println("lutfen aramak istediginiz ogrencinin ismini giriniz");
                        String arananOgrenci = scan.nextLine();
                        boolean varMi = ogrenciListesi.contains(arananOgrenci);
                        if (varMi){
                            System.out.println(arananOgrenci  +"" + " 6ismi listede bulunuyor");

                        }else {
                            System.out.println(arananOgrenci + " " +"listede bulunmuyor");
                        }
                        break;

                    case 6 :
                        System.out.println("cikis yapildi");
                        return;
                    default:
                        System.out.println("gecersiz giris");
                        break;

                }
            }




        }
    }
}
