package day03methodobjectcreations.day04forloopskarisiksorular;

import java.util.Scanner;

public class Loops13 {
    public static void main(String[] args) {

        // size verilen kucuk harfle yazilmis index i cift sayi olan karakterlerini buyuk harfe donusturun
        //   ankara   ==> AKR

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String str = scan.next();

        for (int i = 0 ; i<str.length() ; i++){
            char ch = str.toUpperCase().charAt(i);
            if (i %2 ==0){
                System.out.print(ch + " ");
            }


            }

        //Ornek 3: Verilen bir string de ilk a harfinden onceki tum characterleri console a yazdiriniz
        //   "I love Java"  ==> "I love J"
        System.out.println("");
        String s1 = "I love Java";
        for (int i = 0 ; i<s1.length() ; i++){
            char ch = s1.charAt(i);
            if (ch=='a'){
                break;
            }
            System.out.print(ch);
        }

        System.out.println();
        //ornek verilen bir stringde son a dan sonraki tum karakterleri ters sirada yazdirin
        // "Germany"    yn

        String t = "Germany";
        for (int i = t.length()-1 ; i>=0 ; i--){
            char ch2 = t.charAt(i);
            if (ch2 == 'a'){
                break;
            }

            System.out.print(ch2);
            }

        }


    }

