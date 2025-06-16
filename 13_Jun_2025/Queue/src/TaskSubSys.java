import java.util.concurrent.ConcurrentLinkedQueue;

public class TaskSubSys {
    private static final ConcurrentLinkedQueue<String> tq = new ConcurrentLinkedQueue<>();

    public static void taskSubsystem() {

        Thread producer = new Thread(() -> {
            while (true) {
                try {
                    tq.add("Task:" + System.currentTimeMillis());
                    //Adds task (will use locks internally)

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        Thread consumer = new Thread(() -> {
            while (true) {
                try {
                    String task = tq.poll();
                    System.out.println("Processing:" + task);

                } catch (Exception f) {
                    f.printStackTrace();
                }
            }
        });
        producer.start();
        consumer.start();
    }
}

