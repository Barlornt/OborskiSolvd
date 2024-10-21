package threadsHw;

public class ThreadRunnable {
    public static void main(String[] args) {
        RunnableTask task1 = new RunnableTask("Runnable Task 1");
        RunnableTask task2 = new RunnableTask("Runnable Task 2");

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

        System.out.println("Runnable tasks finished.");
    }
}
