import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {
    private int len;
    public LRUCache(int n){
        super(n,0.75f,true);
        this.len=n;
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest){
        return size()>len;
    }
     public static void exe(){
        LRUCache<String,Integer>cm=new LRUCache<>(3);
        cm.put("Apple",1);
        cm.put("Microsoft",2);
        cm.put("Google",3);
        cm.put("Samsung",4);
        cm.get("Google");
        cm.put("Atlassian",5);
        System.out.println(cm);




     }
    public static void main(String[]ShashwatKumarChoudhary){exe();}
}
