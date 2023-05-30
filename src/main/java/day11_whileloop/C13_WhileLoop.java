package day11_whileloop;

public class C13_WhileLoop {
    public static void main(String[] args) {
        // 90 dan 190 a kadar 7 ile bolunen sayialrin toplamini yazdirin

        int toplam = 0;
        int i = 90;
        while (i<191){
            if (i%7==0){
                toplam = toplam+i;

            }
            i++;
        }System.out.println(toplam);

        // 'm' harfinden baslayarak 'c' harfine kadar yazdirin

        for (int j = 'm'; j >='c' ; j--) {
            System.out.print(" " +(char)j);
        }
        System.out.println();
        // while cozumu

        char k ='m';
        while (k>='c'){
            System.out.print(" "+(char)k);
            k--;
        }
    }
}
