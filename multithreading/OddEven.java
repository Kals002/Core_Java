package multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class OddEven
{
    public void display(IntPredicate predicate)
    {
        IntStream.rangeClosed(1, 10)
                .filter(predicate)
                .forEach(e -> {
                    try {
                        print(e);
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                });
    }
    public void print(int num) throws InterruptedException {
        synchronized(this)
        {
            System.out.println(Thread.currentThread().getName()+"  -  " +num);
            this.notify();
            this.wait();
        }

    }
    public static void main(String[] args) throws InterruptedException {
        OddEven oddEvenObj = new OddEven();

        IntPredicate even = e -> e % 2 ==0;
        IntPredicate odd = e -> e % 2 != 0;

        CompletableFuture.runAsync(() -> oddEvenObj.display(even));
        CompletableFuture.runAsync(() -> oddEvenObj.display(odd));

        Thread.sleep(1000);
    }
}
