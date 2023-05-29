package day01_variables.day05concatinationoperatortypecasting;

public class Concatination {
    public static void main(String[] args) {

        //bir string ve iki int variable i olusturun toplamini konsola yazdirin
        String s = "elma";
        int a = 10;
        int b = 11;

        System.out.println(s+a+b);  //elma1011
        System.out.println(a+s+b);  //10elma11
        System.out.println(a+b+s);  //21elma
        System.out.println(s+ a*b); //elma110
        System.out.println(s + (a+b));  // elma21

        //ornek : size string olarak verilen iki fiyatin toplamini ekrana yazdirin

        String shirt = "2300";
        String shoes = "5200";
        System.out.println(shirt+shoes);  //23005200

        //   Integer.valueOf() String degerleri int e cevirir
        int toplam = Integer.valueOf(shirt)+ Integer.valueOf(shoes);
        System.out.println("toplam = " + toplam);
                
    }
}
