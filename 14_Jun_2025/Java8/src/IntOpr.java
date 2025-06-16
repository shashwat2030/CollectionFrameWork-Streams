import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntOpr {
    public static void intOpr() {
        // Intermediate operations transform a stream into another stream
        // They are lazy,meaning they won't execute until terminal operation is invoked.
        //1.filter
        List<String> list = Arrays.asList("Ram", "Shayam", "Ghanshyam", "Ram");
        Stream<String> fs = list.stream().filter(x -> x.startsWith("R "));
        //no filtering at this point
        long res = list.stream().filter(x -> x.startsWith("R")).count();
        System.out.println(res);
        //2.map
        Stream<String> ucn = list.stream().map(String::toUpperCase);
        // 3 sorted
        Stream<String> sorstr = list.stream().sorted((a, b) -> a.length() - b.length());
        // 4 distinct
        System.out.println(list.stream().filter(x -> x.startsWith("R")).distinct().count());
        //5 limit
        List<Integer> cc = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
        System.out.println(cc);
        // 6 skip
        List<Integer> sc = Stream.iterate(1, x -> x + 1).skip(10).limit(100).collect(Collectors.toList());
        System.out.println(sc);
        // 7 peek
        // Performs an action on each element as it is consumed.
        Stream.iterate(1, x -> x + 1).skip(10).limit(100).peek(System.out::println).count();
        // 8 flatMap
        // flatten nested structures(e.g.,list within lists) so that they can be processed as a single sequence of elements
        // Transform and flatten elements at the same time
        List<List<String>> lstofLst = Arrays.asList(Arrays.asList("Superman", "Batman"), Arrays.asList("Spiderman", "IronMan"), Arrays.asList("Hulk", "Joker"), Arrays.asList("Captain-America", "Thor"), Arrays.asList("Black_Widow", "ScarletWitch"));
        System.out.println("My Hero:" + lstofLst.get(1).get(1));
        // flatteing the list of list using the streams
        System.out.println(lstofLst.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList());
        List<String> s = Arrays.asList("तो चलिए शुरू करते है बिना किसी बकचोड़ी के", "तो कैसे है आप लोग?", "ठीक ही होंगे |");
        System.out.println(s.stream().flatMap(sen -> Arrays.stream(sen.split(" "))).map(String::toUpperCase).toList());


    }
}
