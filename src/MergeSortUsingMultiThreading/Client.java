package MergeSortUsingMultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(6,5,7,4,8,3,-876,44,0,2,1);
        ExecutorService executorService = Executors.newCachedThreadPool();

        MergerSorter mergerSorter = new MergerSorter(list,executorService);

        Future<List<Integer>> listFuture = executorService.submit(mergerSorter);

        System.out.println(listFuture.get());

        executorService.shutdown();
    }
}
