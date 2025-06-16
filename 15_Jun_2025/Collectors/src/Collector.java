import java.util.*;
import java.util.stream.Collectors;

public class Collector {
    public static void collectors() {
// Collectors is a utility class
        //provides a set of methods to create common collectors
        List<String> names = Arrays.asList("Shashwat", "Rahul", "Abhishek");
        List<String> res = names.stream().filter(name -> name.startsWith("S")).collect(Collectors.toList());
        System.out.println(res);
        //2 Collecting to a set
        List<Integer> nums = Arrays.asList(2, 3, 4, 5, 5, 6, 7);
        Set<Integer> set = nums.stream().collect(Collectors.toSet());
        // Collecting to a specific Collection
        names.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));
        // any type of collection framework
        // 4 Joining Strings
        String concna = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(concna);
        // 5 summarising data
        // Generates statistical summary( count,sum,min,average,max)
        List<Integer> nums2 = Arrays.asList(2, 3, 4);
        IntSummaryStatistics stats = nums2.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        // 6.calculating Averages
        Double avg = nums.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("List1 Average: " + avg);
        // 7 Counting Elements
        long c = nums.stream().collect((Collectors.counting()));
        System.out.println("List1 Element:" + c);
        // 8 Growing Elements
        List<String> words = Arrays.asList("Power", "Passion", "Strength", "Stability", "Success");
        System.out.println(words.stream().collect(Collectors.groupingBy(x -> x.length())));//lambda expression
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));// method reference
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", "))));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));
        TreeMap<Integer, Long> tmp = words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(tmp);
// 9 Partitioning Elements
        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5)));
// 10 Mapping and Collecting
        // Applying a mapping function before collecting
        System.out.println(words.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList())));
        // Eg:1 Collecting Names by Length
        List<String> l1 = Arrays.asList("Shashwat", "Rahul", "Abhishek", "Bhartendu", "Chetan");
        System.out.println(l1.stream().collect(Collectors.groupingBy(String::length)));
        //Eg:2 Counting Word Occurences
        String sen = "चिंता चिता समान है सब कहो को खाए|" + " उस पर माया आन बड़ी जो काट कलेजा लीजय |" + "और समय बहूत खाती है |" + "कोई समझ न पाए |" + "जो ये सबक न खाए वो बाद में पछताए|";
        System.out.println(Arrays.stream(sen.split("\\|")).collect(Collectors.groupingBy(x -> x, Collectors.counting())));
// Eg 3 Partitioning even and odd
        List<Integer> l2 = Arrays.asList(1, 5, 6, 7, 8, 9);
        System.out.println(l2.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0)));
        // Eg 4 Summing values in Map
        Map<String, Integer> i = new HashMap<>();
        i.put("Microsoft", 3);
        i.put("Google", 2);
        i.put("Apple", 1);
        System.out.println(i.values().stream().reduce(Integer::sum).get());
        System.out.println(i.values().stream().collect(Collectors.summingInt(x -> x)));
        // Eg 5 creating a map from stream elements
        List<String> superHero = Arrays.asList("IronMan", "BlackWidow", "CaptainAmerica", "Thor", "Hulk", "BenTennyson");
        System.out.println(superHero.stream().collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length())));
        // Eg 6
        List<String> food = Arrays.asList("Rajma_Chawal", "Dal_Chawal", "Paneer_Roti", "Kachori", "Masala_Dosa", "Chawal_Sabzi", "Dal_Chawal_Sabzi");
        System.out.println(food.stream().collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y)));


    }
}
