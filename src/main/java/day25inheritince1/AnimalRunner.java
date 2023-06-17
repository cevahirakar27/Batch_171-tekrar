package day25inheritince1;

public class AnimalRunner {
    public static void main(String[] args) {

        Bird b1 = new Bird();
        b1.ucmak();
        b1.eat();
        b1.drink();
        System.out.println("=================");

        Dog d1 = new Dog();
        d1.havlama();
        d1.eat();
        d1.drink();
        System.out.println("====================");

        Cat c1 = new Cat();
        c1.miyavlama();
        c1.eat();
        c1.drink();



    }
}