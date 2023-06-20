package day29collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {

// ornegi TreeSete gore siralayalim
        TreeSet<String> emails = new TreeSet<>();
        emails.add("z@gmail.com");
        emails.add("b@gmail.com");
        emails.add("k@gmail.com");
        emails.add("v@gmail.com");
        emails.add("h@gmail.com");
        emails.add("e@gmail.com");
        emails.add("a@gmail.com");
        emails.add("m@gmail.com");
        System.out.println(emails);
// [a@gmail.com, b@gmail.com, e@gmail.com, h@gmail.com, k@gmail.com, m@gmail.com, v@gmail.com, z@gmail.com]

        // bu ornegi HashSete gore yapalim

        HashSet<String>hs = new HashSet<>();
        hs.add("z@gmail.com");
        hs.add("b@gmail.com");
        hs.add("k@gmail.com");
        hs.add("v@gmail.com");
        hs.add("h@gmail.com");
        hs.add("e@gmail.com");
        hs.add("a@gmail.com");
        hs.add("m@gmail.com");
        System.out.println(hs);

        TreeSet<String>sonHal = new TreeSet<>(hs);
        System.out.println(sonHal);

        // [a@gmail.com, b@gmail.com, e@gmail.com, h@gmail.com, k@gmail.com, m@gmail.com, v@gmail.com, z@gmail.com]
    }
}
