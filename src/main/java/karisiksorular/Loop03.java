package karisiksorular;

import java.util.Scanner;

public class Loop03 {
    public static void main(String[] args) {

        // kullanicidan bir string isteyip palindrom olup olmadigini kontrol ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir string giriniz");
        String duz = scan.nextLine();
        String ters = "";

        for (int i = duz.length()-1; i >=0 ; i--) {
            ters = ters + duz.charAt(i);
        }if (duz.equalsIgnoreCase(ters)){
            System.out.println("palindrom");
        }else {
            System.out.println("palindrom degil");
        }



    }
}