package day20constructor;

public class Car {

    String make = "honda";

    String model= "Acoord";

    int year = 2023;

    boolean hybrid = true;


    public Car(String make, String model, int year, boolean hybrid) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }

    public Car(int year, boolean hybrid) {
        this.year = year;
        this.hybrid = hybrid;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
