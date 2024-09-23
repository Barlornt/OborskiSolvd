package threadsHw;

public class RunnableTask implements Runnable {
    private String taskName;

    public RunnableTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(taskName + " is running: Step " + i);
        }
    }
}