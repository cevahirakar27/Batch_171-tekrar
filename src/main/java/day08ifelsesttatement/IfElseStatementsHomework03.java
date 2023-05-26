package day08ifelsesttatement;

import java.util.Scanner;

public class IfElseStatementsHomework03 {
    public static void main(String[] args) {

       // 3)Ay sayisini verdiginizde ay ismini yazan kodu yaziniz
        //  1==> January, 2 ==> February .....

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir ay sayisi giriniz");
        byte num = scan.nextByte();

        if (num==1){
            System.out.println("ocak");

        } else if (num==2) {
            System.out.println("subat");

        } else if (num==3 ){
            System.out.println("mart");

        } else if (num==4) {
            System.out.println("nisan");

        } else if (num==5) {
            System.out.println("mayis");

        } else if (num==6) {
            System.out.println("haziran");

        } else if (num==7) {
            System.out.println("temmuz");

        } else if (num==8) {
            System.out.println("agustos");

        } else if (num==9) {
            System.out.println("eylul");

        } else if (num==10) {
            System.out.println("ekim");

        } else if (num==11) {
            System.out.println("kasim");

        } else if (num==12) {
            System.out.println("aralik");

        }else {
            System.out.println("hatali giris yzptiniz");
        }

    }
}