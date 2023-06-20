package day29collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {
    public static void main(String[] args) {

        Queue<String>line = new PriorityQueue<>();
        line.add("Milk");
        line.add("Bread");
        line.add("Apple");
        line.add("Orange");
        line.add("Milk");
        line.add("Egg");
        line.add("Meat");
        line.add("Tomatoes");
        System.out.println(line); //[Apple, Milk, Bread, Orange, Milk, Egg, Meat, Tomatoes] siraya gore dizmez

        /*
        Queue bir interface dir bu yuzden cnstructuri yoktur. new keywordunden sonra
        1) LinkedList
        2) PriorityQueue
            ikisinden biri eklenir.
         */

    }
}
