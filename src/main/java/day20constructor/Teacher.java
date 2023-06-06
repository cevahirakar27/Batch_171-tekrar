package day20constructor;

public class Teacher {


    String name ;
    int age;
    String adress;


    public Teacher(String name, int age, String adress) {
        this.name=name;
        this.age=age;
        this.adress= adress;



    }


    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                '}';
    }
}
