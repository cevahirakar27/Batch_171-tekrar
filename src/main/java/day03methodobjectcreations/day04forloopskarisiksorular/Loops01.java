package day03methodobjectcreations.day04forloopskarisiksorular;

public class Loops01 {
    public static void main(String[] args) {

        // 21 den 180 e kadar 2 ve 3 e tam bolunebilen tam sayilari yazdir

        for ( int i = 21   ;    i<181 ;  i++){
            if (i%2==0  && i%3==0){
                System.out.print(i + " ");
                System.out.print("");
            }
        }

        // size verilen kucuk harfle yazilmis index i cift sayi olan larakterlerini buyuk harfe donusturun
        //   ankara   ==> AKR
        String str = "ankara";
        System.out.println("");

        for (int i = 0;  i<str.length() ; i++){
            if (i % 2 ==0){
                String ch =str.toUpperCase().substring(i,i+1);
                System.out.print(ch);
            }
        }
        System.out.println("");
        //Ornek 3: Verilen bir string de ilk a harfinden onceki tum characterleri console a yazdiriniz
        //   "I love Java"  ==> "I love J"

        String s1 = "I love Java";
        for (int i = 0 ; i<s1.length() ; i++){

            char ch1 = s1.charAt(i);

            if (s1.charAt(i) =='a'){
                break;

            }
            System.out.print(ch1);
        }
        System.out.println("");

        //ornek verilen bir stringde son a dan sonraki tum karakterleri ters sirada yazdirin
        // "Germany"    yn

        String s2 ="Germany";
        for (int i =s2.length()-1; i>=0 ; i--){
            char ch3 = s2.charAt(i);
            if (s2.charAt(i)=='a'){
                break;
            }
            System.out.print(ch3);
        }
        System.out.println("");
        for ( int i = s2.length()-1; i>=0; i--){                 //Germany tersten yazdirin
            char ch4 = s2.charAt(i);
            System.out.print(ch4);
        }
        System.out.println("");

    }
}
