import java.util.Comparator;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SMap {
    public static void exe() {
        SortedMap<String, Integer> smp = new TreeMap<>((a, b) -> a.compareTo(b));
        smp.put("Asad", 91);
        smp.put("Sabi", 95);
        smp.put("Rq", 96);
        smp.put("Hz", 93);
        System.out.println(smp);
        SortedMap<Integer, String> smp2 = new TreeMap<>((a, b) -> b - a);
        smp2.put(91, "Vivek");
        smp2.put(99, "Shubham");
        smp2.put(78, "Mohit");
        smp2.put(77, "Vipul");
        System.out.println(smp2);
        System.out.println(smp.firstEntry());
        System.out.println(smp.lastEntry());
        System.out.println(smp2.firstEntry());
        System.out.println(smp2.lastEntry());
        System.out.println("Vipul Tyagi Finding:");
        System.out.println(smp2.firstKey());
        System.out.println(smp2.lastKey());
        System.out.println(smp2.headMap(91));// 77 ->91 exclude 91
        System.out.println(smp2.tailMap(91));//91-99 include 91
        smp2.get(77);
        smp2.containsKey(78);
        smp2.containsValue(77);
        NavigableMap<Integer, String> nm = new TreeMap<>();
        nm.put(1, "Apple");
        nm.put(2, "Microsoft");
        nm.put(3, "Google");
        System.out.println(nm);
        System.out.println(nm.lowerEntry(4));//greatest entry less than key
        System.out.println(nm.ceilingEntry(2));
        System.out.println(nm.higherEntry(1));
        System.out.println(nm.descendingMap());
    }


    public static void main(String[] ShashwatKumarChoudhary){exe();}
}
