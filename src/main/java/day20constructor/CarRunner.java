package day20constructor;

public class CarRunner {
    public static void main(String[] args) {

        Car c1 = new Car("honda","cıvıc",2023,true);
        System.out.println(c1);

        Car c2 = new Car(2020,false);
        System.out.println(c2);

    }
}
