package sorubankasipdf;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {

        /*
        4) Cinsiyet "Erkek" ise "Erkek" yazdırınız.
Cinsiyet "Kadın" ise "Kız" yazdırınız.
Cinsiyet "Erkek" ve "Kadın"dan farklıysa "Diğerleri" yazdırınız.
Not : Bu seçenekler dışındakilerini yoksayınız.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cinsiyetini giriiniz.. Kadin / Erkek" );
            String cinsiyet = scan.next();
            switch (cinsiyet.toLowerCase()){
                case "erkek":
                    System.out.println("erkek");
                    break;
                case "kadin" :
                    System.out.println("kiz");
                    break;
                default:
                System.out.println("digerleri");
            }


    }
}
