package Synchronization.synchonizingMethod;

public class Counter {
    private int count;

    public synchronized void addCount(int value) {
        count+= value;
    }

    public int getCount(){
        return count;
    }
}
