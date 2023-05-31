package day18multidimensionalarray;

public class Md02 {
    public static void main(String[] args) {

        String student[][] = {{"ali","kemal"},{"cemal"},{"ayhan","beyhan","seyhan"},{"ceyhan","kayahan"}};

        //yukaridaki student arryine icinde 'm' harfi olan isimleri konsola yazdirin
        // nested loop kullaniriz.

        for ( String [] w : student){

            for ( String k : w){

                if (k.contains("m")){
                    System.out.println(k);   // kemal,cemal
                }

            }
        }



    }
}
