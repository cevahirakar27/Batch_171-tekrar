package day09forloops;

public class DoWhileLoop01 {
    public static void main(String[] args) {

         //Ornek 1: 5  den 3 e kadar tamsayilari console a yazdiriniz

        int i = 5;
        do {
            System.out.print(i + " ");
            i--;

        }  while (i>2);
        System.out.println();

        // 1 den 10 a kadar sayilari yazdirin.

        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        }while (k<11);


        //while lloop kullanarak cozelim
        System.out.println();
        int j = 1;
        while (j<11){
            System.out.print(j + " ");

            j++;
        }

        //  20 den 2 ye kadar cift sayilari yazdiralim.
        System.out.println();

        int t = 20;
        do {
            if (t % 2 == 0){
                System.out.print(t + " ");

            }
          t--;
        }while (t>1);

    }
}
