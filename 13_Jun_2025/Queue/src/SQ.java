import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SQ {
    public static void sq(){
BlockingQueue<String> sq=new SynchronousQueue<>();
Thread producer=new Thread(()->{
    try{
        System.out.println("Producer Transferring:");
        sq.put("Namaskar");
        System.out.println("Producer Send:");
    }
    catch(InterruptedException e){
        Thread.currentThread().interrupt();
        System.out.println("Producer Interruted");
    }
});
Thread consumer=new Thread(()->{
    try{
        System.out.println("Consumer Waiting:");
        String m=sq.take();
        System.out.println("Consumer Received:"+m);
    } catch (InterruptedException f)
    {   Thread.currentThread().interrupt();
        System.out.println("Consumer Interrupted:");
    }


});
producer.start();
consumer.start();
    }
}
