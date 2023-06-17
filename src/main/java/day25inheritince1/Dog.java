package day25inheritince1;

public class Dog extends Animal {


    protected   void havlama(){


        System.out.println("kopekler havlar");
    }


     protected void eat() {

        System.out.println("kopekler yer");
    }


    protected void drink() {
        System.out.println("kopekler icer");
    }
}
