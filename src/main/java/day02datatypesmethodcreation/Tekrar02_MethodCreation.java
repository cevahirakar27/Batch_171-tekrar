package day02datatypesmethodcreation;

public class Tekrar02_MethodCreation {

    //ornek1: verilen bir ondalik sayinin kupunu hesaplayan bir method olusturup kullaniniz

    public static void main(String[] args) {

        double kup=sayininKupu(4);
     //1.yontem
        System.out.println("kup = " + kup);

     //2.yontem
        System.out.println("kup = " +sayininKupu(4));

    }
 
    static double sayininKupu(double a){
        return a*a*a;
    }
}
