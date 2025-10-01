package september.day160925;

import java.util.concurrent.*;

public class Main2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        long startTime = System.nanoTime();
        Future<Integer> future = executorService.submit(() ->{
            try {
                Thread.sleep(1000);
                return 42;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }});

        executorService.shutdown();

        System.out.println(future.get());

        long endTime = System.nanoTime();
        System.out.println("Time - "+ TimeUnit.NANOSECONDS.toMillis(endTime - startTime));
    }
}
