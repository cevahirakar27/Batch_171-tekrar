package day06swapvaluesstringmanipulations;

public class SwapValues {

    public static void main(String[] args) {
        // 2 degisken alip
        // 1) yeni bir variable olusturarak degistirin
        //2) baska bir degisken kullanmadan yerlerini degistirin

        int a = 12;
        int b = 20;
        int bos;

        bos=a;
        a=b;
        b=bos;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //2.soru
        int elma = 12;
        int armut = 20;
        elma = armut -elma;
        armut = armut-elma;
        elma = elma+armut;
        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);
    }
}
