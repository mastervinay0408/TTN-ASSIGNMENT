package multithread;

public class ques2
{
    public static void main(String[] args) throws InterruptedException {
        thredone t1 = new thredone();
        t1.start();
        threadtwo t2 = new threadtwo();
        t2.start();

        t1.join();
        t2.join();


        System.out.println("main thread started");

    }
}


class thredone extends Thread
{

    @Override
    public void run() {
        //  System.out.println("thread1 started");
        for(int i=0;i<10;i++)
        {
            try
            {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }

    }
}

class threadtwo extends Thread
{


    @Override
    public void run() {
        //System.out.println("thread2 started");
        for(int i=0;i<10;i++)

        {
            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            System.out.println(i);
        }

    }
}