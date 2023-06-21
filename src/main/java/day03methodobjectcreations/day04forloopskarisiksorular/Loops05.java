package day03methodobjectcreations.day04forloopskarisiksorular;

public class Loops05 {

    public static void main(String[] args) {

        //Ornek 1: 5 den 8 e kadar tamsayilarin toplamini veren kodu yaziniz
        //   5+6+7+8 ==> 26

        int top = 0;

        for (int i=5 ; i<9 ; i++){
            top = top+i;

        }
        System.out.println("toplam =" +top);


        //Ornek 2 : 7 den 9 a kadar tamsayilarin carpimini veren kodu yaziniz
        // 7*8*9 => 504

        int carpim = 1;

        for (int i =7 ; i<10 ; i++){
            carpim = carpim*i;

        }
        System.out.println("carpim = " +carpim);

        //Ornek 3: Verilen bir tamsayinin rakamlarinin toplamini bulan kodu yaziniz.
        //578  ==> 5+7+8 = 20

        int sayi = -546;
        int toplam = 0;

    }
}
