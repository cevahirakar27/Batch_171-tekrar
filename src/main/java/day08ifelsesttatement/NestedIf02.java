package day08ifelsesttatement;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {

             /*
          Example 2:Kullanicidan bir ucgenin kenar uzunluklarini aliniz.ucgen mi diye kontrol edin
                    Uc kenari birbirine esit ise "Eskenar Ucgen " yazdiriniz
                    Sadece iki kenar uzunlugu biribirine esit ise "Ikizkenar ucgen"
                    Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz        */

        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlari icin 3 tane uzunluk giriniz...");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();


        boolean ucgenmi = a + b > c && c > Math.abs(a - b) &&
                a + c > b && b > Math.abs(a - c) &&
                b + c > a && a > Math.abs(b - c);

        if (a<= 0 || b<= 0 || c<= 0){
            System.out.println("gecerli kenar giriniz");
        } else if (ucgenmi) {



            if (a == b && b == c) {
                System.out.println("ucgen hem de eskenar");
            } else if (a == b || b == c || a == c) {
                System.out.println("ucgen ikizkenar ucgen");

            } else {
                System.out.println("ucgen cesitkenar ıcgen");
            }


        } else {
            System.out.println("ucgen degil");
        }
    }
}