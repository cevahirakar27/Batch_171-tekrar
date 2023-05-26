package day05concatinationoperatortypecasting;

public class TypeCasting {
    public static void main(String[] args) {

        //byte data type ni int data ya cevirin

        byte a = 12;
        int b = a;  //byte int ten kucuk oldugu icin kavanozun icine girer


        //int data type ni short e cevirin

        int k = 25;
        short h = (short)k;
        
        //double i shorta cevirin
        
        double c = 24567;
        short d = (short) c;
        
        //lon u floata cevir
        long p = 123;
        float v = p;
        
        //doble i longa cevir
        double s = 3456;
        long l = (long) s;
        System.out.println("l = " + l);


    }
}
