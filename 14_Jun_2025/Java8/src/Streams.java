import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void streams() {
// feature introduced in java 8
        //helping in processing collection into functional and declarative manner
        // Simplify data processing
        // embrace functional programming
        // improve readability and maintainability
        // enable easy parallelism
        // how to use stream
        // Source ,intermediate operations & terminal operation
        //traditional programming
        List<Integer> n = Arrays.asList(1, 2, 3, 4, 5);
        int count = 0;
        for (Integer i : n) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Total Even No:" + count);
        //Stream based programming
        System.out.println("Total Even No:" + n.stream().filter(x -> x % 2 == 0).count());
// Create Stream
        //1. from Collections
        List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5);
        //2 from Arrays
        String[] a = {"ram", "shyam", "ghanshayam"};
        Stream<String> sa = Arrays.stream(a);
        // 3 Using Stream.of
        Stream<String> ss = Stream.of("ram", "shyam", "ghanshayam");
        // 4 Infinite Streams
        Stream<Integer> g1 = Stream.generate(() -> 1);
        Stream<Integer>g3=Stream.iterate(0,x->x+2);
        // these are the two ways of generating infinite streams
        // 5 finite Stream
        List<Integer> l1to100 = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
        System.out.println(l1to100);



    }
}
