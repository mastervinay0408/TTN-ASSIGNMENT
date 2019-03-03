

package multithread;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class ques9 implements Runnable{
    int id;

    public ques9(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Thread name::"+Thread.currentThread().getName()+" Start :"+id);
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread name::"+Thread.currentThread().getName()+" End :"+id);
    }



    public static void main(String[] args) {

        ExecutorService executorService= Executors.newFixedThreadPool(3);
//ExecutorService executorService= Executors.newCachedThreadPool();

        for (int i = 0; i <= 5; i++) {
            executorService.submit(new ques9(i));
        }
        executorService.shutdown();
    }
}
