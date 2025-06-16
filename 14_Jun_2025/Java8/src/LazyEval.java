import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEval {
    public static void lazyEval() {
        List<String> names = Arrays.asList("Shashwat", "Rahul", "Arjun", "Krishna", "Ema");
        Stream<String> stream = names.stream().filter(name -> {// this terminal operation is required
            // to run this
            System.out.println("Filtering:" + name);
            return name.length() > 3;
        });
        System.out.println("Before Terminal Operation");
        List<String> res = stream.collect(Collectors.toList());
        System.out.println("After Terminal Operation");
        System.out.println(res);

    }
}
