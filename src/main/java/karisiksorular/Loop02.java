package karisiksorular;

import java.util.Scanner;

public class Loop02 {
    public static void main(String[] args) {


        // Ornek 6 : Kullanicidan bir string isteyin tersine cevirip yazdirin
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir string giriniz");
        String str = input.nextLine();
        String ters = "";

        for (int m = str.length()-1 ; m >= 0 ; m--){
            ters = ters + str.charAt(m);

        } System.out.println(ters);


    }
}
