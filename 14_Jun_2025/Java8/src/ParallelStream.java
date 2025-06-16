import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStream {
    public static void parallelStream() {
        // it is type of stream which enable parallel processing allowing
        // multiple threads to work simultaneously
        // significantly improve performance for large data sets since workload is
        // distributed across multiple threads
        long startTime = System.currentTimeMillis();
        List<Integer> lst = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Long> fact = lst.stream().map(ParallelStream::factorial).toList();//method referencing
        long endTime = System.currentTimeMillis();
        System.out.println("Sequentail Stream Time Required:" + (endTime - startTime) + "ms");
        // Parallel Stream
        startTime = System.currentTimeMillis();
        fact = lst.parallelStream().map(ParallelStream::factorial).toList();
        //method referencing fact = lst.parallelStream().map(ParallelStream::factorial).sequential().toList();
        endTime = System.currentTimeMillis();
        System.out.println("Parallel Stream Time Required:" + (endTime - startTime) + "ms");
        // Cumulative Sum
        //{1,2,3,4,5}->{1,3,6,10,15}
        List<Integer> cn = Arrays.asList(1, 2, 3, 4, 5);
        AtomicInteger s = new AtomicInteger(0);
        System.out.println("Expected Result:[1,3,6,10,15]");
        List<Integer> cs = cn.stream().map(x -> s.addAndGet(x)).toList();//lambda expression
        //or
        List<Integer> cs2 = cn.parallelStream().map(s::addAndGet).toList();//  method reference
        System.out.println("Sequential Stream Result:" + cs);
        System.out.println("Parallel Stream Result:" + cs2);// this is draw back of parallelstream
        //since commulative stream depends upon the sequential sum


    }

    public static long factorial(int n) {
        long f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
