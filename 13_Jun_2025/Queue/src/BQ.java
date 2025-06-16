import java.util.Comparator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class BQ {
    public static void bq(){
BlockingQueue<Integer> bq=new ArrayBlockingQueue<>(10);
// A bounded ,blocking queue backed by circular array
        //low memeory overhead
        //uses a single lock for both enqueue and dequeue both operations.
        //more theads-->problem
        Thread pro=new Thread(new Producer(bq));
        Thread con=new Thread(new Consumer(bq));
        pro.start();
        con.start();
        BlockingQueue<Integer>bq2=new LinkedBlockingQueue<>(15);
        //optionally bounded recommended to make it bounded because out of memory error
        //backed by linked list
        // use two separate locks for enqueue and dequeue locks.
        //Higher concurrency between the producer and consumer.
        BlockingQueue<String> bq3=new PriorityBlockingQueue<>(21, Comparator.reverseOrder());
        // unbounded
        //Binary Heap as array and can grow dynamically
        //Head is  based on their natural ordering or provided  Comparator
        //put won't block
        bq3.offer("Apple");
        bq3.offer("Microsoft");
        bq3.offer("Google");
        System.out.println(bq3);


    }

}
class Producer implements Runnable{
    private BlockingQueue<Integer> q;
    private int v=0;// v->value
    public Producer(BlockingQueue<Integer>q){
        this.q=q;

    }
    @Override
    public void run() {
        while(true){
            try{
                System.out.println("Producer Produced:"+v);
                q.put(v++);
                Thread.sleep(500);

            }
            catch(Exception e){
                Thread.currentThread().interrupt();
                System.out.println(("Producer Interrupted"));}

        }// do not think about the lines these are useless
    }
}
class Consumer implements Runnable{
    private BlockingQueue<Integer> q;
    // v->value
    public Consumer(BlockingQueue<Integer>q){
        this.q=q;

    }
    @Override
    public void run() {
        while(true){
            try{
                Integer v=q.take();
                System.out.println("Concsumer_Consumed:"+v);
                q.put(v);
                Thread.sleep(1000);

            }
            catch(Exception e){
                Thread.currentThread().interrupt();
                System.out.println(("Consumer Interrupted"));}

        }
    }
}