package day11_whileloop;

public class C05_WhileLoop {
    public static void main(String[] args) {

         //  2den 6 e kadar sayilari top yazdirin
        int toplam=0;

        for (int i = 2; i <7; i++) {
            toplam = toplam+i;

        }
        System.out.println("toplam = " +toplam);

        int top = 0;
        int k =2;
        while (k<7){
            top = top+k;
            k++;

        } System.out.println("toplam = " +top);

        // do while cozumu

        int toplam2 =0;
        int a = 2;
        do {
          toplam2 = toplam2+a;

            a++;

        }while (a<7);
        System.out.println("toplam = " +toplam2);
    }
}
