package day29collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        Queue<String>ls = new LinkedList<>();
        ls.add("egg");
        ls.add("banana");
        ls.add("cheese");
        ls.add("tomatoes");
        ls.add("milk");
        ls.add("meat");
        ls.add("egg");
        ls.add("apple");
        ls.add("bread");
        System.out.println(ls);

        System.out.println(ls.peek());  // egg;
        System.out.println(ls);  // [egg, banana, cheese, tomatoes, milk, meat, egg, apple, bread]

        System.out.println(ls.poll()); // egg
        System.out.println(ls);  // il elemani siler

        
    }
}
