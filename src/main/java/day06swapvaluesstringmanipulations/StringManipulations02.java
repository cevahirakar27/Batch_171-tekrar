package day06swapvaluesstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        String s = "Learn Java earn money";
        //Ornek 1: "s" String inin "money" ile bitip bitmedigini kontrol ediniz.
        boolean s1 = s.endsWith("money");
        System.out.println("s1 = " + s1);

        //Ornek2: "s" String indeki "money" kelimesini "dollar" kelimesine ceviriniz
        String s2 = s.replace("money","dollar");
        System.out.println("s2 = " + s2);


        //Ornek3: "s" String'indeki "earn" kelimesini "win" kelimesine ceviriniz
        String s3 = s.replace("earn","win");
        System.out.println(s3);


        //Ornek4: "s" String'indeki "a" harflerini "*" a ceviriniz
        String s4 = s.replaceAll("a","*");
        System.out.println(s4);

        //Ornek 5: "s" String'indeki "n" harflerini "xxx" a ceviriniz
        String s5 = s.replaceAll("n","xxx");
        System.out.println(s5);

        //Ornek 6:  "s" String'indeki "e" harflerini siliniz
        String s6 = s.replaceAll("e","");
        System.out.println(s6);

    }
    
}
