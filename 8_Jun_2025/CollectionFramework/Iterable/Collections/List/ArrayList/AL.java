import java.lang.reflect.Field;
import java.util.*;

class StrLenCpr implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length()-s2.length();

    }
}
class LenCpr implements Comparator<Integer>{
    @Override
    public int compare(Integer i1,Integer i2){
        return i2-i1;
    }
}

public class AL {
    public static void main(String[] ShashwatKumarChoudhary) {
        ArrayList al1 = new ArrayList(); // raw use for the ArrayList
        // make it parameterised for making it type safe.
        ArrayList<Integer> al = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        // indexing starts from zeroth index
        l.add(1);
        l.add(5);
        l.add(80);
        System.out.println("Size:" + l.size());
        // System.out.println(l.get(3));
        // throwing the exception out of bound.
        System.out.println("2nd element:" + l.get(2));
        System.out.println("For Loop:");
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        System.out.println("For Each Loop:");
        for (int x : l) {
            System.out.println(x);
        }
        System.out.println("Existence:");
        System.out.println(l.contains(5));
        System.out.println(l.contains(50));
        // Removal Operation:
        l.remove(2);
        System.out.println("Elements after removal");
        for (int x : l) {
            System.out.println(x);

        }
        // insertion at specific index
        System.out.println("Elements insertion at specific index");
        l.add(2, 50);
        for (int x : l) {
            System.out.println(x);
        }
        l.set(2, 100); // replacing 50
        System.out.println(l);
        System.out.println("New List");
        ArrayList<Integer> l2 = new ArrayList<>(9);
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);
        System.out.println("New List Size:" + l2.size());
        // Reflection Code not accessible due to vm options its not available
        try {
            Field f = ArrayList.class.getDeclaredField("element_data:");
            f.setAccessible(true);
            Object[] ed = (Object[]) f.get(l2);
            System.out.println("ArrayList Capacity: " + ed.length);
            l2.add(11);
            ed = (Object[]) f.get(l2);
            System.out.println("ArrayList Capacity:" + ed.length);
            l2.remove(2);
            l2.remove(2);
            l2.remove(2);
            l2.remove(2);
            l2.remove(2);
            l2.remove(2);
            l2.remove(2);
            l2.remove(2);
            l2.remove(2);

            ed = (Object[]) f.get(l2);
            System.out.println("ArrayList Capacity:" + ed.length);
            l2.trimToSize();

            ed = (Object[]) f.get(l2);
            System.out.println("ArrayList Capacity:" + ed.length);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println("Could not access ArrayList capacity: " + e.getMessage());
        }

        // Overview:
        List<String> l3 = new ArrayList<>();
        System.out.println(l3.getClass().getName());
        List<String> l4 = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        System.out.println(l4.getClass().getName());
        // java.util.Arrays$ArrayList it's not direct ArrayList so we cannot add or
        // remove
        // but we can set the data
        l4.set(2, "Sunday");
        // l4.add("Thursday");//Exception in thread "main"
        // java.lang.UnsupportedOperationException
        System.out.println(l4);
        // here we cannot change List to ArrayList it will cause the error
        String[] a = { "Apple", "Microsoft", "Google" };
        List<String> l5 = Arrays.asList(a);
        System.out.println(l5.getClass().getName());
        // this created
        List<Integer> l6 = List.of(2, 3, 4); // unmodifiable list cause below exception can't
        // modify
        // l6.set(1,33);//Exception in thread "main"
        // java.lang.UnsupportedOperationException
        System.out.println(l6);
        List<String> l7 = new ArrayList<>(l5);
        // now converting semi modified to complete modified.
        l7.add("Tata");
        System.out.println(l7);
        // either you pass capacity or the list inside the array the list.
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0, 0);
        list.remove(2);
        // removing the 3 from the list only if ommit list.add(0,0);
        System.out.println("After removing 1 as index:" + list);
        // and to remove as element follow the code only if list.add(0,0);
        list.remove(Integer.valueOf(2));
        // remove the 2 from list
        System.out.println("After removing 1 as element:" + list);
        // ultimately 1 left

        List<Integer> l8 = List.of(6, 9, 15, 12, 10, 99);
        list.addAll(l8);
        System.out.println(list);
        Collections.sort(list);
        // or
        list.sort(new LenCpr());// sorting in descending order due to LenCpr class
        System.out.println("After_Sorting" + list);
        List<String> c = new ArrayList<>();
        c.add("Apple");
        c.add("Facebook");
        c.add("Yahoo");
        c.add("Tesla");
        c.add("Google");
        c.remove("Yahoo");
        System.out.println(c);
        Object[] b = c.toArray();
        String[] b1 = c.toArray(new String[0]);
        List<String> words =Arrays.asList("banana","apple","data");
        words.sort(new StrLenCpr());
      //  words.sort((a,b)->b.length()-a.length());
        System.out.println(words);

    }
}
