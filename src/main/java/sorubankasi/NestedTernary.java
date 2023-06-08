package sorubankasi;

import java.util.Scanner;

public class NestedTernary {
    public static void main(String[] args) {

        //   Nested Ternary kullanarak;
        // Şifreyi kontrol etmek için kodu yazınız.
        //8'den fazla karakter içeriyorsa, baş harfi 'i' olmalıdır.
        //8 karakterden fazla içermiyorsa, baş harfi 'K' olmalıdır.


    String pwd = "K235";

   String sonuc = pwd.length()>8 ? pwd.startsWith("i") ? "gecerli" : "bas harfi i olmalidir" : pwd.startsWith("K") ? "gecrli":
    "bas harfi K olmalidir";
        System.out.println(sonuc);


    }
}
