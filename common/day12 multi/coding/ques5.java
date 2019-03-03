package multithread;
import java.util.concurrent.*;

public class ques5 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1");
            }
        });

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2");
            }
        });

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000L);
                } catch (InterruptedException e) {
//                    e.printStackTrace();
                }
                System.out.println("Thread 3");
            }
        });

        executorService.shutdown();
        System.out.println(executorService.isShutdown());
        System.out.println(executorService.isTerminated());
        System.out.println("End");
    }
}