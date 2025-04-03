package multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class CompletableFuture1
{
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //runAsync()
//        CompletableFuture<Void> cf1 = CompletableFuture.runAsync(() -> System.out.println("Hello"));
//
//        cf1.get();

        //supplyAsync()
//        CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> "Hello John");
//        System.out.println(cf.get());

        //thenApply  - takes function as argument

//        CompletableFuture<String> cf = CompletableFuture.supplyAsync(() ->
//        {
//            return "Hello";
//        }).thenApply(str -> str +"John");
//        System.out.println(cf.get());

        //thenAccept

//        StringBuilder sb = new StringBuilder("Hello john");
//        CompletableFuture.supplyAsync(() ->
//        {
//            return sb.reverse();
//
//        }).thenAccept(str -> sb.append(" How are you"));
//
//        System.out.println(sb);

        //thenCompose - run independent futures sequentially

//        CompletableFuture<String> cf = CompletableFuture.supplyAsync(() ->
//        {
//            return "Hello ";
//        }).thenCompose(e -> CompletableFuture.supplyAsync(() -> e + "John.."));
//
//        System.out.println(cf.get());
//
//        CompletableFuture.supplyAsync(() ->
//        {
//            callApi1();
//        }).thenCompose(previousResult -> CompletableFuture.supplyAsync(() -> previousResult + callApi2())).get();

        //thenCombine - run independent futures parallel

//        CompletableFuture<String> cf = CompletableFuture.supplyAsync(() ->
//        {
//            return "Hello--";
//        }).thenCombine(CompletableFuture.supplyAsync(() ->
//        {
//            return "john";
//        }), (a,b) -> a+b);
//
//        System.out.println(cf.get());

//        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> "Hello");
//        CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(() -> "John");
//        CompletableFuture<String> cf3 = CompletableFuture.supplyAsync(() -> "How");
//        CompletableFuture<String> cf4 = CompletableFuture.supplyAsync(() -> "are");
//        CompletableFuture<String> cf5 = CompletableFuture.supplyAsync(() -> "You");
//
//        Void cf11 = CompletableFuture.allOf(cf1, cf2, cf3, cf4, cf5).get();
//        System.out.println(cf11);
//        CompletableFuture<Object> cf =  CompletableFuture.anyOf(cf1, cf2, cf3, cf4, cf5);
//        System.out.println(cf.get());

        List<Integer> list = Arrays.asList(8, 1, 9, 22, 4, 81);

//        List<CompletableFuture<Integer>> list1 = list.stream()
//                .map(num -> CompletableFuture.supplyAsync(() ->
//                {
//                    return num + num;
//                })).toList();
//
//            list1.forEach(e -> {
//                try
//                {
//                    System.out.println(e.get());
//
//                } catch (InterruptedException | ExecutionException ex)
//                {
//                    throw new RuntimeException(ex);
//                }
//            });

        //handle

//        CompletableFuture<Object> cf1 = CompletableFuture.supplyAsync(() ->
//        {
//            int a = 10/0;
//            return "no error";
//        }).handle((r, e) ->
//        {
//            System.out.println(e);
//            return r;
//        });
//        System.out.println(cf1.get());

//        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() ->
//        {
//            int a = 10/2;
//            return "no error";
//        }).exceptionally(result ->
//        {
//            System.out.println(result);
//            return "no error";
//        });
//        System.out.println(cf1.get());

        //Timeout

//        CompletableFuture<String> cf = CompletableFuture.supplyAsync(() ->
//        {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            return "Hello";
//        }).completeOnTimeout("Timed out", (long) 2, TimeUnit.SECONDS);
//
//        System.out.println(cf.get());

        //thenCombine - practical usage

//        CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> callApi1())
//                .thenCombine(CompletableFuture.supplyAsync(() -> callApi2()),
//                        (result1, result2) -> result1+"\n"+result2);
//
//        System.out.println(cf.get());























    }

    private static String callApi2()
    {
        return "result of API 2";
    }

    private static String callApi1()
    {
        return "result of API 1";
    }
}
