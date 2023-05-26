package day08ifelsesttatement;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class NestedIf06 {
    public static void main(String[] args) {

        //- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
        //sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
        //“istediginiz birim sisteme kayitli degil” yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen mesafeyi km olarak giriniz");
        double km = scan.nextDouble();
        System.out.println("lutfen cevirmek istediginiz birimi giriniz");
       String  cib = scan.next();


       if (cib.equalsIgnoreCase("m")) {
           System.out.println("m = " + km * 1000);
       } else if (cib.equalsIgnoreCase("cm")) {
           System.out.println("cm = " + (km*100000));

       }else {
           System.out.println("sisteme kayitli degil");
       }


    }
}
