import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerOpr {
    public static void terOpr() {
// to get result from the stream

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //1 collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();
        //2 foreach
        list.stream().forEach(System.out::println);
        // 3 reduce: Combines elements to produce a single result.
        // accumulator
        Optional<Integer> opi = list.stream().reduce(Integer::sum);
        System.out.println(opi.get());
        // 4  count
        // 5 anymatch,allmatch,nonematch // these are short cut operations
        boolean mb = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(mb);
        boolean lbm = list.stream().allMatch(x -> x > 0);
        System.out.println(lbm);
        boolean nbm = list.stream().noneMatch(x -> x < 0);
        System.out.println(nbm);
        // 6.findFirst,findAny
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());
        // 7. Eg find the name whose length is less than 3
        List<String> names = Arrays.asList("Abhishek", "Bhartendu", "Chetan", "Diwakar", "Ema");
        System.out.println(names.stream().filter(x -> x.length() > 3).toList());
        // 8 Eg. squaring and sorting numbers
        List<Integer> n = Arrays.asList(9, 5, 4, 6, 8, 5, 3, 1);
        System.out.println(n.stream().map(x -> x * x).sorted().toList());
        // 9 Eg. Summing Values
        List<Integer> i = Arrays.asList(8, 5, 3, 1);
        System.out.println("Sum:" + i.stream().reduce(Integer::sum).get());
        // 10. Counting Occurences of a Character
        String sen = "Vasudev Kutumbkum";
        System.out.println("U_Occurances:" + sen.chars().filter(x -> x == 'u').count());
        // 11 toArray
        Object[] a = Stream.of(2, 3, 4).toArray();
        // 12 min max
        System.out.println("Maximum:" + Stream.of(2, 3, 4).max(Comparator.naturalOrder()).get());
        System.out.println("Minimum:" + Stream.of(2, 3, 4).min(Comparator.naturalOrder()).get());
// natural order as lambda expression
        System.out.println("Lambda Max:" + Stream.of(2, 3, 4).max((o1, o2) -> o1 - o2).get());
        System.out.println("Lambda Min:" + Stream.of(2, 3, 4).min((o1, o2) -> o2 - o1).get());
        Stream<String> s = names.stream();
        s.forEach(System.out::println);
        //List<String> list1 = s.map(String::toUpperCase).toList();//Stream cannot be reused after a terminal operation has
        // been called throwing exception
        // forEachOrdered
        List<Integer> n2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Using forEach with Parallel Stream:");
        n2.parallelStream().forEach(System.out::println);
        System.out.println("Using forEachOrdered with Parallel Stream:");
        n2.parallelStream().forEachOrdered(System.out::println);
    }
}
