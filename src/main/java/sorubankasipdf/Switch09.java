package sorubankasipdf;

public class Switch09 {


    enum Seasons{
        KIS,
        YAZ,
        BAHAR,
        SONBAHAR,

    }
    public static void main(String[] args) {

        /*

        9) Adı 'Seasons' olan bir Enum oluşturun ve Enum da switch-on deyimini kullanarak
//aşağıdakileri yazdırınız.
//Kış için 'Snowboard yapmak'
//Yaz ve bahar için 'Balık tutmak'
//Sonbahar için 'Doğa yürüyüşü yapmak'

         */

        Seasons seasons = Seasons.KIS;
        switch (seasons){
            case KIS:
                System.out.println("snowboard yapmak");
                break;
            case BAHAR:
            case YAZ:
                System.out.println("balik tutmak");
                break;
            case SONBAHAR:
                System.out.println("doga yuruyusu yapmak");
                break;
            default:
                System.out.println("gecersiz mevsim");
        }


    }
}
