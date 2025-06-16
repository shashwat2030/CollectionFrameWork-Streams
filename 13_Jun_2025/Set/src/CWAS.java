import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CWAS {
    public static void cwAs(){
        // thread safe
        // copy on write mechanism.
        // No Duplicate Elements
        // Iterators Do not reflect modifications
CopyOnWriteArraySet<Integer> cowas=new CopyOnWriteArraySet<>();
ConcurrentSkipListSet<Integer> csls=new ConcurrentSkipListSet<>();
for(int i=1;i<5;i++){
    cowas.add(i);
    csls.add(i);
}
System.out.println("CopyOnWriteArraySet:"+cowas);
System.out.println("ConcurrentSkipListSet:"+csls);
System.out.println("CopyOnWriteArraySet:Iterate&Modifications");
for(Integer n:cowas){
    System.out.println("Reading:"+n);
    //Attempt to modify
    cowas.add(95);

}
System.out.println("CopyOnWriteArraySet:"+cowas);
System.out.println("ConcurrentSkipListSet:Iterate&Modifications");
for(Integer n:csls){
    System.out.println("Reading:"+n);
    if(n==4){
        csls.add(17);
    }

}/*Reading:1
Reading:2
Reading:3
Reading:4
Reading:17
is the reason we say concurrentSkipListSet is weakly consistent
*/

    }
}
