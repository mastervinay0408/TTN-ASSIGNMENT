package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ques3 {

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
                System.out.println("Thread 3" );

            }
        });

        System.out.println("End");
    }
}