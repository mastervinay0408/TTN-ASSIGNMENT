package multithread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class ques8 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        executorService
                .schedule(new Runnable() {
                              @Override
                              public void run() {
                                  for (int i = 0; i < 10; i++) {
                                      System.out.println(i);
                                  }
                              }
                          },
                        1,
                        TimeUnit.SECONDS);

        executorService
                .scheduleWithFixedDelay(new Runnable() {
                                            @Override
                                            public void run() {
                                                try {
                                                    Thread.sleep(2000L);
                                                    System.out.println("ScheduleWithFixedDelay Scheduled Task to executed after fixed interval");
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }

                                            }
                                        }
                        ,
                        0,
                        1,
                        TimeUnit.SECONDS);

        executorService
                .scheduleAtFixedRate(new Runnable() {
                                         @Override
                                         public void run() {
                                             try {
                                                 Thread.sleep(2000L);
                                                 System.out.println("ScheduleAtFixedRate Scheduled Task to executed after fixed interval");
                                             } catch (InterruptedException e) {
                                                 e.printStackTrace();
                                             }
                                         }
                                     }
                        ,
                        0,
                        1,
                        TimeUnit.SECONDS);

        executorService.shutdown();

    }
}