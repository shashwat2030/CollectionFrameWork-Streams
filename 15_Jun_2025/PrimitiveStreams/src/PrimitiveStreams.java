import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveStreams {
    public static void primitiveStreams() {
        int[] n = {2, 3, 4};
        IntStream s = Arrays.stream(n);// primitive data stream for primitive data type elememt
        System.out.println(IntStream.range(2, 4).boxed().collect(Collectors.toList()));
        System.out.println(IntStream.rangeClosed(2, 4).boxed().collect(Collectors.toList()));
        IntStream.of(2, 3, 4);
        DoubleStream duo = new Random().doubles(5);
        //System.out.println(duo.sum());//
        // there should 1 commented otherwise there will be exception
        // System.out.println(duo.min());
        // System.out.println(duo.max());
        // System.out.println(duo.average);
        //System.out.println(duo.summaryStatistics());
        // System.out.println(duo.maptoInt(x->x+1));

         System.out.println(duo.boxed().collect(Collectors.toList()));
        IntStream ir = new Random().ints(5);
        System.out.println(ir.boxed().collect(Collectors.toList()));
    }
}
