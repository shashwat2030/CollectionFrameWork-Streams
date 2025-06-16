import java.util.Stack;
import java.util.LinkedList;
class S{
    public static void main(String[] ShashwatKumarChoudhary){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        Integer r=s.pop();
        System.out.println(s);
        Integer p=s.peek();
        System.out.println(p);
        System.out.println(s);
        System.out.println(s.isEmpty());
        System.out.println(s.size());
       int  sch=s.search(3);
        System.out.println(sch);
        // LinkedList as stack
        LinkedList <Integer>l1=new LinkedList<>();
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.getLast();
        l1.removeLast();
        l1.isEmpty();
        // arraylist as Stack
        ArrayList<Integer> l2=new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.get(l2.size()-1);// peek
        l2.remove(l2.size()-1);//peek




    }
}