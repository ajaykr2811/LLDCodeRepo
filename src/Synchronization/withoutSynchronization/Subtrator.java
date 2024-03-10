package Synchronization.withoutSynchronization;

public class Subtrator implements Runnable{
    Counter counter;

    public Subtrator(Counter counter){
        this.counter=counter;
    }

    @Override
    public void run(){
        for(int i=0;i<10000;i++){
            counter.count-=i;
        }
    }

}
