package day03methodobjectcreations.day04forloopskarisiksorular;

public class Loops04 {
    public static void main(String[] args) {

        //ornek 2: size verilen bir string in "Palindrome" olup olmadigini kontrol eden kodu yaziniz
        //  nalan, ey edip adanada pide ye, 404

        //Logic : String i ters cevir sonrada duz hali ile ters halini karsilastir, ayni ise "Palindrome"
        String duz = "Nalan";
        String ters3 = "";

        for (int i = duz.length()-1 ; i>= 0 ; i--){
          ters3 =  ters3 +duz.charAt(i);
        }
        System.out.println(ters3);

        if (duz.equalsIgnoreCase(ters3)){
            System.out.println(duz+ ": polidromdur");
        }else {
            System.out.println(duz + ": polidrom degildir");
        }


        }



    }




