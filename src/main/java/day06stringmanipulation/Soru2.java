package day06stringmanipulation;

public class Soru2 {
    public static void main(String[] args) {
        String isim = "berrin akar";
        String s1 = isim.replaceAll("r","");
        int rSayisi = isim.length()-s1.length();
        System.out.println("r karakteri = " +rSayisi + " defa tekrar edilmiş");

        String  str = "her sey cok sey guzel olacak";
        String s2 = str.replaceAll("e","");
        int eSyisi = str.length()-s2.length();
        System.out.println(eSyisi);


    }
}
