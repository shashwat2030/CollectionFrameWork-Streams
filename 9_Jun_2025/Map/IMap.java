import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class IMap {
    public static void exe(){
        Map<String,Integer> map=new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
      Map<String,Integer> mp2= Collections.unmodifiableMap(map);
      System.out.println(mp2);
    //  mp2.put("E",5);java.lang.UnsupportedOperationException
        Map<String,Integer> mp3=Map.of("Shashwat",99,"Rahul",98);
        // Map.of introduced in Java 9 constraint of only 10 key values
       // mp3.put("Akshit",88);
        // .UnsupportedOperationException
        Map<String,Integer> mp4=Map.ofEntries(Map.entry("Shashwat",99),Map.entry("Rahul",98));
        // in map.entries.we can have multiple entries of java 9





    }
    public static void main(String[]ShashwatKumarChoudhary){exe();}
}
