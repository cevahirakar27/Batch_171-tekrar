import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class day30hashmap {
    public static void main(String[] args) {


        HashMap<String,Integer> ulkeler = new HashMap<>();
        ulkeler.put("USA",400000000);
        ulkeler.put("Turkey",83000000);
        ulkeler.put("Hollanda",6000000);
        ulkeler.put("Almanya",83000000);
        ulkeler.put("Fransa",110000000);

        System.out.println(ulkeler); // {Fransa=110000000, USA=400000000, Hollanda=6000000, Turkey=83000000, Almanya=83000000}



        System.out.println(ulkeler.get("USA"));  // 400000000
        System.out.println(ulkeler.size());    // 5

        Collection<Integer> values = ulkeler.values();
        System.out.println(values);      //  [110000000, 400000000, 6000000, 83000000, 83000000]

        Set<String> ulke = ulkeler.keySet();
        System.out.println(ulke);          // [Fransa, USA, Hollanda, Turkey, Almanya]



        Set<Map.Entry<String,Integer>> entrySet =  ulkeler.entrySet();
        System.out.println(entrySet);  // [Fransa=110000000, USA=400000000, Hollanda=6000000, Turkey=83000000, Almanya=83000000]



        // ulkelerin nufuslarin ortalamasi nedir
        Collection<Integer> v1 =  ulkeler.values();
        System.out.println(v1);    // [110000000, 400000000, 6000000, 83000000, 83000000]

        int sum = 0;
        for ( Integer w: v1){
            sum = sum+w;
        }
        System.out.println(sum/v1.size());  // 136400000



// ulkelerin isimlerinin karakter sayilari toplami ile nufus sayilarinin toplamini bulun

        int toplam = 0;
        for ( Map.Entry<String,Integer> w : entrySet){

            toplam = toplam+w.getKey().length()+w.getValue();
        }
        System.out.println(toplam);

    }
}
