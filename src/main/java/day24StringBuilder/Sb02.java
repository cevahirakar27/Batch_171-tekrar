package day24StringBuilder;

public class Sb02 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);  // Java is easy

        sb1.reverse();
        System.out.println(sb1);  // ysae si avaJ

        sb1.insert(1,4);  // 1.indexe 4 u koy
        System.out.println(sb1);

        sb1.replace(1,4,"xxxx");
        System.out.println(sb1);

        sb1.delete(2,5);
        System.out.println(sb1);  // 2. indexi sil

        sb1.deleteCharAt(2);
        System.out.println(sb1);

      StringBuilder sb2 = new StringBuilder("java");
      StringBuilder sb3 = new StringBuilder("kava");

    int k =  sb2.compareTo(sb3);
        System.out.println(k);  // -1
        int l = sb3.compareTo(sb2);
        System.out.println(l);   // 1

       String p =  sb2.toString().toUpperCase();
        System.out.println(p);  // JAVA    // stringe cevirdik

        StringBuilder sb4 = new StringBuilder(p);

        System.out.println(sb4);  // stringi stringBuildere ceviirdik






    }
}
