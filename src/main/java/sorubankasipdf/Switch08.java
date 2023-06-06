package sorubankasipdf;

public class Switch08 {

   public enum Browser {
        CHROME,
        SAFARI,
        IE,
        FIREFOX,
        YANDEX,


    }
    public static void main(String[] args) {

        /*
        Bir Enum oluşturun ve içine CHROME, SAFARI, IE, FIREFOX, YANDEX gibi tarayıcı adlarını
koyunuz. Switch ifadesini kullanın ve CHROME için 'CHROME kullanıyorum', SAFARI için
'SAFARI kullanıyorum', 'IE için IE kullanıyorum', 'FIREFOX için FIREFOX kullanıyorum' ve
YANDEX için 'YANDEX kullanıyorum', CHROME, SAFARI, IE, FIREFOX, YANDEX'ten farklı
tarayıcılar için 'Geçersiz tarayıcı' yazınız.
         */
         Browser browser = Browser.SAFARI;
        switch (browser){
            case CHROME:
                System.out.println("CHROME kullaniyorum");
            break;
            case SAFARI:
                System.out.println("SAFARİ kullaniyorum");
                break;
            case IE:
                System.out.println("IE KULLANİYORUM");
                break;
            case  FIREFOX:
                System.out.println("FİREFOX KULLANİYORUM");
                break;
            case YANDEX:
                System.out.println("YANDEX KULLANİYORUM");
                break;
            default:
                System.out.println("gecersiz tarayici");
        }
    }
}
