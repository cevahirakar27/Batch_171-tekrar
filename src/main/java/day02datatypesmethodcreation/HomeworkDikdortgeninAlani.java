package day02datatypesmethodcreation;

public class HomeworkDikdortgeninAlani {

    // homework

    // 1) dikdortgenin alanini hesaplayan methodu olusturun ve kullanin


    public static void main(String[] args) {
        // 1.yontem:
        int alan= dikdortgeninAlani(7,8);
        System.out.println("alan = " + alan);

        //2.yontem:
        System.out.println("alan = " + dikdortgeninAlani(7,8));
        
        
    }
    
    public static int dikdortgeninAlani(int x, int y){
        return x*y;
    }
}

