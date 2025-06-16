import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Q {

    public static void q(){
        LinkedList<Integer> l=new LinkedList<>();
        //Linked list acts as stack
        l.addFirst(3);
        l.addFirst(5);
        l.addFirst(7);
        l.addFirst(9);
        l.removeFirst();
        System.out.println("Stack_Implementation:"+l);
        //Linked list acts as Queue
        LinkedList<Integer> l2=new LinkedList<>();
        l2.addLast(2);//enqueue
        l2.addLast(4);
        l2.addLast(6);
        l2.addLast(8);
        System.out.println("Queue_Implementation:"+l2);
        Integer i=l2.removeFirst();//dequeue
        System.out.println("Remove First:"+i);
        System.out.println("Queue_Implementation_After_Removal:"+l2);
        l2.getFirst();//peek()
        // Now the same implementation using Queue
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(11);
        q.add(12);
        q.add(13);
        System.out.println("Queue:"+q);
       Integer qi= q.remove();//throws exception when there is no element
        System.out.println("Removed Element:"+qi);
        System.out.println("Queue After removal:"+q);
        System.out.println("Queue Size:"+q.size());
        System.out.println("Poll_Method:"+q.poll());// throws no exception which is better option in all edge cases
        System.out.println(q.element());// throws exception if empty
        System.out.println(q.peek());
        Queue<Integer> q2=new ArrayBlockingQueue<>(5);
        System.out.println(q2.offer(10));
        System.out.println(q2.offer(15));
        System.out.println(q2.offer(17));
        System.out.println(q2.offer(19));
        System.out.println(q2.add(21));
        //q2.add(23); throws exception  Queue full
        System.out.println(q2.offer(23));// return true or false whether element is added or not but does not throw exception.



    }


}
