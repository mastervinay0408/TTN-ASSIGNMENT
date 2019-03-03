

package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ques4 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        // try {
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

        // } finally {
        executorService.shutdown();//it will reject new tasks that are submitted to the executor.
        executorService.shutdownNow();//it will try to cancel the already submitted tasks.
        // }

        System.out.println("End");
    }
}