package day07stringmanipulations;

public class StringManipulations07 {
    public static void main(String[] args) {

        // ornek bir stringin belirli bir karakterinden baslayarak belirli bir karaktere kadar dynamic olarak alalim

        //      abc@gmail.com   ===> gmail

        String a = " abc@gmail.com  ";
        int b = a.indexOf('@')+1;
        int k = a.indexOf('.');
        String company = a.substring(b,k);
        System.out.println(company);

        //ornek 2 : verilen 2 stringin birbirinin aynisi olup olmadigini kontrol eden kodu yaziniz
        String h = "ali Can";
        String i = "Ali Can";
        boolean esitMi = h.equals(i);   //false
        System.out.println(esitMi);

        boolean p = h.equalsIgnoreCase(i);  //true
        System.out.println(p);
    }
}
