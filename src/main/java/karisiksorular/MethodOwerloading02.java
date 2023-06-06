package karisiksorular;

public class MethodOwerloading02 {
    public static void main(String[] args) {

        String name = "Tom Hanks"; // bir method yazalim unvan ekleyelim

        System.out.println(unvanEkle("dr ", name));  // dr Tom Hanks

    }

    private static String unvanEkle(String unvan,String name) {
        name = unvan+name;
        return name;
    }


}
