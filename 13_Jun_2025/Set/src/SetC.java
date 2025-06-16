import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetC {
        public static void setFunc(){
            Set<Integer> set=new HashSet<>();
            //Map<Integer,String> map= new HashSet<>();
            //Set<Integer> ks= map.keySet();
          // hash map keys are actually set because they are unique which is exactly the same definition of set
            set.add(15);
            set.add(1);
            set.add(1);
            set.add(67);
            // to make it ordered have it linkedHash set it means to have insertion theme
            System.out.println("HashSet:"+set);
            Set<Integer> set1=new LinkedHashSet<>();
            set1.add(15);
            set1.add(1);
            set1.add(1);
            set1.add(67);
            System.out.println("LinkedHashSet:"+set1);
            //Now if you want in sorted in manner use TreeSet
            Set<Integer> set2=new TreeSet<>();
            set2.add(15);
            set2.add(1);
            set2.add(1);
            set2.add(67);
            System.out.println("TreeSet:"+set2);
            NavigableSet<Integer> set3=new TreeSet<>();
            set3.add(23);
            set3.add(19);
            set3.add(25);
            set3.add(25);
            System.out.println(set3);
            System.out.println(set3.contains(23));
            System.out.println(set3.remove(25));
            set3.clear();
            System.out.println(set3);
            System.out.println(set3.isEmpty());
            for(int i:set3){
                 System.out.println(i);
            }
            // thread safety

Set<Integer> set5=Collections.synchronizedSet(set);
            // set5 is synchronized and is thread safe
            // or it is complex we can use
            // Eg os using ConcurrentSkipListSet for thread safety
            ConcurrentSkipListSet <Integer> set6=new ConcurrentSkipListSet<>();
            NavigableSet<Integer> set7=new ConcurrentSkipListSet<>();
            Set<Integer> set8=new ConcurrentSkipListSet<>();

// Unmodifiable set
            // use in java 9
           // Set<Integer> set9 = new Set.of(1,2,3,4,5,6,7,8,9);
            //causing error java: cannot find symbol
            // we can have more than 10 enteries
            Collections.unmodifiableSet(set5);
            SortedSet<Integer> set10=new TreeSet<>();
        }
}
