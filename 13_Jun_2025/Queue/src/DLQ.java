import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DLQ {
    public static void dlq() throws InterruptedException {
        BlockingQueue<DT> dlq = new DelayQueue<>();
        dlq.put(new DT("Meditating:", 5, TimeUnit.SECONDS));
        dlq.put(new DT("Breathing :", 10, TimeUnit.SECONDS));
        dlq.put(new DT("Analysing :", 15, TimeUnit.SECONDS));
        dlq.put(new DT("Focusing  :", 45, TimeUnit.SECONDS));
        while (!dlq.isEmpty()) {
            DT t = dlq.take();
            System.out.println("Executed:" + t.getTaskname() + "at:" + System.currentTimeMillis());
        }
    }
}

class DT implements Delayed {// DT-> DelayedTask
    private final String taskname;
    private final long starttime;

    public DT(String taskname, long delay, TimeUnit unit) {
        this.taskname = taskname;
        this.starttime = System.currentTimeMillis() + unit.toMillis(delay);
    }

    @Override
    public int compareTo(Delayed o) {
        if (this.starttime < ((DT) o).starttime) {
            return -1;
        }
        if (this.starttime > ((DT) o).starttime) {
            return 1;
        }
        return 0;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long remTime = starttime - System.currentTimeMillis();
        return unit.convert(remTime, TimeUnit.MILLISECONDS);
    }

    public String getTaskname() {
        return taskname;
    }
}