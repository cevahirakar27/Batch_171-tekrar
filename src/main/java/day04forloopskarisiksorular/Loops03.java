package day04forloopskarisiksorular;

public class Loops03 {
    public static void main(String[] args) {
        String s = "Java guzeldir";

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            System.out.print(ch);
        }


        //1. yol
        String t = "Java";
        String ters = "";

        for (int i = t.length() - 1; i >= 0; i--) {

            ters = ters + t.substring(i, i + 1);

        }
            System.out.println("");
            System.out.println(ters);


    }
}