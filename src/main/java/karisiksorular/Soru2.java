package karisiksorular;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        //    //kullanicidan bir cumle bir metin alin cumlede metnin durumuna gore
        //        //1-cumle metni icermiyor
        //        //2-cumle metni sadece 1 kere iceriyor
        //        //3-cumle metni birden fazla iceryor seceneklerinden uygun olani yazdirin


        String cumle="Java  cok guzeldir cok";
        String metin="cok";

        if (!cumle.contains(metin)){
            System.out.println("cumle metin icermiyor");
        }
        else {
            int ilkIndex=cumle.indexOf(metin);  //5
            System.out.println(ilkIndex);
            int ikinciIndex=cumle.indexOf(metin,ilkIndex+1);
            System.out.println(ikinciIndex);     //18

            if (ikinciIndex==(-1)){
                System.out.println("cumle metni sadece 1kere iceriyor");
            }
            else {
                System.out.println("cumle metni birden fazla iceriyor");
            }

        }
    }
}