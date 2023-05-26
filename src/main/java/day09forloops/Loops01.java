package day09forloops;

import karisiksorular.Soru4;

public class Loops01 {
    public static void main(String[] args) {

        // ornek : bir stringi ters ceviren kodu yaziniz
        // 1.yol
        String s1 = "Java";
        String ters = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            ters = ters + s1.substring(i, i + 1);

        }
        System.out.print(ters);
        System.out.println("\n");
        // //ornek 2: size verilen bir string in "Palindrome" olup olmadigini kontrol eden kodu yaziniz

        String duz = "Nalan";
        String ters2 ="";
        for (int i = duz.length()-1; i >=0 ; i--) {
             ters2 = ters2+duz.charAt(i);
        }
            if (duz.equalsIgnoreCase(ters2)){
                System.out.println("palindrom");

        }else {
                System.out.println("palindrom degil");
            }


}
}