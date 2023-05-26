package day06swapvaluesstringmanipulations;

public class ReplaceAll {
    public static void main(String[] args) {

        String s1 = "Java 5ile8 &&?hersey guzel";
        String s2 =s1.replace('5','e');
        System.out.println(s2);

        String s3 = s1.replace("sey","ol");
        System.out.println(s3);

            String s4 = s1.replaceAll("sey","al");
        System.out.println(s4);

        String s5 = s1.replaceAll("5","o");
        System.out.println(s5);
    }
}
