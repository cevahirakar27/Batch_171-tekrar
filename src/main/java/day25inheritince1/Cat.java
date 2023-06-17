package day25inheritince1;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("kediler yer");
    }

    public void miyavlama (){

        System.out.println("kediler miyavlar");
    }

    @Override
    public void drink() {
        System.out.println("kediler icer");
    }
}
