package CollectionFramework.LinkedList;
import java.util.Arrays;
import java.util.LinkedList;

class Node {
    public int d;// d means data
    public Node nt;// nt means next

}

public class LL {
    public static void main(String[] ShashwatKumarChoudhary) {

        Node n = new Node(); // n ->node
        Node n2 = new Node();// n2->node2
        n2.d = 2;// assigning 2 values into node
        n.d = 1;// assigning 1 values into node
        n.nt = n2; // connecting node 1 -> node 2
        n2.nt = null; // assigning null value to node 2

        LinkedList<Integer> n3 = new LinkedList<>();
        n3.add(1);
        n3.add(2);
        n3.add(3);
        n3.get(2);
        n3.addLast(4);
        n3.addFirst(0);
        n3.getFirst();
        n3.getLast();
        System.out.println(n3);
        // java8 here usage of predicate which simply means whether a condition is true
        // or false.
        n3.removeIf(x -> x % 2 == 0);
        System.out.println(n3);
        LinkedList<String> a = new LinkedList<>(
                Arrays.asList("Wolf", "Tiger", "Lion", "Leopard", "Jaguar", "Snake", "Elephant"));
        // a stands for animal.
        LinkedList<String> ar = new LinkedList<>(Arrays.asList("Wolf", "Snake", "Elephant"));
        // ar stands for animals remove.
        a.removeAll(ar);
        System.out.println(a);

    }

}
