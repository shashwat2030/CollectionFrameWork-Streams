import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;
class CWAM{
    public static void main(String[] ShashwatKumarChoudhary){
        //Exception Generating Code
/*List<String> l1=new ArrayList<>();
l1.add("pen");
l1.add("copy");
l1.add("ipad");
Thread r =new Thread(()->{
    try{while(true){for(String s:l1){System.out.println("Reading_Item"+s);Thread.sleep(500);}}}
    catch(Exception e){System.out.println("Reader_Thread_Exception"+e);}
});
Thread w =new Thread(()->{
    try{Thread.sleep(1000);l1.add("coffee");System.out.println("Item_Added");Thread.sleep(1000);l1.remove("ipad");
        System.out.println("Item_Removed");}
    catch(InterruptedException e){e.printStackTrace();}
});*/
        List<String> l1=new CopyOnWriteArrayList<>();
        l1.add("pen");
        l1.add("copy");
        l1.add("ipad");
        Thread r =new Thread(()->{
            try{while(true){for(String s:l1){System.out.println("Reading_Item"+s);Thread.sleep(500);}}}
            catch(Exception e){System.out.println("Reader_Thread_Exception"+e);}
        });
        Thread w =new Thread(()->{
            try{Thread.sleep(1000);l1.add("coffee");System.out.println("Item_Added");Thread.sleep(1000);l1.remove("ipad");
                System.out.println("Item_Removed");}
            catch(InterruptedException e){e.printStackTrace();}
        });
r.start();
w.start();
    }
}