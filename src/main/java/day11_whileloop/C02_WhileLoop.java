package day11_whileloop;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class C02_WhileLoop {

    /*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int sayac = 0;
        do {

            System.out.println("lutfen kullanici adinizi giriniz");
            String userName = scan.next();

            System.out.println("lutfen passwordunuzu giriniz");
            String pwd = scan.next();

            if (userName.equals("admin") && pwd.equals("pwd123")){
                System.out.println("hesabiniza hosgeldiniz");
                break;
            }
            sayac++;
            if (sayac==4){
                System.out.println("hesabiniz bloke olmustur");
                break;
            }
        }while (sayac<=4);

    }
    }

