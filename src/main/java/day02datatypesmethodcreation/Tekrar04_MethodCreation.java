package day02datatypesmethodcreation;

public class Tekrar04_MethodCreation {

    //cemberin cevresini hesaplayan methodu olusturun ve kullanin
    // dairenin alanini hesaplayan methodu olusturun ve kullanin.
    public static void main(String[] args) {
        double cemberinCevresi=cevre(5,3.14,2);
        System.out.println("cemberin Cevresi = " + cemberinCevresi);



        //daierenin alani

        double daireninAlani=alan(5,(3.14),5);
        System.out.println("daireninAlani = " + daireninAlani);


        //ucgenin cevresi
        int a= 3;
        int b= 4;
        int c= 5;
        ucgeninCevresi(a,b,c);

    }

    private static void ucgeninCevresi(int a, int b, int c) {
        System.out.println("ucgenin cevresi = " + (a+b+c));
    }

    public  static double cevre(double yaricap,double pi,double sabitSayi){
        return 2*(3.14)*yaricap;
    }

    public static double alan(double yaricap,double pi,double yaricap2){
        return pi*yaricap*yaricap;
    }

    //ucgenin cevresini bulup konsola yazdirin
}
