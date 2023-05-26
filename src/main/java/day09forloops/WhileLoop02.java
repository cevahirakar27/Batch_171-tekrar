package day09forloops;

public class WhileLoop02 {
    public static void main(String[] args) {

        // 3 ten 6 ya kadar tam sayilari konsola yazdirin

        for (int i =3 ; i <7 ; i++) {
            System.out.print(i+ " ");

        }

        //while loop cızumu

        System.out.println();
        int k = 3;
        while(k<7){
            System.out.print(k+ " ");

            k++;
        }

        //23 den 6 ya kadar tek sayilari yazdirin.
        System.out.println();
        int j = 23;
        while (j>5){
            if (j % 2 != 0){

                System.out.print(j + " ");
            }

            j--;
        }
        System.out.println();
        ////ornek 6 dan 19 a kadar cift sayilari yazdirin

        int a = 6;
        while (a<20){
            if (a % 2 ==0){

                System.out.print(a+ " ");
            }

            a++;
        }

    }
}
