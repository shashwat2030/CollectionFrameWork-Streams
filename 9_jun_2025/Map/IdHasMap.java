import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdHasMap {
    public static void exe(){
        String s1=new String("key");
        String s2=new String("key");
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        Map<String,Integer> map=new HashMap<>();
        map.put(s1,1);//key,1
        map.put(s2,2);//key,2
        //equals method
        System.out.println(s1.equals(s2));
        System.out.println(map);
        Map<String,Integer> mp2=new IdentityHashMap<>();
        mp2.put(s1,1);
        mp2.put(s2,2);
        System.out.println(s1.equals(s2));
        System.out.println(mp2);


    }
    public static void main(String[]ShashwatKumarChoudhary){exe();}
}
