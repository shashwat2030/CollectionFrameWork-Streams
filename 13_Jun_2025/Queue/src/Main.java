//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void exe() {
        Q.q();
        PQ.pq();
        DQ.dq();
        BQ.bq();
        SQ.sq();
        try {
            DLQ.dlq();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Task_Interrrupted:" + e.getMessage());
        }
        // not in the signature but treated as checked exception
        TaskSubSys.taskSubsystem();
        CLDQ.cldq();
    }

    public static void main(String[] args) {
        exe();
    }
}