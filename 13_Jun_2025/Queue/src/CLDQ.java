import java.util.concurrent.ConcurrentLinkedDeque;

public class CLDQ {
    public static void cldq() {
        // non-blocking ,thread-safe double-ended queue
        //CAS -compare and swap strategy used
        ConcurrentLinkedDeque<String> cld = new ConcurrentLinkedDeque<>();
        cld.add("Power");
        cld.addFirst("Passion");
        cld.addLast("Purity");
        System.out.println(cld);
        String first=cld.removeFirst();
        String last=cld.removeLast();
        System.out.println("Removed:"+first);
        System.out.println("Removed:"+last);

    }
}
