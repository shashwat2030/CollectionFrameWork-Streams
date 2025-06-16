import java.util.HashMap;
import java.util.Hashtable;

public class HTab {
    public static void exe(){
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(1,"Asad");
        ht.put(2,"Sabi");
        ht.put(3,"Rq");
        ht.put(4,"Hz");
        ht.put(5,"PS");
        System.out.println(ht);
        System.out.println("Key 5:"+ht.get(5));
        System.out.println("Does key 3 exist:"+ht.containsKey(3));
        ht.remove(4);
        System.out.println("AfterRemoval"+ht);
       // ht.put(null,"Value"); throws exception
       // ht.put(4,null); throws exception
        /*exe(HTab.java:16)
	at HTab.main(HTab.java:19)*/
        // Concurrency Example
        HashMap<Integer,String> hm=new HashMap<>();
        Thread t1=new Thread(()->{
            for(int i=0;i<1000;i++){
                hm.put(i,"Thead1");
            }
        });
        Thread t2=new Thread(()->{
            for(int i=1000;i<2000;i++){
               hm.put(i,"Thread2");
            }
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){e.printStackTrace();}
        System.out.println("HashMap Size:"+hm.size());
        Hashtable<Integer,String>ht2=new Hashtable<>();
        Thread m=new  Thread(()->{
            for(int i=0;i<1000;i++){
                ht2.put(i,"Thread3");
            }
        });
        Thread n=new Thread(()->{
            for(int j=1000;j<2000;j++){
                ht2.put(j,"Thread4");
            }
        });
        m.start();
        n.start();
        try{m.join();n.join();}
        catch(InterruptedException f){f.printStackTrace();}
        System.out.println("HashTable Size:"+ht2.size());

    }
    public static void main(String[] ShashwatKumarChoudhary){exe();}
}
