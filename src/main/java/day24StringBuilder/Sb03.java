package day24StringBuilder;

public class Sb03 {
    public static void main(String[] args) {

             /*
       1) StringBuffer java da string ureten bir diger class dir
        javanin urettigi ilk classtir

        2) StyringBuilder e cok benzer.yani ikisi de mutable string uretir.
        3) StrinBuffer  "multi-thread" dir.ama String builder "multi-thread" degildir.

        4) StringBuilder "multi-thread" olmadigi icin StringBufferdan daha hizli calisir.

        3 tane string olusturan class ogrendik.

          1) Immutable string lazimsa ; String Class
          2) Mutable stgring lazimsa ;  StringBuilder  veya   StyringBuffere kullanilir.
                     a) StringBufferi "multi-thread" gerekirse kullaniriz
                     b)  StyringBuilder i multi thread gerekmez ise kullaniriz

             ayni anda birden fazla is yapmak multi-thread dir.

          5) "multi-theread yapilirken yapilan islerin sirasi onem arz eder.
          yapilan isleri msntkli siraya koymak "synchrinization"  olarak adlandirilir
          StringBUFER MULTİ-Therad oldugundan ayni zamanda synchronizeddir


         */
        StringBuffer  sbf =   new StringBuffer("java");
        System.out.println(sbf);// java



    }
}
