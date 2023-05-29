package day06stringmanipulation;

public class StringManipulations03 {
    public static void main(String[] args) {

        // ORNEK1 : Bir stringin bas ve sonunda space karakteri varsa siliniz
        // "    Ali Can    "      "Ali Can"
        String s = "    Ali Can    ";
        // trim methodu bir stringin bas ve sonundaki space karakterlerini siler aradaki spacelere dokunmaz
        String sTrimmed = s.trim();
        System.out.println( sTrimmed);


        //ORNEK2 :asagidaki fıyatlari verilen urunlerin toplam fiyatini bulunuz
        // String tv = "$456.99;  String laptop = "$875.99;

        String tv = "$456.99";
        String laptop = "$875.99";

        String tv2 = tv.replace("$","");
       
        String laptop2 = laptop.replace("$","");
        
       double toplamFiyat = Double.valueOf(tv2)+Double.valueOf(laptop2);
        System.out.println("toplamFiyat = " + toplamFiyat);



    }
}
