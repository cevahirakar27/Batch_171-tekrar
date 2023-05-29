package day12array;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        // Ornek 1 : string array olusturun icine 5 tane eleman ekleyin.ilk eleman ile son elemaninn icerdigi karakter sayilari
        //toplamini yazdirin

        String arr [] = new  String [5];
        arr [0] = "ali";
        arr [1] = "kasim";
        arr [2] = "eylul";
        arr [3] = "ekim";
        arr [4] = "berrin";
        System.out.println(Arrays.toString(arr));   //[ali, kasim, eylul, ekim, berrin]

         int ilkKarkterSayisi = arr[0].length();
        System.out.println(ilkKarkterSayisi);
        int sonKarakterSayisi = arr[arr.length-1].length();
        System.out.println(sonKarakterSayisi);
        System.out.println(sonKarakterSayisi+ilkKarkterSayisi);    // 6+3 = 9

        System.out.println();

        // //Ornek2 : string bir array olusturun ve icine 5 tane eleman ekleyin.tum elemanlarin icerdigi
        //        //karakter sayilari toplamini yazdirin

               String brr[]=new  String[5];
                brr[0]="miami";
                brr[1]="istanbul";
                brr[2]="ankara";
                brr[3]="oslo";
                brr[4]="erzurum";
        System.out.println(Arrays.toString(brr));   //[miami, istanbul, ankara, oslo, erzurum]

        int toplam = 0;
        for (int i = 0 ; i<brr.length ; i++ ) {
            toplam = toplam + brr[i].length();

        }
        System.out.println("toplam karakter sayisi = " +toplam);


        // for each cozumu

        int toplam2 = 0;
        for ( String w : brr){
            toplam2 = toplam2+ w.length();
        }
        System.out.println(toplam2);


        //  //Ornek3 : notlar adinda int bir array olusturun.icine 6 tane not yerlestirin
        //        // ve not ortalamasini ekrana yazdirin
        //
                int not [] = new int [6];
                not [0] = 50;
                not [1] = 70;
                not [2] = 60;
                not [3] = 40;
                not [4] = 90;
                not [5] = 80;

        System.out.println(Arrays.toString(not));  //[50, 70, 60, 40, 90, 80]

        int toplam3 = 0;
    for ( int w : not){
         toplam3 = toplam3+ w;
    }
        System.out.println("ortalama = " + toplam3/not.length);












    }
}
