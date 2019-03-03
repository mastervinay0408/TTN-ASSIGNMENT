package multithread;

public class ques1 extends Thread{

    @Override
    public void run() {
        System.out.println("Extended through thread");
    }

    public static void main(String[] args) {
        new ques1().start();
        Thread thread1 = new Thread(new UsingRunnableInterface());
        thread1.start();
    }

}
class UsingRunnableInterface implements Runnable {

    @Override
    public void run() {
        System.out.println("Used Runnable interface to run this thread.");
    }
}