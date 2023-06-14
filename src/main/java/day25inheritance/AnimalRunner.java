package day25inheritance;

public class AnimalRunner {
    public static void main(String[] args) {

    Cat c1 = new Cat();
    c1.eat();
    c1.meaw();
    c1.drinks();
        System.out.println("============================");

    Dog d1 = new Dog();
    d1.eat();
    d1.bark();
    d1.drinks();
        System.out.println("===============================");

    Bird b1 = new Bird();
    b1.eat();
    b1.drinks();
    b1.ucar();
        System.out.println("==============================");

}
}