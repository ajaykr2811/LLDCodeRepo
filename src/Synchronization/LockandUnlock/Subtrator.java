package Synchronization.LockandUnlock;

import java.util.concurrent.locks.Lock;

public class Subtrator implements Runnable{
    Counter counter;
    Lock lock;

    public Subtrator(Counter counter,Lock lock){

        this.counter=counter;
        this.lock = lock;
    }

    @Override
    public void run(){
        for(int i=0;i<10000;i++){
            lock.lock();
            counter.count-=i;
            lock.unlock();
        }
    }

}
