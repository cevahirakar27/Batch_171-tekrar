package day29collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {


        LinkedList<String>list = new LinkedList<>();
        list.add("ali");
        list.add("veli");
        list.add("ayse");
        list.add("can");
        list.add("burak");
        list.add("hayat");
        list.add("enes");
        System.out.println(list);  // [ali, veli, ayse, can, burak, hayat, enes]

        System.out.println(list.remove(2)); // ayse
        System.out.println(list);  // [ali, veli, can, burak, hayat, enes]
        System.out.println(list.pop());  // [ali]
        System.out.println(list);  //[veli, can, burak, hayat, enes] // list bos ise hata verir

        System.out.println(list.poll());  // veli
        System.out.println(list);  // [can, burak, hayat, enes]  // list bos ise null verir

        System.out.println(list.peek()); // can
        System.out.println(list);    // [can, burak, hayat, enes]  // list bos ise null verir.

        System.out.println(list.element()); // can
        System.out.println(list);       // [can, burak, hayat, enes]  // list bos ise hata verir

       list.addFirst("berrin");
        System.out.println(list);   // [berrin, can, burak, hayat, enes]
        list.addLast("can");
        System.out.println(list);  // [berrin, can, burak, hayat, enes, can]

        
    }
}
