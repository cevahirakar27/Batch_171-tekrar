package sorubankasi;

import java.util.Scanner;

public class UcakSorusu {
    public static void main(String[] args) {

         /*
   A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
   Bilet tarifesi:
   km birim fiyati : 0.10$
   yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
   12 ve 24 yas arasindaysa 10% indirim,
   65 yasindan buyukse 30% indirim,
   bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gitmek istediginiz yeri belirtiniz:\n 'D','B','C");
        String gidilecekYer = scan.next();
        System.out.println("lutfen tek/ cift donus seceneklerinden birini giriniz.tek yon icin 1 e \n cift yon icin 2 ye basiniz");
        int yon = scan.nextInt();
        System.out.println("lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        double b = 500*0.1;
        double c = 700*0.1;
        double d = 900*0.1;

        if (gidilecekYer.equals("B") || gidilecekYer.equals("C") || gidilecekYer.equals("D")){

            if (gidilecekYer.equalsIgnoreCase("B")) {


                if (yas > 0 && yas < 12) {
                    if (yon == 1) {

                        System.out.println(b * 0.5 + "$");
                    } else if (yon == 2) {
                        System.out.println(b * 0.5 * 2 * 0.8 + "$");
                    } else {
                        System.out.println("yonunuzu yanlis girdiniz");
                    }
                } else if (yas >= 12 && yas < 24) {
                    if (yon == 1) {
                        System.out.println(b * 0.9 + "$");
                    } else if (yon == 2) {
                        System.out.println(b * 0.9 * 2 * 0.8 + "$");
                    } else {
                        System.out.println("yonunuzu belli ediniz");
                    }
                } else if (yas >= 65) {
                    if (yon == 1) {
                        System.out.println(b * 0.7 + "$");
                    } else if (yon == 2) {
                        System.out.println(b * 0.7 * 2 * 0.8 + "$");
                    } else {
                        System.out.println(" yonunuz belli degil");
                    }
                } else if (yas >= 24 && yas < 65) {
                    if (yon == 1) {
                        System.out.println(b + "$");
                    } else if (yon == 2) {
                        System.out.println(b * 2 * 0.8 + "$");
                    }
                }


                if (gidilecekYer.equalsIgnoreCase("C")){
                    if (yas>0 && yas<12){
                        if (yon==1){
                            System.out.println(c*0.5+"$");
                        } else if (yon==2) {
                            System.out.println(c*0.5*2*0.8+"$");
                        }
                    } else if (yas>=12 && yas<24) {
                        if (yon==1){
                            System.out.println(c*0.9+"$");
                        } else if (yon==2) {
                            System.out.println(c*0.9*2*0.8+"$");
                        }else {
                            System.out.println("yonunuzu belli edin");
                        }
                    } else if (yas>=24 && yas<65) {
                        if (yon==1){
                            System.out.println(c+"$");
                        } else if (yon==2) {
                            System.out.println(c*2*0.8+"$");
                        }else {
                            System.out.println("yonunuz yanlis");
                        }
                    } else if (yas>=65) {
                        if (yon==1){
                            System.out.println(c*0.7+"$");
                        } else if (yon==2) {
                            System.out.println(c*0.7*2*0.8+"$");
                        }else {
                            System.out.println("yonunuz yanlis");
                        }
                    }
                }
            }if (gidilecekYer.equalsIgnoreCase("D")){
                if (yas>0 && yas<12){
                    if (yon==1){
                        System.out.println(d*0.5+"$");
                    } else if (yon==2) {
                        System.out.println(d*0.5*2*0.8+"$");
                    }else {
                        System.out.println("yonunuz yanlis");
                    }
                } else if (yas>=12 && yas<24) {
                    if (yon==1){
                        System.out.println(d*0.9+"$");
                    } else if (yon==2) {
                        System.out.println(d*0.9*2*0.8+"$");
                    }else {
                        System.out.println("yonunuz yanlis");
                    }
                } else if (yas>=24 && yas<65) {
                    if (yon==1){
                        System.out.println(d+"$");
                    } else if (yon==2) {
                        System.out.println(d*2*0.8+"$");
                    }else {
                        System.out.println("yonunuz yanlis");
                    }
                } else if (yas>=65) {
                    if (yon==1){
                        System.out.println(d*0.7+"$");
                    } else if (yon==2) {
                        System.out.println(d*0.7*2*0.8+"$");
                    }else {
                        System.out.println("yonunuz yanlis");
                    }
                }


            }
            }
            }
}


