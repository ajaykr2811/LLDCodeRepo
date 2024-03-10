package Synchronization.synchonizingMethod;

public class Adder implements Runnable{
    Counter counter;

    public Adder(Counter counter){
        this.counter=counter;
    }
    @Override
    public synchronized void run() {
        for(int i=0;i<10000;i++){
            counter.addCount(i);
        }
    }
}
