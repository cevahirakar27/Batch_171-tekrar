package day06swapvaluesstringmanipulations.day10forloops;

public class Loops02 {
    public static void main(String[] args) {

        // ornek verilen bir string de kucuk harfleri ekrana yazdirmayiniz
        String s1 = "Pwd12?Ab"; // P12?A

        //ReplaceAll ile cozumu
        String s2 = s1.replaceAll("[a-z]", "");
        System.out.println(s2);
        System.out.println("");


        // 2.yol forloop
        for (int i = 0 ; i<s1.length(); i++){
            char ch = s1.charAt(i);
            if (ch >= 'a' && ch <='z'){
                continue;
            }
            System.out.print(ch);
        }


        System.out.println("");
        String t = "Java";
        for (int i = t.length()-1 ; i>=0 ; i-- ){
            char ch1 = t.charAt(i);
            System.out.print(ch1);
        }


    }


    }

