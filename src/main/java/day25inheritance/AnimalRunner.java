package day25inheritance;

public class AnimalRunner {

    public static void main(String[] args) {


        Cat c1 = new Cat();                             //animals eat
        c1.eat();                                       // animals drink
        c1.drink();
        c1.meow();                                     // cats meow...
        System.out.println("===============");

        Dog d1 = new Dog();                             // animals eat
        d1.eat();                                      // animals eat
        d1.eat();
        d1.bark();                                       //kopekler havlar...
        System.out.println("================");

        Bird b1 = new Bird();
        b1.eat();
        b1.drink();
        b1.tweet();


    }
}