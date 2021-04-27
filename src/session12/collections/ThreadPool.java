package session12.collections;

import java.util.concurrent.*;

public class ThreadPool {

    public static void main(String[] args) {

        ThreadPoolExecutor p1 = new ThreadPoolExecutor(3, 10,
                                      0L, TimeUnit.MILLISECONDS,
                                      new LinkedBlockingQueue<Runnable>());


        ThreadPoolExecutor p2 = new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                60L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>());


        Executor p3 = Executors.newScheduledThreadPool(5);
        /*
        super(corePoolSize, Integer.MAX_VALUE, 0, NANOSECONDS, new DelayedWorkQueue());
         */

    }

}
