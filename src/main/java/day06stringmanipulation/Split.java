package day06stringmanipulation;

public class Split {

    public static void main(String[] args) {

        //ORNEK3: verilen ismi ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdirin
        // "   Ali Can    "   ==> AC
        String isim = "   ali cAN  ";
        // split methodu stringi istedigimiz yerden parcalamay yarar.

        char first = isim.trim().toUpperCase().charAt(0);
        System.out.println("first = " + first);

       char last = isim.trim().split(" ")[1].toUpperCase().charAt(0);
        System.out.println("last = " + last);

        System.out.println(""+first+last);
    }
}
