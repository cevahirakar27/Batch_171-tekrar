package day24StringBuilder;

public class Sb01 {
    public static void main(String[] args) {

        String str = "ali";  // immutable

        StringBuilder sb1 = new StringBuilder("ali");  // mutable
        System.out.println(sb1);

        sb1.append("i");
        System.out.println(sb1); // alii

      sb1.append(2);
        System.out.println(sb1);  // alii2


          StringBuilder sb2 = new StringBuilder();

        System.out.println(sb2.length());  // 0
        System.out.println(sb2.capacity());  // 16

        sb2.append("ali");
        sb2.append("xxxxxx");


        StringBuilder sb3 = new StringBuilder(3);
        sb3.append("ali");
        System.out.println(sb3.length());  // 3
        System.out.println(sb3.capacity());  // 3

    }
}
