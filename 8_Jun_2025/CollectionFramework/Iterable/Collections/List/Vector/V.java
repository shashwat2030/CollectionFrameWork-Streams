import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Vector;
import java.util.LinkedList;
class V {
    public static void main(String[] ShashwatKumarChoudhary) {
        Vector<Integer> v = new Vector<>(15,1);
        System.out.println(v.capacity());
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        System.out.println(v.capacity());
        LinkedList<Integer> l1= new LinkedList<>();
        l1.add(2);
        l1.add(3);
        l1.add(4);
        Vector<Integer> v2=new Vector<>(Arrays.asList(1,5,6,7,8,9));
        System.out.println(v2);
//retrieval loop
        System.out.println("Loop Iteration");
        for(int i=0;i<v2.size();i++){
            System.out.println(v2.get(i));
        }
        v2.clear();
        System.out.println(v2);

    }
}