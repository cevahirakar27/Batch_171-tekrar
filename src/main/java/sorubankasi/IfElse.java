package sorubankasi;

import java.util.Arrays;

public class IfElse {
    public static void main(String[] args) {



        //kullanicidan bir cumle bir metin alin cumlede metnin durumuna gore
        //1-cumle metni icermiyor
        //2-cumle metni sadece 1 kere iceriyor
        //3-cumle metni ...(sayac) iceryor seceneklerinden uygun olani yazdirin

        String cumle = "Java cok  guzeldir cok cok";
        String metin = "cok";
        int sayac = 0;

        if (cumle.indexOf(metin)== -1){
            System.out.println("cumle metni icermiyor");
        } else if (cumle.indexOf(metin)== cumle.lastIndexOf(metin)) {
            System.out.println("cumle metni 1 kere iceiryor");
        }else {
           String str [] =  cumle.split(" ");
            System.out.println(Arrays.toString(str));   // [Java, cok, , guzeldir, cok, cok]

            for (String w : str){
                if (w.equals(metin)){
                   sayac++;
                }
            }
            System.out.println("cumle metni "  + sayac+ " " + "defa iceiryor" );
        }


    }
}
