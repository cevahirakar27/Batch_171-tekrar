package day23datetimevarargs;

import java.util.Scanner;

public class Varargs02 {
    public static void main(String[] args) {

        //Example 2: Verilen isimlerin ilk harflerini console'a yazdiran method'u olusturunuz.
        //           Ali Can ==> AC    Kemal Han ==> KH



        ilkHarf("berrin akar","ali can","veli gel","ayse demir");




    }

    public  static  void ilkHarf(String ...ad){
        String yeniAd = "";

        for (String w : ad) {

            yeniAd = yeniAd + w.split(" ")[0].charAt(0) + w.split(" ")[1].charAt(0);
                System.out.println(yeniAd);
            yeniAd = "";

        }
    }
}
