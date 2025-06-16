import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class IC {
    public static void ic() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : list) {
            System.out.println(i);
        }
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        List<Integer> n = new CopyOnWriteArrayList<Integer>();
        n.add(1);
        n.add(2);
        n.add(3);
        n.add(4);
        n.add(5);
        for (Integer i : n) {
            if (i % 2 == 0) {
                n.remove(i);
            }
        }
        System.out.println("List1 After Operation:" + n);
        List<Integer> n2 = new ArrayList<>();
        n2.add(11);
        n2.add(12);
        n2.add(13);
        n2.add(14);
        n2.add(15);
        Iterator<Integer> itr2 = n2.iterator();
        while (itr2.hasNext()) {
            Integer i = itr2.next();
            if (i % 2 == 0) {
                itr2.remove();
            }
            // 11,12,13,14,15
        }
        System.out.println("List2 After Operation:" + n2);
        ListIterator<Integer> li = n2.listIterator();
        while (li.hasNext()) {
            li.next();//prevents from written down exception
            //The IllegalStateException occurs because ListIterator.set() is called without first
            // moving the iterator's position via next() or previous()
            li.set(19);// this line replace all the three elements  of the list

        }
        System.out.println("List_Iterator_Elements:" + n2);
    }
}
