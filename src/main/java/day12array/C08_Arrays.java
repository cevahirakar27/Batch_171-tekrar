package day12array;

import java.util.Arrays;

public class C08_Arrays {
    public static void main(String[] args) {

        //size verilen bir cumlede kac kelime oldugunu veren kodu yaziiniz

        String s= "Java is easy. Learn Java earn money.";
        String arr [] =s.split(" ");
        System.out.println(Arrays.toString(arr));    // [Java, is, easy., Learn, Java, earn, money.]
        System.out.println(arr.length);             // 7


        //yukaridaki sitringde kac harf oldugunu bulunuz
            int s1 = s.replaceAll("[^a-zA-Z]","").length();
        System.out.println(s1);     //28
    }
}
