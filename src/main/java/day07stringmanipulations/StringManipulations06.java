package day07stringmanipulations;

public class StringManipulations06 {
    public static void main(String[] args) {

        //ornek bir sitringin hic karakter icermedigini (bos string ) oldugunu kontrol eden kodu yazin

        //1.yol
        String str = "";
        boolean a  = str.length()==0;
        System.out.println(a);

        //2.yol
        boolean b =str.isEmpty();
        System.out.println(b);

        //space haric hicbir karakter icermedigini kontrol eden kodu yazin
        String v = "     ";
        //1.yol
        boolean c = v.replaceAll(" ","").length()==0;
        System.out.println(c);

        //2.yol
        boolean d = v.replaceAll(" ","").isEmpty();
        System.out.println(d);

        //3.yol
        boolean k = v.isBlank();
        System.out.println(k);

        // ornek3 :bir stringde a i e karakterlerinin ilk gorunumlerinin ,ndexleri toplamini yazdirin
        String u = "Ah Java vah Java sensiz olmuyor Java.";
        int l = u.indexOf('a'); //4
        System.out.println(l);
        int s = u.indexOf('e'); //18
        int r = u.indexOf('i'); //21
        System.out.println(r);
        System.out.println(l+s+r);

        //ornek  bir stringdeki java kelimesinin ilk olarak kacinci indexte kullanildigini gosteren kodu yazin

        int m = u.indexOf("Java");
        System.out.println(m);          //3

        //ornek :
        // :u stringde a i e karakterlerinin son gorunumlerinin ,ndexleri toplamini yazdirin
        int h = u.lastIndexOf('a');
        System.out.println(h);

        int y = u.lastIndexOf('e');
        System.out.println(y);

        int f = u.lastIndexOf('i');
        System.out.println(f);
        System.out.println(h+y+f);


    }
}
