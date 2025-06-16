import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
class CWA
{
    public static void main(String[] ShashwatKumarChoudhary){
        CopyOnWriteArrayList<Integer> l1 = new CopyOnWriteArrayList<>();
        //Exception code
    /*    List<String> l2 = new ArrayList<String>();
        l2.add("iphone");
        l2.add("imac");
        l2.add("macbook_air");
        l2.add("apple_watch");
        l2.add("ipad_air");
        l2.add("ipad_pro");
        System.out.println("ArrayList");
        System.out.println("Initial_List:"+l2);
        // now iterating the through the code
        for(String s:l2){
            System.out.println(s);
            if(s.equals("iphone")){
                l2.add("iphone_se");
                System.out.println("Both phones are brought");
            }
        }
        System.out.println("Complete List :     "+l2);
*/
List<String> l3 =new CopyOnWriteArrayList<>();
        l3.add("iphone");
        l3.add("imac");
        l3.add("macbook_air");
        l3.add("apple_watch");
        l3.add("ipad_air");
        l3.add("ipad_pro");
        System.out.println("CopyOnWriteArrayList");
        System.out.println("Initial_List:"+l3);
        // now iterating the through the code
        for(String s:l3){
            System.out.println(s);
            if(s.equals("iphone")){
                l3.add("iphone_se");
                System.out.println("Both phones are brought");
            }
        }
        System.out.println("Complete List :     "+l3);


    }
}