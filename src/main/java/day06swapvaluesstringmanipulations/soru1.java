package day06swapvaluesstringmanipulations;

public class soru1 {
    public static void main(String[] args) {
        
        /*
        Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
input1 : “15.30 €” , input2 : “11.40 €”
output : 36.70 €
       
         */
        String s1 = "15.30 €";
        String s2 = "11.40 €";
        String s3 = s1.replace("€","");
        String s4 = s2.replace("€","");
         Double s5 = Double.valueOf(s3);
         double s6 = Double.valueOf(s4);
         double toplam = s5+s6;
        System.out.println("toplam = " + toplam);
    }
}
