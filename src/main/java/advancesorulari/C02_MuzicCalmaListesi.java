package advancesorulari;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C02_MuzicCalmaListesi {
    public static void main(String[] args) {


    }

    public static class muzıkCalmaListesi {

        public static void main(String[] args) {

               /*
        Bir müzik çalma listesi uygulaması geliştiriyorsunuz.
        Kullanıcılar, çalma listelerine şarkı ekleyebilmeli, şarkıları sıralayabilmeli ve
        şarkıları listeden silebilmelidir.
        Ayrıca, kullanıcılara çalma listesini tamamen sıfırlama seçeneği de sunmanız isteniyor.
        */

            List<String> muzikCalmaListesi =new ArrayList<>();
            Scanner scan = new Scanner(System.in);
            muzikCalmaListesi.add("simarik ");
            muzikCalmaListesi.add("cingene");
            muzikCalmaListesi.add("zor");
            muzikCalmaListesi.add("ariyorum");
            muzikCalmaListesi.add("geceler");
            System.out.println(muzikCalmaListesi);
            System.out.println("====================");


            while (true){
                System.out.println("lutfen yapmak istediginiz islemi seciniz");
                System.out.println("1.sarki ekleme");
                System.out.println("2.sarkilari sirala");
                System.out.println("3.sarki sil");
                System.out.println("4.sarki listesini sifirla");
                System.out.println("5.cikis");

                int secenek = scan.nextInt();
                scan.nextLine();

                switch (secenek){
                    case 1:
                        System.out.println("lutfen eklemk istediginiz sarkini ismini giriniz");
                        String sarkiIsmi = scan.nextLine();
                        muzikCalmaListesi.add(sarkiIsmi);
                        System.out.println(sarkiIsmi + " sarkisi listeye eklendi " );
                        System.out.println("yeni sarki listesi " + muzikCalmaListesi);
                        System.out.println("============================");
                        break;

                    case 2:
                        Collections.sort(muzikCalmaListesi);
                        System.out.println("Siralanmis liste " +muzikCalmaListesi );
                        System.out.println("========================");
                        break;

                    case 3:
                        System.out.println("silmek istediginiz sarkinin ismini giriniz");
                        String sarki = scan.nextLine();
                        boolean varMi = muzikCalmaListesi.remove(sarki);
                        if (varMi){
                            System.out.println(sarki + " listeden silindi");
                            System.out.println("yeni sarki listesi " +muzikCalmaListesi);
                            System.out.println("============================");

                        }else {
                            System.out.println("sarki listede bulunamadi");
                            System.out.println("=========================");
                        }
                        break;

                    case 4:
                        muzikCalmaListesi.clear();
                        System.out.println("calma listeniz sifirlandi");
                        System.out.println(muzikCalmaListesi);
                        System.out.println("===========================");
                          break;

                    case 5:
                        System.out.println("cikis yapildi");
                        return;
                    default:
                        System.out.println("yanlis giris yaptiniz.Lutfen yukaridaki seceneklerden birini giriniz");

                }

            }
        }
    }
}
