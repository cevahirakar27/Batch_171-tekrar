package day07stringmanipulations.day10nestedternaryswitch;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {

        //kullanicidan bir ulke ismi alin.alinan ulke adina gore kısaltmalari yazdirin
        //amerika  ("us)

           Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir ulke ismi giriniz");
        String ulkeIsmi = scan.nextLine();

        switch (ulkeIsmi.toLowerCase()){
            case "amerika":
                System.out.println("us");
                break;
            case "turkiye":
                System.out.println("TR");
                break;
            default:
                System.out.println("hatali giris");


                
        }
    }
}
