package day08ifelsesttatement;

import java.util.Scanner;

public class NestedIf03 {
    public static void main(String[] args) {


        /*
                Password'un ilk harfi buyuk harf ise

                    'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    Adana ==> Gecerli

                Passwordun ilk harfi kucuk harf ise

                    'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                    zehirli ==> Gecerli
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen passwordunuzu giriniz");
        String psw = scan.nextLine();

        if (psw.charAt(0) >= 'A' && psw.charAt(0) <= 'Z'){
            if (psw.charAt(0) == 'A'){
                System.out.println("gecerli password");
            }else {
                System.out.println("gecersic.harf buyuk ama A degil");
            }
        } else if (psw.charAt(0) >= 'a' && psw.charAt(0) <= 'z') {
            if (psw.charAt(0)== 'z'){
                System.out.println("gecerli");
            }else {
                System.out.println("gecersiz.harf kucuk ama 'z' degil ");
            }
            
        }else {
            System.out.println("lutfen gecerli karakter giriniz");
        }


    }
}