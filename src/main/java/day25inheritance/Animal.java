package day25inheritance;

public class Animal {

    // Inheritance==> miras alma

    /*
    Ozellikleri bir calss tan diger class lara alan bir kavramdir.
    mesela bir class olustrmak istiyorsunuz ama daha once olusturulmus bir class sizin istediginiz ozelliklerin cogunu kapsiyor.ozaman
    yeni olusturdugunuz class i ozelliklerini kullanmak istediginz class child yaparsiniz.

    Inheritance ' in faydalari
    1) kod tekrarlarindan kurtuluruz.
    2) code tamiri (maintenance) kolay olur.
    3) child classlari daha atomik yapmis oluruz.

    ==> Bir class i baska bir class in child  class i yapmak icin extends keyword u kullanilir..ilk yazilan child,
    ikinci yazilan class parent olur.parent classa super class da denir.

    ==> child class objectleri parent class tan method ve variableri kullanabilirler.
    ==> parent class objeleri child class tan method ve variableri kullanamzlar.
       => javada bir classin sadece 1 tane parenti olabilir, coklu parent'a "Multiple Inheritance" derler,
     tekli parent'a "single inheritance" derler. Java "Multiple Inheritance" i desteklemez, Java single inheritance kullanir

     => Apartman seklindeki inheritance yapisina "MultiLevel Inheritance" denir, java multilevel inheritanece i destekler

     => Object class her classin parentidir. java da object class haric her classin parenti vardir.
        Java da parent i olmayan tek class object classdir

        ==> javada parenttan child a olan ilskilere "HAS-A Relation Ship" denir
        ==> javada child dan parent  a olan ilskilere "IS-A Relation Ship" denir

        ==> javada her class in 1 tane default constructori vardir.default constructor classin icinde gozukmez.
         cunku object classin icindedir.

     */


    public void eat(){
        System.out.println("hayvanlar yerler");
    }

    public void drinks(){
        System.out.println("hayvanlar icerler");
    }








}
