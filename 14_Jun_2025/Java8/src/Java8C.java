import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

// Another eg. Functional Interface
interface MathOperation {
    int operate(int a, int b);
}

public class Java8C {
    public static void java8() {
        Thread t1 = new Thread(new Task()); // normal code
        // Java8 ccding
        //Lambda expression
        Thread t2 = new Thread(() -> {
            System.out.println("नमस्ते ");
        });
        MathOperation sm = (a, b) -> a + b;// lambda expression
        MathOperation dm = (a, b) -> a - b;
        int r = sm.operate(1, 2);
        System.out.println(r);
        //Predicate-->functional Interface(boolean valued function)
        Predicate<Integer> e = x -> x % 2 == 0;
        System.out.println(e.test(4));
        // Another Eg
        Predicate<String> isS = x -> x.toLowerCase().startsWith("s");
        Predicate<String> edY = x -> x.toLowerCase().endsWith("y");
        Predicate<String> res = isS.and(edY);
        System.out.println("Combined_Result:" + res.test("ShashwatKumarChoudhary"));
        // function -> work for you
        Function<Integer, Integer> duo = x -> 2 * x;//due->Double it
        Function<Integer, Integer> tri = x -> 3 * x;//tri-> Triple it
        Integer rd = duo.apply(50000);
        Integer ad = duo.andThen(tri).apply(50000); // first double it and then triple it
        Integer compose = duo.compose(tri).apply(50000);//first Triple it and then Double it
        System.out.println("Composite Result:" + compose);
        System.out.println("Consecutive Result:" + ad);
        System.out.println("Self Double:" + rd);
        Function<Integer, Integer> id = Function.identity();
        Integer ir = id.apply(5);
        System.out.println("Identity Result:" + ir);// input->output
        //Consumer
        Consumer<Integer> con = x -> System.out.println("Consumer_Result:" + x);
        con.accept(6);
        List<Integer> list = Arrays.asList(2, 3, 4);
        Consumer<List<Integer>> pl = x -> {
            for (int i : x) {
                System.out.println(i);
            }

        };
        pl.accept(list);
        // Supplier
        Supplier<String> नमस्ते = () -> "नमस्कार";
        System.out.println(नमस्ते.get());
        // Combined Eg
        Predicate<Integer> p = x -> x % 2 == 0;// p->predicate
        Function<Integer, Integer> f = x -> x * x;// f->function
        Consumer<Integer> c = x -> System.out.println("Group_Result:" + x);// c->consumer
        Supplier<Integer> s = () -> 100;// s->supplier
        if (p.test(s.get())) {
            c.accept(f.apply(s.get()));
        }
        // BiFunction, BiPredicate ,BiConsumer
        BiPredicate<Integer, Integer> isSumeven = (x, y) -> (x + y) % 2 == 0;
        System.out.println("Condition:" + isSumeven.test(1, 3));
        BiConsumer<Integer, String> couple = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        BiFunction<String, String, Integer> sl = (x, y) -> (x + y).length();
        System.out.println("String Length:" + sl.apply("ShashwatKumar", "Choudhary"));
        // Unary And Binary Function Input
        UnaryOperator<Integer> be10x = x -> 10 * x;
        BinaryOperator<Integer> dus = (x, y) -> (x + y) / 10;
        // Method Reference
        // use method without invoking and in place of lambda expression
        List<String> std = Arrays.asList("Ram", "Shyam", "Ghanshayam");
        std.forEach(x -> System.out.println(x));
        std.forEach(System.out::println);// method reference.
        // Constructor Reference
        List<String> name = Arrays.asList("AppleIphone", "Redminote5pro", "VivoV9");
        List<Phone> mob = name.stream().map(x -> new Phone(x)).collect(Collectors.toList());
        List<Phone> mob2 = name.stream().map(Phone::new).collect(Collectors.toList());

    }

}

class Phone {
    String name;

    public Phone(String name) {
        this.name = name;
    }
}

// Java7 Coding
class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("नमस्ते ");
    }
}

class SumOperation implements MathOperation {
    @Override
    public int operate(int a, int b) {
        return a + b;
    }
}
