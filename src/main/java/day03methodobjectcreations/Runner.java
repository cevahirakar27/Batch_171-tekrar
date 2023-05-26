package day03methodobjectcreations;

public class Runner {
    public static void main(String[] args) {

      //class ismi  +  object ismi = new + constructor

        okul  teacher = new okul();

        System.out.println("teacher.isim = " + teacher.isim);
        System.out.println("teacher.yas = " + teacher.yas);
        teacher.teach();


    }

}
