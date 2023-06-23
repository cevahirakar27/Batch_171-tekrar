package sorubankasipdf;

public class StringBuilder1 {

    public static void main(String[] args) {
/*
            String class "immutable" (degistirilemez) string uretir.
            StringBuilder "mutable" (degistirilebilir.) string uretir

             "immutable"  olmak demek orjınal degerin korunmasi degistirilemez olmasi demektir
             "mutable"  olmak demek orjınal degerin degistirilebilir olmasi demektir

         */

        StringBuilder sb = new StringBuilder("java");
        System.out.println(sb);
        System.out.println(sb.length());  // 4
        System.out.println(sb.capacity()); // 20
        sb.trimToSize();
        System.out.println(sb.length());  // 4
        System.out.println(sb.capacity()); // 4

        StringBuilder sb2 = new StringBuilder(7);
        sb2.append("java");
        sb2.append("leran");
        System.out.println(sb2);
        System.out.println(sb2.capacity());  // 16

        StringBuilder sb3 = new StringBuilder(7);
        sb3.append("java");
        System.out.println(sb3);
        System.out.println(sb3.insert(1, "kal"));
        System.out.println(sb3.reverse());
        System.out.println(sb3.delete(2, 5));

        System.out.println(sb2);
        System.out.println(sb3);
        sb3.trimToSize(); //  lenhg ti kapasiteye esitliyor
        System.out.println(sb3.compareTo(sb2));


    }




}
