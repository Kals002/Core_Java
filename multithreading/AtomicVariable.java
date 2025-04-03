package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariable implements Runnable
{
   // private int counter = 0;

    private AtomicInteger counter = new AtomicInteger(0);

    @Override
    public void run()
    {
        for(int i = 0; i < 1000000; i++)
        {
            //counter++;
            counter.incrementAndGet();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicVariable av = new AtomicVariable();

        Thread t1 = new Thread(av);
        Thread t2 = new Thread(av);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(av.counter);
    }


}
