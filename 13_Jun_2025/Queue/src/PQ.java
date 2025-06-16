import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ {
    public static void pq(){
        PriorityQueue<Integer> pq =new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(25);
        pq.add(49);
        pq.add(43);
        pq.add(34);
        pq.add(39);
        System.out.println(pq);// NotSorted
       // System.out.println(pq.peek());// it just returns the top of the Queue
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

    }
}
