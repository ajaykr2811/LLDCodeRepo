package MergeSortUsingMultiThreading;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergerSorter implements Callable<List<Integer>> {
    private ExecutorService executorService;
    private List<Integer> listToSort;

    public MergerSorter(List<Integer> listToSort,ExecutorService executorService){
        this.executorService = executorService;
        this.listToSort = listToSort;
    }

    @Override
    public List<Integer> call() throws Exception {
        int size = listToSort.size();
        if(size<=1){
            return listToSort;
        }

        List<Integer> leftHalf = new ArrayList<>();
        List<Integer> rightHalf = new ArrayList<>();

        for(int i=0;i<size/2;i++) leftHalf.add(listToSort.get(i));

        for(int i=size/2;i<size;i++) rightHalf.add(listToSort.get(i));

        MergerSorter leftMergeSorter = new MergerSorter(leftHalf,executorService);
        MergerSorter rightMergeSorter = new MergerSorter(rightHalf,executorService);

        Future<List<Integer>> leftSortedListFuture = executorService.submit(leftMergeSorter);
        Future<List<Integer>> rightSortedListFuture = executorService.submit(rightMergeSorter);

        leftHalf = leftSortedListFuture.get();
        rightHalf = rightSortedListFuture.get();

        List<Integer> sortedList = new ArrayList<>();
        int i = 0, j =0;

        while( i<leftHalf.size() && j<rightHalf.size()){
            if(leftHalf.get(i)<rightHalf.get(j)){
                sortedList.add(leftHalf.get(i));
                i++;
            }else{
                sortedList.add(rightHalf.get(j));
                j++;
            }
        }

        while(i<leftHalf.size()){
            sortedList.add(leftHalf.get(i++));
        }

        while(j<rightHalf.size()){
            sortedList.add(rightHalf.get(j++));
        }

        return sortedList;
    }
}
