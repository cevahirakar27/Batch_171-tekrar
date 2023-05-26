package day06swapvaluesstringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        //String bir non-primitive data type dir ve ayni zamanda bir classdir.

        String s = "Java is easy";
        //Ornek 1: "s" String indeki tum characterleri buyuk harf yapiniz.

        String sUPPER = s.toUpperCase();
        System.out.println(sUPPER);

        //Ornek 2: "s" String indeki tum characterleri kucuk harf yapiniz
        String sLOWER = s.toLowerCase();
        System.out.println(sLOWER);

        //Ornek 3: "s" String indeki ilk characteri aliniz.
        char ilkKarakter = s.charAt(0);  //J
        System.out.println(ilkKarakter);

        //Ornek 4: "s"  Stringindeki ikinci ve sondan ikinci characteri aliniz ve ekrana yazidiriniz

        char ikinciKarakter = s.charAt(1);
        System.out.println(ikinciKarakter);  // a

        char sondanIkinciKarakter = s.charAt(10);
        System.out.println(sondanIkinciKarakter);  //s
        System.out.println( "" +ikinciKarakter + sondanIkinciKarakter);

        //   //Ornek 5: "s" String inde kullanilan toplam character sayisini bulunuz
          int karakterSayisi = s.length();
        System.out.println(karakterSayisi);    //12

        ////Ornek 6: "s" String'indeki ilk 4 characteri aliniz
        String ilkDortKarakter = s.substring(0,4);
        System.out.println("ilkDortKarakter = " + ilkDortKarakter);

        //    //Ornek7: "s" String'indeki "is" kelimesini aliniz
        
        String s1 = s.substring(5,7);
        System.out.println("s1 = " + s1);

        //Ornek8: "s" String'indeki "easy" kelimesini aliniz
        String s2 = s.substring(8,12);
        System.out.println("s2 = " + s2);
        
        //2.yol
        String s3 = s.substring(8);
        System.out.println("s3 = " + s3);
        
        //Ornek 9:  "s" String'inde "money" kelimesinin var olup olmadigini kontrol ediniz
        boolean money = s.contains("money");
        System.out.println("money = " + money);

        //Ornek 10:  "s" String'inin belli bir harf yada harflerle baslayip baslamadigini kontrol ediniz
        boolean s4 = s.startsWith("Java");
        System.out.println(s4);

        //Ornek 11: "s" String inin 5. index dahil olmak uzere bu indexten itibaren "i" karakteri ile baslayip baslamadigini
        //kontrol eden kodu yaziniz

        boolean s5 = s.startsWith("i",5);
        System.out.println(s5);
        

    }
}
