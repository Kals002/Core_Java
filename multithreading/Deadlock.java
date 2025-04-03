package multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class Deadlock
{
    private ReentrantLock lock1 = new ReentrantLock();
    private ReentrantLock lock2 = new ReentrantLock();

    public void worker1() throws InterruptedException
    {
        lock1.lock();

        System.out.println("Trying to get lock2");
        Thread.sleep(1000);
        lock2.lock();

        lock1.unlock();
        lock2.unlock();
    }
    public void worker2() throws InterruptedException
    {
        lock2.lock();

        System.out.println("Trying to get lock1");
        Thread.sleep(1000);
        lock1.lock();

        lock1.unlock();
        lock2.unlock();

    }
    public static void main(String[] args)
    {
        Deadlock d = new Deadlock();

        new Thread(() ->
        {
            try {
                d.worker1();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() ->
        {
            try {
                d.worker2();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}
