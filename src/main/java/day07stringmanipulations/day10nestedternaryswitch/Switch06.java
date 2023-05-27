package day07stringmanipulations.day10nestedternaryswitch;

import java.util.Scanner;

public class Switch06 {
    public static void main(String[] args) {

        //- Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
        //ve girilen harfin karsiligini yazdirin.
        //I : International S : Software T : Testing Q : Qualifications B: Board

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ISTOP stringindeki harfleri giriniz");
        char ch = scan.next().charAt(0);

        switch (ch){
            case 'I':
                System.out.println("International");
                break;
            case 'S':
                System.out.println("Software");
                break;
            case 'T':
                System.out.println("Testing");
                break;
            case 'Q':
                System.out.println("Qualifications");
                break;
            case 'B':
                System.out.println("Board");
                break;
            default:
                System.out.println("hatali giris");
        }
    }
}
