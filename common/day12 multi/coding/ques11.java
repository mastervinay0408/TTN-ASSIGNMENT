package multithread;

import java.util.stream.IntStream;


public class ques11 {

    int count;
    public void incrementCount() {

        // synchronized (this) {
        count++;
        //       }
    }

    public void worker1() {
        for (int i = 1; i <= 1000; i++) {
            incrementCount();
        }
    }

    public void worker2() {
        for (int i = 1; i <= 1000; i++) {
            incrementCount();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ques11 ques11 = new ques11();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ques11.worker1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ques11.worker2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(ques11.count);
    }
}