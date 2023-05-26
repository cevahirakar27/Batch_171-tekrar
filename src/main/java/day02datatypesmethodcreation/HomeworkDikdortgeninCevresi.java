package day02datatypesmethodcreation;

public class HomeworkDikdortgeninCevresi {

    // 2) dikdortgenin cevresini hesaplayan methodu olusturun ve kullanin

    public static void main(String[] args) {
       // 1.Yontem:
       int cevre=dikdortgeninCevresi(6,7);
        System.out.println("cevre = " + cevre);

        // 2.Yontem:

        System.out.println("cevre = " + dikdortgeninCevresi(6,7));
        
    }
    
    public static int dikdortgeninCevresi(int x,int y){
        return (x+y)*2;
        
    }
}
