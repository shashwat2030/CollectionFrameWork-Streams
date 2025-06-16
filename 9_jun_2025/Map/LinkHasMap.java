import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkHasMap {
    public static void exe(){
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>(11,0.5f,true);//double linked list
        HashMap<String,Integer> m = new LinkedHashMap<>();
        m.put("Apple",1);
        m.put("Microsoft",2);
        m.put("Google",3);
        System.out.println("Hashmap:");
        for(Map.Entry<String,Integer>entry:m.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());

        }
        lhm.put("Google",3);
        lhm.put("Microsoft",2);
        lhm.put("Apple",1);

        System.out.println("LinkedHashMap:");
        lhm.get("Google");
        lhm.get("Apple");// LRU algorithm least recently used.
        for(Map.Entry<String,Integer>entry:lhm.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());

        }
        //cache memory uses
        HashMap<String,Integer>m2=new HashMap<>();
        LinkedHashMap lhm2=new LinkedHashMap(m2);
        m2.put("Shashwat",100);
        m2.put("Rahul",90);
        m2.put("Dev",95);
        Integer r=m2.getOrDefault("Dev",0);
        System.out.println(r);
        Integer r2=m2.getOrDefault("Vipul",0);
        System.out.println(r2);
        m2.putIfAbsent("Dev",0);//handling edge cases if not present
        System.out.println(m2);



    }
    public static void main(String[] ShashwatKumarChoudhary){
exe();
    }
}
