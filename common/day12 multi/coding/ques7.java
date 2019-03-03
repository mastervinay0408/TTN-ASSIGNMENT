package multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ques7 {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        //  executorService.submit(()->{
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
                System.out.println("Thread 3");
            }
        });


        executorService.shutdown();

        try {
            executorService.awaitTermination(2000L,TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(executorService.isTerminated()){
            System.out.println("Terminated");
        }else{
            System.out.println("On or more tasks still remaining");
        }
    }
}