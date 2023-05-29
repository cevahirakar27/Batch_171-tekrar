package day06stringmanipulation;

public class StringManipulations01 {
    public static void main(String[] args) {

        String t = "Ali 13 yasindadir!...";
        // Ornek2 : "t" stringindeki tum rakamlari ve harfleri ! e cevirin

        String s1 = t.replaceAll("[a-zA-Z-0-9]","!");
        System.out.println("s1 = " + s1);

        // t stringindeki tum sesli harfleri ? cevirin
        String s2 = t.replaceAll("[eaiouAEIOU]","?");
        System.out.println("s2 = " + s2);

        //t stringindeki  kucuk harfler disindaki tum karakterleri  <> cevirin
        String s3 = t.replaceAll("[^a-z]","<>");
        System.out.println("s3 = " + s3);

        // t stringindeki tum harfler disinda + ya cevirin
        String s4 = t.replaceAll("[^a-zA-Z]","+");
        System.out.println("s4 = " + s4);

        // t stringindeki spaceler disindaki tum karakterleri ? cevirin
        String s5 = t.replaceAll("[\\S]","?");
        System.out.println("s5 = " + s5);
          //VEYA
        String s6 = t.replaceAll("[^ ]","?");
        System.out.println("s6 = " + s6);

        // sesli harfler disindaki tum karakterleri & cevirin
        String s7 = t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println("s7 = " + s7);

        
    }


}
