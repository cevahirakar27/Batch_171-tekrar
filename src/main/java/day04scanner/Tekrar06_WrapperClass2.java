package day04scanner;

public class Tekrar06_WrapperClass2 {
    public static void main(String[] args) {

        //primitive int i wrapper Integere ceviriniz

        int a = 13;
        Integer b = a;
        System.out.println("b = " + b);  //Autoboxıng

        //ornek: wrapper Byte i primitive byte a ceviriniz (Unboxing)

        Byte wrapper = 16;
        byte primitive = wrapper;


        //ornek : primitive char i wrapper Charactere cevirin
        char karakter1 = 'a';
        Character karakter2 = karakter1;
        System.out.println("karakter2 = " + karakter2);

        //ornek  Wrapper Blooleani primitive boolean a cevirin
        Boolean yasliMi = true;
        boolean pirimitiveH = yasliMi;
        System.out.println("pirimitiveH = " + pirimitiveH);



    }
}
