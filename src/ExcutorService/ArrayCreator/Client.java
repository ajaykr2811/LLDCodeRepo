package ExcutorService.ArrayCreator;

import ExcutorService.ArrayCreator.ArrayCreator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.Scanner;
import java.util.ArrayList;

class Client{
    public static void main(String agrs[]) throws Exception{
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ArrayCreator arrayCreator = new ArrayCreator(number);
        Future<ArrayList<Integer>> finalist = executorService.submit(arrayCreator);

        ArrayList<Integer> list = finalist.get();

        System.out.println(list);

        executorService.shutdown();
    }
}