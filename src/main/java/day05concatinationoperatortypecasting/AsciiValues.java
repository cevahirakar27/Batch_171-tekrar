package day05concatinationoperatortypecasting;

public class AsciiValues {
    public static void main(String[] args) {
            /*
        java da her karakterin sayisal bir degeri vardir
        bu degerler ASCII degerler olarak adlandirilir
        Bu degerlerin tamaminin bulundugu tabloya ASCII table denir
         */

        //Herhangi bir character in ASCII degerini bulmak icin o karakteri "int " data typinda bir variable in icine koyunuz

        int intA = 'a';
        System.out.println("intA = " + intA);   //97

        byte unlem = '!';
        System.out.println("unlem = " + unlem); //33


        //Java da char lari matematiksel islemlerde kullanirsaniz, Java o char larin ACII degerlerini kullanir.
        char c1 = 'K';
        char c2 = '?';
        System.out.println(c1+c2);    //138

        

    }
}
