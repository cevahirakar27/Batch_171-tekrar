package day06swapvaluesstringmanipulations;

public class StartWithEndsWith {

    public static void main(String[] args) {

        String s = "Java ile her sey cok guzel";
         boolean s1 = s.startsWith("Ja");
        System.out.println(s1);        //true

        boolean s2 = s.endsWith("zel");
        System.out.println(s2);          //true

        boolean s3 = s.endsWith("l");
        System.out.println(s3);        //true

        boolean s4 = s.contains("er");
        System.out.println(s4);         //true

        boolean s5 = s.startsWith("Jav");
        System.out.println(s5);                //true

        String s6 = s.substring(8,8);
        System.out.println(s6);        //bır sey yazdirmaz

        String s7 =s.replace( s.substring(0),"Java ıle HER SEY COK OZEL");

        System.out.println(s7);
    }
}
