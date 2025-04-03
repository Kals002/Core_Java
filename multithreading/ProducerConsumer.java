package multithreading;

import java.util.LinkedList;
import java.util.List;

public class ProducerConsumer
{
    private List<Integer> list = new LinkedList<>();
    int capacity = 2;

    public void produce() throws InterruptedException
    {
        int value = 0;

        while(true)
        {
            synchronized(this)
            {
                while(list.size() == capacity)
                {
                    this.wait();
                }
                System.out.println("Producer produced - "+value);
                list.add(value++);
                this.notify();

                Thread.sleep(1000);
            }
        }
    }
    public void consume() throws InterruptedException
    {
        while(true)
        {
            synchronized(this)
            {
                while(list.isEmpty())
                {
                    this.wait();
                }
                System.out.println("Consumer consumed - "+list.removeLast());
                this.notify();
                Thread.sleep(1000);
            }
        }

    }
    public static void main(String[] args)
    {
           ProducerConsumer producer = new ProducerConsumer();

           new Thread(() ->
           {
               try
               {
                   producer.produce();
               }
               catch (InterruptedException e)
               {
                   throw new RuntimeException(e);
               }
           }).start();

           new Thread(() ->
           {
               try {
                   producer.consume();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }).start();
    }
}
