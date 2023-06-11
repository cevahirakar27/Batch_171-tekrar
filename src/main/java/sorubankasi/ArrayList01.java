package sorubankasi;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {

        /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */



        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println(nums);   //  [2, 3, 4, 5]





        kareTopla(nums);

    }
    public  static  void kareTopla(ArrayList nums){
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
          sum = sum+  (int) (Math.pow((int)nums.get(i),2));

        }
        System.out.println(sum);
    }




}
