package day01_variables.day05concatinationoperatortypecasting;

public class Operators {
    public static void main(String[] args) {

        boolean first=  3<5;
        System.out.println("first = " + first);    //True

        boolean second = 2+3 != 5;
        System.out.println("second = " + second);   //false

        boolean third = 2+3*5 >= 19;
        System.out.println("third = " + third);   //false

        System.out.println(first && second);  //false
        System.out.println(first || second || third);  //true


    }


}
