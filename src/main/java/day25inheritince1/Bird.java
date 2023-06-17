package day25inheritince1;

public class Bird extends Animal {

    public  void ucmak(){
        System.out.println("kuslar ucar");
    }

    @Override
    public void eat() {
        System.out.println("kuslar yer");
    }

    @Override
    public void drink() {
        System.out.println("kuslar ucar");
    }
}
