import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DQ {
    public static void dq(){
        Deque<Integer> dq=new ArrayDeque<>();//faster iteration,low memory,no null allowed ,recommended
        // array implemented is circular.head, and tail
        Deque<Integer> dq1=new LinkedList<>();// special requirement like insertion in mid is faster
        // use when insertion ,deletion somewhere in the middle
        dq.addFirst(85);//head--
        // no need to shift elements ,just shift head and tail

        dq.addFirst(90);
        dq.addFirst(43);
        dq.addFirst(45);
        dq.addFirst(540);
        dq.offerFirst(530);
        dq.offerLast(35);
        System.out.println("Deque_Complete:"+dq);
        System.out.println("First_Element:"+dq.getFirst());//  output 530
        System.out.println("Last_Element:"+dq.getLast());//output 35
        System.out.println("Remove_First_Element:"+dq.removeFirst());//530
        System.out.println("Remove_Last_Element:"+dq.pollLast());//35
        // Difference between poll vs remove i.e. poll will not throw exception if null while remove will throw the exception
        for(int n:dq){
            System.out.println("Deque_Element:"+n);

        }
        System.out.println("Second_Deque:");
        dq1.addFirst(5);
        dq1.addFirst(9);
        dq1.addFirst(3);
        dq1.addFirst(4);
        dq1.addFirst(54);
        dq1.offerFirst(50);
        dq1.offerLast(2);
        System.out.println("Deque_Complete:"+dq1);
        System.out.println("First_Element:"+dq1.getFirst());//  output 530
        System.out.println("Last_Element:"+dq1.getLast());//output 35
        System.out.println("Remove_First_Element:"+dq1.removeFirst());//530
        System.out.println("Remove_Last_Element:"+dq1.pollLast());//35
        // Difference between poll vs remove i.e. poll will not throw exception if null while remove will throw the exception
        for(int n:dq1){
            System.out.println("Deque_Element:"+n);

        }

    }
}
