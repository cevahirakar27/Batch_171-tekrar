package day23datetimevarargs;

public class Varargs01 {


    public static void main(String[] args) {

        int sonuc = toplama(2,3,4,5,6,7,8);
        System.out.println("yoplam = " +sonuc);  //35

    }

    public  static  int toplama(int...a) {
        int sum = 0;
        for (int w : a) {  // burada bir array var gibi dusunucez.
            sum = sum + w;

    }  return sum;


    }


}
