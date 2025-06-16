import java.util.ArrayList;
import java.util.Vector;
public class M {
    public static void main(String[] ShashwatKumarChoudhary){
            ArrayList<Integer> a =new ArrayList<>();
            Vector<Integer>v=new Vector<>();
            //code for Multithreading Enviornment
        System.out.println("Unsafe Thread");
        Thread t=new Thread(()->{
           for(int i=0;i<1000;i++){
               a.add(i);
           }
        });
        Thread u =new Thread(()->{
           for(int i=0;i<1000;i++){
               a.add(i);
           }
        });
        t.start();
        u.start();
        try{
            t.join();
            u.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("ArrayList Size:"+a.size());
        //vs
        System.out.println("Safe Thread");
        Thread m=new Thread(()->{
            for(int i=0;i<1000;i++){
                v.add(i);
            }
        });
        Thread n =new Thread(()->{
            for(int i=0;i<1000;i++){
                v.add(i);
            }
        });
        m.start();
        n.start();
        try{
            m.join();
            n.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Vector Size:"+v.size());

    }
}
