package multithread;

public class ques14 {

    public void worker1(){
        synchronized (this) {
            System.out.println("Worker1 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker1 Done");
        }
    }

    public void worker2(){
        synchronized (this) {
            System.out.println("Worker 2 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker 2 Done");
        }
    }

    public void worker3(){
        synchronized (this) {
            System.out.println("Worker 3 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker 3 Done");
        }
    }



    public void worker4(){
        synchronized (this) {
            System.out.println("Worker 4 Started");
            System.out.println("Worker 4 Done");
            notifyAll();
        }
    }

    public static void main(String[] args) {
        ques14 ques14 = new ques14();
        new Thread(new Runnable() {
            @Override
            public void run() {
                ques14.worker1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                ques14.worker2();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                ques14.worker3();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                ques14.worker4();
            }
        }).start();
    }
}